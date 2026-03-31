public class Leetcode707 {

    private Node head;
    private int size;

    public Leetcode707() {
        head = null;
        size = 0;
    }

    // -------- GET --------
    public int get(int index) {

        // Invalid index
        if (index < 0 || index >= size)
            return -1;

        Node temp = head;

        // Traverse to required index
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.val;
    }

    // -------- ADD AT HEAD --------
    public void addAtHead(int val) {

        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // -------- ADD AT TAIL --------
    public void addAtTail(int val) {

        Node newNode = new Node(val);

        // If list is empty
        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        Node temp = head;

        // Traverse to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        size++;
    }

    // -------- ADD AT INDEX --------
    public void addAtIndex(int index, int val) {

        // Invalid index
        if (index < 0 || index > size)
            return;

        // Insert at head
        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node newNode = new Node(val);
        Node temp = head;

        // Traverse to node before index
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    // -------- DELETE AT INDEX --------
    public void deleteAtIndex(int index) {

        // Invalid index
        if (index < 0 || index >= size)
            return;

        // Delete head
        if (index == 0) {
            head = head.next;
            size--;
            return;
        }

        Node temp = head;

        // Traverse to node before index
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        // Remove node
        temp.next = temp.next.next;
        size--;
    }

    // -------- NODE CLASS --------
    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // -------- MAIN METHOD (FOR ECLIPSE TESTING) --------
    public static void main(String[] args) {

        Leetcode707 list = new Leetcode707();

        // Add elements
        list.addAtHead(10);     // 10
        list.addAtTail(20);     // 10 -> 20
        list.addAtTail(30);     // 10 -> 20 -> 30
        list.addAtIndex(1, 15); // 10 -> 15 -> 20 -> 30

        // Print values using get()
        System.out.println("Value at index 0: " + list.get(0)); // 10
        System.out.println("Value at index 1: " + list.get(1)); // 15
        System.out.println("Value at index 2: " + list.get(2)); // 20
        System.out.println("Value at index 3: " + list.get(3)); // 30

        // Delete an element
        list.deleteAtIndex(2);  // remove 20 → 10 -> 15 -> 30

        // Print after deletion
        System.out.println("After deletion:");
        System.out.println("Value at index 0: " + list.get(0)); // 10
        System.out.println("Value at index 1: " + list.get(1)); // 15
        System.out.println("Value at index 2: " + list.get(2)); // 30
    }
}

