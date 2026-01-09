package linked_list;

// MovieNode class representing Information that node of Movie holding in the doubly linked list
class MovieNode {
    String title;                                                                   // Stores the title of the movie
    String director;                                                                // Stores the name of director of movie
    int year;                                                                       // Stores the year in which movie is released
    double rating;                                                                  // Stores the rating of movie
    MovieNode next, prev;

    // Constructor of MovieNode class to initialize variables
    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}

// Class to manage the doubly linked list of movies
class MovieManagement {
    MovieNode head = null, tail = null;
    int length = 0;                                                               // To track number of nodes

    // This method adds movie at beginning of the list
    public void addAtBeginning(MovieNode movie) {
        if (head == null) {
            head = tail = movie;
        } else {
            movie.next = head;
            head.prev = movie;
            head = movie;
        }
        length++;
        System.out.println("Movie added at beginning.");
    }

    // This method adds movie at end of the list
    public void addAtEnd(MovieNode movie) {
        if (tail == null) {
            head = tail = movie;
        } else {
            tail.next = movie;
            movie.prev = tail;
            tail = movie;
        }
        length++;
        System.out.println("Movie added at end.");
    }

    // This mehtod adds movie at a specific position (1-based indexing)
    public void addAtPosition(MovieNode movie, int index) {
        if (index <= 0 || index > length + 1) {
            System.out.println("Invalid position.");
            return;
        }
        if (index == 1) {
            addAtBeginning(movie);
        } else if (index == length + 1) {
            addAtEnd(movie);
        } else {
            MovieNode temp = head;
            for (int i = 1; i < index - 1; i++) {
                temp = temp.next;
            }
            movie.next = temp.next;
            movie.prev = temp;
            temp.next.prev = movie;
            temp.next = movie;
            length++;
            System.out.println("Movie added at position " + index + ".");
        }
    }

    // Remove movie by title
    public void removeByTitle(String title) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        MovieNode current = head;
        while (current != null && !current.title.equalsIgnoreCase(title)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Movie not found.");
            return;
        }

        if (current == head) {
            head = current.next;
            if (head != null) head.prev = null;
        } else if (current == tail) {
            tail = current.prev;
            if (tail != null) tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }

        length--; // Decrease length
        System.out.println("Movie removed: " + title);
        System.out.println("__________________________________________________");
    }

    // Search for movies by using director name
    public void searchByDirector(String director) {
        boolean found = false;
        MovieNode current = head;
        while (current != null) {
            if (current.director.equalsIgnoreCase(director)) {
                printMovie(current);
                found = true;
            }
            current = current.next;
        }
        if (!found) System.out.println("No movies found by director: " + director);
    }

    // Search for movies by rating
    public void searchByRating(double rating) {
        boolean found = false;
        MovieNode current = head;
        while (current != null) {
            if (current.rating == rating) {
                printMovie(current);
                found = true;
            }
            current = current.next;
        }
        if (!found) System.out.println("No movies found with rating: " + rating);
    }

    // Display all movies in forward order
    public void displayForward() {
        if (head == null) {
            System.out.println("No movies to display.");
            return;
        }
        System.out.println("\nMovies (Forward):");
        MovieNode current = head;
        while (current != null) {
            printMovie(current);
            current = current.next;
        }
        System.out.println("Total Movies: " + length);
    }

    // Display all movies in reverse order
    public void displayReverse() {
        if (tail == null) {
            System.out.println("No movies to display.");
            return;
        }
        System.out.println("\nMovies (Reverse):");
        MovieNode current = tail;
        while (current != null) {
            printMovie(current);
            current = current.prev;
        }
        System.out.println("Total Movies: " + length);
    }

    // Update rating of a movie by title
    public void updateRating(String title, double newRating) {
        MovieNode current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                System.out.println("Old Rating: " + current.rating);
                current.rating = newRating;
                System.out.println("Updated rating to " + newRating);
                return;
            }
            current = current.next;
        }
        System.out.println("Movie not found.");
    }

    // Helper function to print a movie's details
    private void printMovie(MovieNode node) {
        System.out.println("Title: " + node.title);
        System.out.println("Director: " + node.director);
        System.out.println("Year: " + node.year);
        System.out.println("Rating: " + node.rating);
        System.out.println("-----------------------------");
    }
}

// Main class to run the movie management system
public class MovieManagementSystem {
    public static void main(String[] args) {

        // Creating the object of MovieManagement class
        MovieManagement list = new MovieManagement();

        // Creating the 6 Objects of MovieNode class
        MovieNode movie1 = new MovieNode("Sholay", "Ramesh Sippy", 1975, 8.2);
        MovieNode movie2 = new MovieNode("Mr. India", "Shekhar Kapur", 1987, 7.8);
        MovieNode movie3 = new MovieNode("Qayamat Se Qayamat Tak", "Mansoor Khan", 1988, 7.6);
        MovieNode movie4 = new MovieNode("Tezaab", "N. Chandra", 1988, 7.4);
        MovieNode movie5 = new MovieNode("Don", "Chandra Barot", 1978, 7.7);
        MovieNode movie6 = new MovieNode("Namak Halaal", "Prakash Mehra", 1982, 7.4);


        // Connecting nodes with each other
        list.addAtBeginning(movie1);
        list.addAtEnd(movie2);
        list.addAtEnd(movie3);
        list.addAtBeginning(movie4);
        list.addAtPosition(movie5, 4);
        list.addAtPosition(movie6, 2);

        // Displaying the list of movie in forward direction
        list.displayForward();

        // Removing a movie by its title name
        list.removeByTitle("3 Idiots");

        // Searching the movie by using director name
        list.searchByDirector("Christopher Nolan");

        // Searching a movie with particular rating
        list.searchByRating(8.8);

        // Updating the rating of movie by using the title name
        list.updateRating("The Grand Budapest Hotel", 8.8);

        // Displaying the movie in reverse direction
        list.displayReverse();
    }
}
