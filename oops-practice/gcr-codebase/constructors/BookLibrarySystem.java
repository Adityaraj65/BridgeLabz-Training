public class BookLibrarySystem {

	public static void main(String[] args) {
        EBook ebook = new EBook("5757574445", "jaya", "devadutt patnayak", 5.2);
        ebook.displayEBookDetails();

	}

}
class BookDetails{

    public String ISBN;
    protected String title;
    private String author;

    BookDetails(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Accessing private variable
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends BookDetails {

    double fileSize;

    EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN);        // public
        System.out.println("Title: " + title);      // protected
        System.out.println("Author: " + getAuthor()); // private via method
        System.out.println("File Size: " + fileSize + " MB");
    }
}