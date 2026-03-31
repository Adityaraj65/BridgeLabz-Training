public class LibraryManagementSystem {
    public static void main(String[] args) {

        // Step 1: Create Book objects
        Book b1 = new Book("Harry Potter", "J.K. Rowling", true);
        Book b2 = new Book("Clean Code", "Robert Martin", true);
        Book b3 = new Book("Java Basics", "James Gosling", false);

        // Step 2: Store books in an array
        Book[] books = {b1, b2, b3};

        // Step 3: Create Library object and pass book array
        Library library = new Library(books);

        // Step 4: Display all books
        System.out.println("---- All Books ----");
        library.displayBooks();

        // Step 5: Search by partial title
        System.out.println("---- Search Result ----");
        library.searchByTitle("har");

        // Step 6: Checkout a book
        System.out.println("---- Checkout Book ----");
        library.checkoutBook("Clean Code");

        // Step 7: Display books after checkout
        System.out.println("---- Books After Checkout ----");
        library.displayBooks();
    }
}

class Book {
    String title;
    String author;
    boolean isAvailable;

    Book(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }
}

class Library {

    // Array to store multiple Book objects
    Book[] books;

    // Constructor initializes the array
    Library(Book[] books) {
        this.books = books;
    }

    // Method to display all book details
    public void displayBooks() {

        for (int i = 0; i < books.length; i++) {

            Book b = books[i];

            System.out.println("Title  : " + b.title);
            System.out.println("Author : " + b.author);

            if (b.isAvailable) {
                System.out.println("Status : Available");
            } else {
                System.out.println("Status : Checked Out");
            }

            System.out.println("--------------------");
        }
    }

    // Method to search book by partial title
    public void searchByTitle(String keyword) {

        boolean found = false;
        keyword = keyword.toLowerCase();

        for (int i = 0; i < books.length; i++) {

            Book b = books[i];

            if (b.title.toLowerCase().contains(keyword)) {

                System.out.println("Title  : " + b.title);
                System.out.println("Author : " + b.author);
                System.out.println("Status : " +
                        (b.isAvailable ? "Available" : "Checked Out"));
                System.out.println("--------------------");

                found = true;
            }
        }

        if (!found) {
            System.out.println("No books found matching the title.");
        }
    }

    // Method to checkout a book
    public void checkoutBook(String title) {

        title = title.toLowerCase();

        for (int i = 0; i < books.length; i++) {

            Book b = books[i];

            if (b.title.toLowerCase().equals(title)) {

                if (b.isAvailable) {
                    b.isAvailable = false;
                    System.out.println("Book checked out successfully.");
                } else {
                    System.out.println("Book is already checked out.");
                }
                return;
            }
        }

        System.out.println("Book not found in the library.");
    }
}
