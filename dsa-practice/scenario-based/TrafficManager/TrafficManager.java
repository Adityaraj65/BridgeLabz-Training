package TrafficManager;

public class TrafficManager {
    public static void main(String[] args) {

        CircularRoundabout roundabout = new CircularRoundabout();
        VehicleQueue waitingQueue = new VehicleQueue(3);

        // Vehicles arrive
        waitingQueue.enqueue("KA01");
        waitingQueue.enqueue("KA02");
        waitingQueue.enqueue("KA03");
        waitingQueue.enqueue("KA04"); // Overflow

        // Move vehicles into roundabout
        while (!waitingQueue.isEmpty()) {
            String vehicle = waitingQueue.dequeue();
            if (vehicle != null) {
                roundabout.addVehicle(vehicle);
            }
        }

        roundabout.printRoundabout();

        // Remove a vehicle
        roundabout.removeVehicle("KA02");
        roundabout.printRoundabout();
    }
}

