package TrafficManager;

public class CircularRoundabout {
    private VehicleNode head = null;

    // Add vehicle
    public void addVehicle(String vehicleNumber) {
        VehicleNode newNode = new VehicleNode(vehicleNumber);

        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }

        VehicleNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // Remove vehicle
    public void removeVehicle(String vehicleNumber) {
        if (head == null) {
            System.out.println("Roundabout is empty!");
            return;
        }

        VehicleNode curr = head, prev = null;

        do {
            if (curr.vehicleNumber.equals(vehicleNumber)) {
                if (curr == head && curr.next == head) {
                    head = null;
                } else {
                    if (curr == head) {
                        head = head.next;
                    }
                    if (prev != null) {
                        prev.next = curr.next;
                    }
                }
                System.out.println("Vehicle removed: " + vehicleNumber);
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Vehicle not found!");
    }

    // Print state
    public void printRoundabout() {
        if (head == null) {
            System.out.println("Roundabout is empty.");
            return;
        }

        VehicleNode temp = head;
        System.out.print("Roundabout Vehicles: ");
        do {
            System.out.print(temp.vehicleNumber + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to start)");
    }
}

