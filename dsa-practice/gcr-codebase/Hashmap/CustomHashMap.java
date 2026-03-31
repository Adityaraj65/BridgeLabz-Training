package Hashmap;

public class CustomHashMap {

    // Node class for linked list
    static class Node {
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    // Size of hash table
    private static final int SIZE = 10;

    // Array of linked lists
    private Node[] table;

    public CustomHashMap() {
        table = new Node[SIZE];
    }

    // Hash function
    private int hash(int key) {
        return key % SIZE;
    }

    // Insert or update value
    public void put(int key, int value) {

        int index = hash(key);
        Node head = table[index];

        // Check if key already exists
        while (head != null) {
            if (head.key == key) {
                head.value = value; // update value
                return;
            }
            head = head.next;
        }

        // Insert new node at beginning
        Node newNode = new Node(key, value);
        newNode.next = table[index];
        table[index] = newNode;
    }

    // Get value using key
    public int get(int key) {

        int index = hash(key);
        Node head = table[index];

        // Search in linked list
        while (head != null) {
            if (head.key == key) {
                return head.value;
            }
            head = head.next;
        }

        return -1; // key not found
    }

    // Remove key-value pair
    public void remove(int key) {

        int index = hash(key);
        Node head = table[index];
        Node prev = null;

        while (head != null) {
            if (head.key == key) {
                if (prev == null) {
                    table[index] = head.next;
                } else {
                    prev.next = head.next;
                }
                return;
            }
            prev = head;
            head = head.next;
        }
    }

    // Test the custom hash map
    public static void main(String[] args) {

        CustomHashMap map = new CustomHashMap();

        map.put(1, 10);
        map.put(11, 20); // collision case
        map.put(2, 30);

        System.out.println(map.get(1));  // 10
        System.out.println(map.get(11)); // 20

        map.remove(1);
        System.out.println(map.get(1));  // -1
    }
}

