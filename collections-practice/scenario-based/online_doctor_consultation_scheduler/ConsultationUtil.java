package online_doctor_consultation_scheduler;

import java.util.*;

public class ConsultationUtil {

    List<Consultations> appointmentlist = new ArrayList<>();
    Map<String, List<Doctors>> doctor = new HashMap<>();
    public void getAppointmentList(){
        for(Consultations c:appointmentlist){
            System.out.println(c.getPatientId());
            System.out.println(c.getPatientName());
            System.out.println(c.getSpecialization());
            c.getDoctor();
        }
    }
    // ADD DOCTOR
    public void addDoctors(Doctors d) {
        String specialization = d.getSpecialization();

        if (doctor.containsKey(specialization)) {
            doctor.get(specialization).add(d);
        } else {
            List<Doctors> list = new ArrayList<>();
            list.add(d);                  // ⭐ FIX
            doctor.put(specialization, list);
        }
    }

    //  BOOK APPOINTMENT
    public void bookAppointment(Consultations c)
            throws SlotUnavailableException {

        String specialization = c.getSpecialization();
        String slot = c.getSlot();

        // specialization exists or not
        if (!doctor.containsKey(specialization)) {
            throw new SlotUnavailableException("Doctor not available");
        }

        // get doctors list DIRECTLY (no iteration on map)
        List<Doctors> doctorsList = doctor.get(specialization);

        //  check each doctor
        for (Doctors d : doctorsList) {
            if (d.getSlot().equalsIgnoreCase(slot) && d.isAvailable) {
                d.doctorSlotBooked();// mark slot booked
                c.setDoctor(d);
                appointmentlist.add(c);  // save history
                System.out.println(
                        "Appointment booked with " + d.getDoctorName()
                );
                return;
            }
        }

        // if no doctor matched
        throw new SlotUnavailableException("Slot not available");
    }

}
