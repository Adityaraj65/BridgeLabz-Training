public class LibraryManagementSystem {
    public static void main(String[] args) {

        // Creating Book object
        Book book1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");

        // Static method call
        Book.displayLibraryName();

        // Instance method call
        book1.displayBookDetails();
    }
}

// Book class
class Book {

    // STATIC variable (shared)
    static String libraryName = "Egmore Library";

    // Instance variables
    private String title;
    private String author;

    // FINAL variable 
    private final String isbn;

    // Constructor using THIS
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // STATIC method
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Instance method with INSTANCEOF check
    public void displayBookDetails() {

        // INSTANCEOF usage (explicit and meaningful)
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Invalid Book instance");
        }
    }
}
