package linked_list;

// This program demonstrates inventory handling using a singly linked list
public class InventoryManagementSystem {
    public static void main(String[] args) {

        // Creating InventoryManager object
        InventoryManager list = new InventoryManager();

        // Creating item nodes with different inventory data
        ItemNode item1 = new ItemNode("Laptop", "LP9A12", 8, 55000);
        ItemNode item2 = new ItemNode("Wireless Mouse", "MS4K88", 30, 1200);
        ItemNode item3 = new ItemNode("Keyboard", "KB7Z91", 20, 2500);
        ItemNode item4 = new ItemNode("Monitor", "MN3X45", 10, 15000);
        ItemNode item5 = new ItemNode("USB Drive", "US6D20", 50, 900);
        ItemNode item6 = new ItemNode("Printer", "PR8M77", 5, 22000);

        // Adding nodes into the linked list
        list.addAtEnd(item1);
        list.addAtEnd(item2);
        list.addAtBeginning(item3);
        list.addAtIndex(item4, 1);
        list.addAtIndex(item5, 3);
        list.addAtBeginning(item6);

        // Searching inventory using Item ID
        list.searchByItemID("PR8M77");

        // Searching inventory using Item Name
        list.searchByItemName("USB Drive");

        // Displaying all inventory records
        list.display();

        // Removing an item using Item ID
        list.deleteByItemId("MN3X45");

        // Displaying records after deletion
        list.display();

        // Calculating total inventory worth
        list.totalValue();

        // Sorting inventory based on price
        list.sortList();

        // Display inventory after sorting
        list.display();
    }
}

// Node class that stores inventory item details
class ItemNode {
    String itemName;          // Name of the item
    String itemID;            // Unique identifier for item
    int quantity;             // Available stock count
    int price;                // Price per unit
    ItemNode next;            // Reference to next node

    // Constructor to initialize item properties
    ItemNode(String itemName, String itemID, int quantity, int price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.itemID = itemID;
        this.price = price;
        next = null;
    }
}

// Class responsible for managing inventory operations
class InventoryManager {
    ItemNode head = null;
    ItemNode tail = null;
    int size = 0;   // Keeps track of total nodes in list

    // Inserts an item at the start of the list
    public void addAtBeginning(ItemNode item) {
        item.next = head;
        head = item;
        size++;
    }

    // Inserts an item at the end of the list
    public void addAtEnd(ItemNode item) {
        if (head == null) {
            head = tail = item;
        } else {
            tail.next = item;
            tail = item;
        }
        size++;
    }

    // Inserts an item at a specific index
    public void addAtIndex(ItemNode item, int index) {
        if (index < 0 || index > size) {
            System.err.println("Invalid index");
        } else {
            ItemNode temp = head;
            if (index == 0) {
                addAtBeginning(item);
            } else if (index == size) {
                addAtEnd(item);
            } else {
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                item.next = temp.next;
                temp.next = item;
                size++;
            }
        }
    }

    // Deletes an item using Item ID
    public void deleteByItemId(String itemID) {
        ItemNode temp = head;

        if (head == null) {
            System.err.println("Inventory is empty");
        } else {
            if (head.itemID.equals(itemID)) {
                deleteAtHead();
                size--;
            } else {
                while (temp.next != null && !temp.next.itemID.equals(itemID)) {
                    temp = temp.next;
                }
                if (temp.next == null) {
                    System.err.println("Item not found");
                } else {
                    if (temp.next == tail) {
                        tail = temp;
                    }
                    temp.next = temp.next.next;
                    size--;
                }
            }
        }
    }

    // Removes the first node of the list
    private void deleteAtHead() {
        try {
            head = head.next;
        } catch (Exception e) {
            System.err.println("Deletion error");
        }
    }

    // Searches item using Item ID
    public void searchByItemID(String itemID) {
        ItemNode temp = head;
        while (temp != null && !temp.itemID.equals(itemID)) {
            temp = temp.next;
        }
        if (temp == null) {
            System.err.println("Item ID not found");
        } else {
            System.out.println("Item Found:");
            System.out.println("Name : " + temp.itemName);
            System.out.println("ItemID : " + temp.itemID);
            System.out.println("Price : " + temp.price);
            System.out.println("Quantity : " + temp.quantity);
            System.out.println("_______________________________________________");
        }
    }

    // Searches item using Item Name
    public void searchByItemName(String itemName) {
        ItemNode temp = head;
        while (temp != null && !temp.itemName.equals(itemName)) {
            temp = temp.next;
        }
        if (temp == null) {
            System.err.println("Item Name not found");
        } else {
            System.out.println("Item Found:");
            System.out.println("Name : " + temp.itemName);
            System.out.println("ItemID : " + temp.itemID);
            System.out.println("Price : " + temp.price);
            System.out.println("Quantity : " + temp.quantity);
            System.out.println("_______________________________________________");
        }
    }

    // Calculates total value of all inventory items
    public void totalValue() {
        double total = 0.0;
        ItemNode temp = head;
        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value : " + total);
        System.out.println("_______________________________________________");
    }

    // Displays complete inventory list
    public void display() {
        ItemNode temp = head;
        while (temp != null) {
            System.out.println("Item Name : " + temp.itemName);
            System.out.println("ItemID : " + temp.itemID);
            System.out.println("Quantity : " + temp.quantity);
            System.out.println("Price : " + temp.price);
            System.out.println("_______________________________________________");
            temp = temp.next;
        }
    }

    // Sorts inventory by price, then by item name
    public void sortList() {
        if (head == null || head.next == null) {
            return;
        }

        for (int i = 0; i < size - 1; i++) {
            ItemNode temp = head;
            ItemNode next = temp.next;

            for (int j = 0; j < size - i - 1; j++) {
                if (temp.price > next.price ||
                        (temp.price == next.price &&
                                temp.itemName.compareTo(next.itemName) > 0)) {

                    String name = temp.itemName;
                    String itemID = temp.itemID;
                    int quantity = temp.quantity;
                    int price = temp.price;

                    temp.itemName = next.itemName;
                    temp.itemID = next.itemID;
                    temp.quantity = next.quantity;
                    temp.price = next.price;

                    next.itemName = name;
                    next.itemID = itemID;
                    next.quantity = quantity;
                    next.price = price;
                }
                temp = next;
                next = next.next;
            }
        }
    }
}
