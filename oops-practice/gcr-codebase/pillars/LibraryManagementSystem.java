package pillars;

// Handles reservation-related actions
interface Reservable {
    void reserveItem(String borrowerName);

    boolean checkAvailability();
}

// Common parent for all library items
abstract class LibraryItem {

    // Basic item details
    private String itemId;
    private String title;
    private String author;

    // Tracks whether item is available
    private boolean available = true;

    // Borrower info kept private for security
    private String borrowerName;

    // Initializes common fields
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Returns availability status
    public boolean isAvailable() {
        return available;
    }

    // Updates availability internally
    protected void setAvailable(boolean status) {
        this.available = status;
    }

    // Stores borrower name securely
    protected void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    // Displays item information
    public void getItemDetails() {
        System.out.println("Item ID : " + itemId);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println("Status  : " + (available ? "Available" : "Reserved"));
    }

    // Each item decides its own loan duration
    public abstract int getLoanDuration();
}

// Represents a book in the library
class Book extends LibraryItem implements Reservable {

    public Book(String id, String title, String author) {
        super(id, title, author);
    }

    // Books can be borrowed for 14 days
    @Override
    public int getLoanDuration() {
        return 14;
    }

    // Reserves the book if available
    @Override
    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            setBorrowerName(borrowerName);
            setAvailable(false);
        }
    }

    // Checks current availability
    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

// Represents a magazine
class Magazine extends LibraryItem implements Reservable {

    public Magazine(String id, String title, String author) {
        super(id, title, author);
    }

    // Magazines have shorter loan period
    @Override
    public int getLoanDuration() {
        return 7;
    }

    // Reserves magazine if free
    @Override
    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            setBorrowerName(borrowerName);
            setAvailable(false);
        }
    }

    // Checks availability status
    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

// Represents a DVD item
class DVD extends LibraryItem implements Reservable {

    public DVD(String id, String title, String author) {
        super(id, title, author);
    }

    // DVDs are issued for fewer days
    @Override
    public int getLoanDuration() {
        return 3;
    }

    // Reserves DVD if available
    @Override
    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            setBorrowerName(borrowerName);
            setAvailable(false);
        }
    }

    // Returns availability
    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

// Demonstrates polymorphism using LibraryItem reference
public class LibraryManagementSystem {

    public static void main(String[] args) {

        // Different item types stored in one array
        LibraryItem[] items = {
                new Book("B101", "Effective Java", "Joshua Bloch"),
                new Magazine("M201", "National Geographic", "Editorial Team"),
                new DVD("D301", "Inception", "Christopher Nolan")
        };

        // Same reference handles all item types
        for (LibraryItem item : items) {

            // Displays item details
            item.getItemDetails();

            // Calls overridden method dynamically
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            // Reservation handled via interface
            if (item instanceof Reservable) {
                ((Reservable) item).reserveItem("Aditya");
            }

            System.out.println("---------------------------");
        }
    }
}
