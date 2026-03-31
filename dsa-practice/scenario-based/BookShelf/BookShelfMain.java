package BookShelf;

public class BookShelfMain {
    public static void main(String[] args) {

        Library library = new Library();

        library.addBook("Fiction", "1984", "George Orwell");
        library.addBook("Fiction", "Animal Farm", "George Orwell");
        library.addBook("Science", "A Brief History of Time", "Stephen Hawking");

        library.addBook("Fiction", "1984", "George Orwell"); // Duplicate

        library.printCatalog();

        library.removeBook("Fiction", "1984");
        library.removeBook("Science", "Unknown Book");

        library.printCatalog();
    }
}

