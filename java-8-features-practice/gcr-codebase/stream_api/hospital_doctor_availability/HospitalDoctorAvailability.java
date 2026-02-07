package stream_api.hospital_doctor_availability;

import java.util.*;

public class HospitalDoctorAvailability {

    public static void main(String[] args) {

        List<Doctor> doctors = new ArrayList<>();

        doctors.add(new Doctor("Dr. Amit", "Cardiology", true));
        doctors.add(new Doctor("Dr. Neha", "Neurology", false));
        doctors.add(new Doctor("Dr. Raj", "Orthopedics", true));
        doctors.add(new Doctor("Dr. Priya", "Dermatology", true));
        doctors.add(new Doctor("Dr. Karan", "Cardiology", false));

        doctors.stream()
                // filter doctors available on weekends
                .filter(Doctor::isAvailableOnWeekend)
                // sort by specialty (alphabetically)
                .sorted(Comparator.comparing(Doctor::getSpecialty))
                // print result
                .forEach(d ->
                        System.out.println(
                                d.getName() + " | " + d.getSpecialty()
                        )
                );
    }
}

