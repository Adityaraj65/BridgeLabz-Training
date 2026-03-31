import java.util.ArrayList;
import java.util.List;

// Custom exception when book is not available
class BookNotAvailableException extends Exception {

    public BookNotAvailableException(String message) {
        super(message);
    }
}

// Represents a single book
class SimpleBook {

    private String title;
    private String author;
    private boolean available;

    public SimpleBook(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true; // default status
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    // Marks book as checked out
    public void checkout() throws BookNotAvailableException {
        if (!available) {
            throw new BookNotAvailableException("Book already checked out: " + title);
        }
        available = false;
    }

    // Displays book details
    public void display() {
        System.out.println(
                "Title: " + title +
                        " | Author: " + author +
                        " | Status: " + (available ? "Available" : "Checked Out")
        );
    }
}

// Handles library operations
class BookCatalogService {

    private List<SimpleBook> books;

    // Accepts array and stores in list
    public BookCatalogService(SimpleBook[] bookArray) {
        books = new ArrayList<>();
        for (SimpleBook book : bookArray) {
            books.add(book);
        }
    }

    // Displays all books
    public void displayAllBooks() {
        for (SimpleBook book : books) {
            book.display();
        }
    }

    // Searches books by partial title
    public List<SimpleBook> searchByTitle(String keyword) {

        List<SimpleBook> result = new ArrayList<>();

        for (SimpleBook book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }

    // Checks out a book by exact title
    public void checkoutBook(String title) throws BookNotAvailableException {

        for (SimpleBook book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.checkout();
                System.out.println("Book checked out successfully: " + title);
                return;
            }
        }

        System.out.println("Book not found: " + title);
    }
}

// Main application class
public class BookSearchCheckoutApp {

    public static void main(String[] args) {

        // Book data stored in array
        SimpleBook[] bookArray = {
                new SimpleBook("Core Java Concepts", "Ravi Kumar"),
                new SimpleBook("Clean Coding Practices", "Ankit Verma"),
                new SimpleBook("Data Structures Simplified", "Neha Sharma"),
                new SimpleBook("Object Oriented Programming", "Amitabh Singh"),
                new SimpleBook("Problem Solving with Java", "Suresh Iyer")
        };


        // Library already exists, service manages operations
        BookCatalogService libraryService = new BookCatalogService(bookArray);

        System.out.println("All Books:");
        libraryService.displayAllBooks();

        System.out.println("\nSearch Result for 'Java':");
        List<SimpleBook> foundBooks = libraryService.searchByTitle("Java");
        for (SimpleBook book : foundBooks) {
            book.display();
        }

        try {
            // Checkout flow
            libraryService.checkoutBook("Effective Java");
            libraryService.checkoutBook("Effective Java"); // will throw exception
        } catch (BookNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

