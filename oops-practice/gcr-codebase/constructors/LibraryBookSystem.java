
public class LibraryBookSystem {

	public static void main(String[] args) {
        LibraryBook book = new LibraryBook("Clean Code", "Robert C. Martin", 550);

        book.displayBook();
        book.borrowBook();
        book.borrowBook();  // second attempt
	}

}
class LibraryBook {
    String title;
    String author;
    double price;
    boolean isAvailable;

    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Sorry, book is not available.");
        }
    }

    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("Available: " + isAvailable);
        System.out.println();
    }
}
