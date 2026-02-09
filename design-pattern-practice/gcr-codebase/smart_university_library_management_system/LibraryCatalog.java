package smart_university_library_management_system;

import java.util.ArrayList;
import java.util.List;

// Singleton class
class LibraryCatalog {

    // Single instance
    private static LibraryCatalog instance;

    private List<Book> books;
    private List<Observer> observers;

    // Private constructor
    private LibraryCatalog() {
        books = new ArrayList<>();
        observers = new ArrayList<>();
    }

    // Thread-safe Singleton method
    public static synchronized LibraryCatalog getInstance() {
        if (instance == null) {
            instance = new LibraryCatalog();
        }
        return instance;
    }

    // Register observer
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Remove observer
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Add book and notify users
    public void addBook(Book book) {
        books.add(book);
        notifyObservers(book.getTitle());
    }

    // Notify all observers
    private void notifyObservers(String bookName) {
        for (Observer observer : observers) {
            observer.update("New book available: " + bookName);
        }
    }
}
