package online_doctor_consultation_scheduler;

public class Main {
    public static void main(String[] args) {

        Doctors d1 = new Doctors("D100","Aditya Raj","General Physician","9AM");
        Doctors d2 = new Doctors("D101","Anmol Singh","Heart Specialist","12PM");
        Doctors d3 = new Doctors("D102","Aman","General Physician","9AM");
        ConsultationUtil util = new ConsultationUtil();
        util.addDoctors(d1);
        util.addDoctors(d2);
        util.addDoctors(d3);
        Consultations c1 =
                new Consultations("Rahul","P101","9AM","General Physician");

        try {
            util.bookAppointment(c1);
        } catch (SlotUnavailableException e) {
            System.out.println(e.getMessage());
        }
        util.getAppointmentList();
    }
}
