package ParcelTracker;

class ParcelTracker {

    private StageNode head;

    // Initialize default stages
    public ParcelTracker() {
        head = new StageNode("Packed");
        head.next = new StageNode("Shipped");
        head.next.next = new StageNode("In Transit");
        head.next.next.next = new StageNode("Delivered");
    }

    // Forward tracking
    public void trackParcel() {
        if (head == null) {
            System.out.println("Parcel lost! No tracking available.");
            return;
        }

        StageNode temp = head;
        System.out.print("Parcel Status: ");
        while (temp != null) {
            System.out.print(temp.stage + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Add intermediate checkpoint
    public void addCheckpoint(String afterStage, String newStage) {
        StageNode temp = head;

        while (temp != null && !temp.stage.equals(afterStage)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Stage not found: " + afterStage);
            return;
        }

        StageNode newNode = new StageNode(newStage);
        newNode.next = temp.next;
        temp.next = newNode;

        System.out.println("Checkpoint added: " + newStage);
    }

    // Simulate lost parcel
    public void markParcelLost(String stage) {
        StageNode temp = head;

        while (temp != null && temp.next != null) {
            if (temp.next.stage.equals(stage)) {
                temp.next = null; // break chain
                System.out.println("Parcel lost after stage: " + stage);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Stage not found to mark loss");
    }
}
