package linked_list;

// This program represents a library management system using a doubly linked list
public class LibraryManagementSystem {
    public static void main(String[] args) {

        // Creating LibraryManager object
        LibraryManager list = new LibraryManager();

        // Creating book nodes with imaginary Indian authors
        BookNode book1 = new BookNode("Shadows of Time", "Aarav Mehta", "Fiction", "BK201", "Yes");
        BookNode book2 = new BookNode("Code of Destiny", "Riya Kulkarni", "Technology", "BK202", "Yes");
        BookNode book3 = new BookNode("Paths Unwritten", "Kabir Malhotra", "Philosophy", "BK203", "Yes");
        BookNode book4 = new BookNode("The Silent Verdict", "Neha Saxena", "Thriller", "BK204", "Yes");
        BookNode book5 = new BookNode("Fragments of Thought", "Ishaan Verma", "Psychology", "BK205", "Yes");
        BookNode book6 = new BookNode("Beyond the Horizon", "Ananya Rao", "Inspirational", "BK206", "Yes");

        // Adding books into the doubly linked list
        list.addAtEnd(book1);
        list.addAtEnd(book2);
        list.addAtBeginning(book3);
        list.addAtIndex(book4, 1);
        list.addAtIndex(book5, 3);
        list.addAtBeginning(book6);

        // Searching book using its title
        list.searchByBookTitle("The Silent Verdict");

        // Searching book using author name
        list.searchByAuthorName("Riya Kulkarni");

        // Displaying all books from head to tail
        list.display();

        // Removing a book using its Book ID
        list.deleteByBookId("BK205");

        // Displaying all books from tail to head after deletion
        list.displayBackWard();

        // Displaying total number of books available
        list.totalBook();
    }
}

// BookNode class stores information of each book
class BookNode {
    String title;          // Book title
    String author;         // Author name
    String genre;          // Category of book
    String bookID;         // Unique book identifier
    String Availability;  // Availability status
    BookNode next;
    BookNode prev;

    // Constructor to initialize book data
    BookNode(String title , String author, String genre, String bookID, String Availability ) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookID = bookID;
        this.Availability = Availability;
        next = null;
        prev = null;
    }
}

// LibraryManager performs all linked list operations
class LibraryManager {
    BookNode head = null;
    BookNode tail = null;
    int size = 0;   // Keeps count of books in the list

    // Adds a book at the start of the list
    public void addAtBeginning(BookNode book) {
        book.next = head;
        head.prev = book;
        head = book;
        size++;
    }

    // Adds a book at the end of the list
    public void addAtEnd(BookNode book) {
        if (head == null) {
            head = tail = book;
        } else {
            tail.next = book;
            book.prev = tail;
            tail = book;
        }
        size++;
    }

    // Inserts a book at a given index
    public void addAtIndex(BookNode book, int index) {
        if (index < 0 || index > size) {
            System.err.println("Invalid index");
        } else {
            BookNode temp = head;
            if (index == 0) {
                addAtBeginning(book);
            } else if (index == size) {
                addAtEnd(book);
            } else {
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                book.next = temp.next;
                temp.next.prev = book;
                book.prev = temp;
                temp.next = book;
                size++;
            }
        }
    }

    // Deletes a book based on Book ID
    public void deleteByBookId(String bookID) {
        BookNode temp = head;

        if (head == null) {
            System.err.println("Empty List");
        } else {
            if (head.bookID.equals(bookID)) {
                deleteAtHead();
                size--;
            } else {
                while (temp.next != null && !temp.next.bookID.equals(bookID)) {
                    temp = temp.next;
                }
                if (temp.next == null) {
                    System.err.println("Record not found");
                } else {
                    if (temp.next == tail) {
                        temp.prev.next = null;
                        tail = temp.prev;
                        temp.prev = null;
                    }
                    temp.next.prev = null;
                    temp.next = temp.next.next;
                    temp.next.prev.next = null;
                    temp.next.prev = temp;
                    size--;
                }
            }
        }
    }

    // Removes the first book in the list
    private void deleteAtHead() {
        try {
            head = head.next;
            head.prev = null;
        } catch (Exception e) {
            System.err.println("Something went wrong");
        }
    }

    // Searches book using title
    public void searchByBookTitle(String title) {
        BookNode temp = head;
        while (temp != null && !temp.title.equals(title)) {
            temp = temp.next;
        }
        if (temp == null) {
            System.err.println("No Book Record found with this title");
        } else {
            System.out.println("Book Found:");
            System.out.println("Title : " + temp.title);
            System.out.println("BookID : " + temp.bookID);
            System.out.println("Author : " + temp.author);
            System.out.println("Availability : " + temp.Availability);
            System.out.println("Genre : " + temp.genre);
            System.out.println("__________________________________________________");
        }
    }

    // Searches book using author name
    public void searchByAuthorName(String author) {
        BookNode temp = head;
        while (temp != null && !temp.author.equals(author)) {
            temp = temp.next;
        }
        if (temp == null) {
            System.err.println("No Book Record found with this Author Name");
        } else {
            System.out.println("Book Found:");
            System.out.println("Title : " + temp.title);
            System.out.println("BookID : " + temp.bookID);
            System.out.println("Author : " + temp.author);
            System.out.println("Genre : " + temp.genre);
            System.out.println("Availability : " + temp.Availability);
            System.out.println("__________________________________________________");
        }
    }

    // Displays books from beginning to end
    public void display() {
        BookNode temp = head;
        System.out.println("Book Records (Forward Direction)");
        while (temp != null) {
            System.out.println("Title : " + temp.title);
            System.out.println("BookID : " + temp.bookID);
            System.out.println("Author : " + temp.author);
            System.out.println("Genre : " + temp.genre);
            System.out.println("Availability : " + temp.Availability);
            System.out.println("__________________________________________________");
            temp = temp.next;
        }
    }

    // Displays books from end to beginning
    public void displayBackWard() {
        BookNode temp = tail;
        System.out.println("Book Records (Backward Direction)");
        while (temp != null) {
            System.out.println("Title : " + temp.title);
            System.out.println("BookID : " + temp.bookID);
            System.out.println("Author : " + temp.author);
            System.out.println("Genre : " + temp.genre);
            System.out.println("Availability : " + temp.Availability);
            System.out.println("__________________________________________________");
            temp = temp.prev;
        }
    }

    // Prints total number of books
    public void totalBook(){
        System.out.println("Total Books in the list is " + size);
    }
}
