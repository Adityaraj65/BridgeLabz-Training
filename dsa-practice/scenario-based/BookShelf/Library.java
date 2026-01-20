package BookShelf;

import java.util.*;

class Library {

    // genre -> list of books
    private Map<String, LinkedList<Book>> catalog = new HashMap<>();

    // to avoid duplication
    private Set<String> uniqueBooks = new HashSet<>();

    // Add / Return a book
    public void addBook(String genre, String title, String author) {

        String bookKey = genre + ":" + title;

        if (uniqueBooks.contains(bookKey)) {
            System.out.println("Duplicate book not allowed: " + title);
            return;
        }

        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(new Book(title, author));
        uniqueBooks.add(bookKey);

        System.out.println("Book added: " + title);
    }

    // Borrow / Remove a book
    public void removeBook(String genre, String title) {

        LinkedList<Book> books = catalog.get(genre);

        if (books == null || books.isEmpty()) {
            System.out.println("No books found in genre: " + genre);
            return;
        }

        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.title.equals(title)) {
                iterator.remove();
                uniqueBooks.remove(genre + ":" + title);
                System.out.println("Book borrowed: " + title);
                return;
            }
        }

        System.out.println("Book not found: " + title);
    }

    // Print current catalog
    public void printCatalog() {
        System.out.println("\n Library Catalog:");
        for (String genre : catalog.keySet()) {
            System.out.println("Genre: " + genre);
            for (Book book : catalog.get(genre)) {
                System.out.println("  - " + book);
            }
        }
    }
}
