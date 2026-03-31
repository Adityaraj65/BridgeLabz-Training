package ParcelTracker;

public class ParcelTrackerMain {
    public static void main(String[] args) {

        ParcelTracker tracker = new ParcelTracker();

        tracker.trackParcel();

        tracker.addCheckpoint("Shipped", "Customs Check");
        tracker.trackParcel();

        tracker.markParcelLost("In Transit");
        tracker.trackParcel();
    }
}
