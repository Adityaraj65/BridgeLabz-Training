package smart_university_library_management_system;
public class LibraryApp {

    public static void main(String[] args) {

        // Singleton: get single catalog instance
        LibraryCatalog catalog = LibraryCatalog.getInstance();

        // Factory: create users dynamically
        User student = UserFactory.createUser("student", "Aman");
        User faculty = UserFactory.createUser("faculty", "Dr. aditya");

        // Show roles
        student.showRole();
        faculty.showRole();

        // Observer: register users for notification
        catalog.addObserver(student);
        catalog.addObserver(faculty);

        // Builder: create book with optional fields
        Book book = new Book.BookBuilder("Design Patterns")
                .author("GoF")
                .edition("2nd Edition")
                .genre("Software Engineering")
                .publisher("Pearson")
                .build();

        // Adding book triggers notification
        catalog.addBook(book);
    }
}
