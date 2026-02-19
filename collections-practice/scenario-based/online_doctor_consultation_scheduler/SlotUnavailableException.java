package online_doctor_consultation_scheduler;

public class SlotUnavailableException extends Exception {
    public SlotUnavailableException(String message) {
        super(message);
    }
}
