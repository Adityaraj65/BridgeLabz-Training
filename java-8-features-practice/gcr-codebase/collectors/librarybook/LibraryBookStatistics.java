package collectors.librarybook;

import java.util.*;
import java.util.stream.Collectors;
import java.util.IntSummaryStatistics;

public class LibraryBookStatistics {

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Book A", "Fiction", 300),
                new Book("Book B", "Fiction", 450),
                new Book("Book C", "Science", 500),
                new Book("Book D", "Science", 350),
                new Book("Book E", "History", 400)
        );
        Map<String, IntSummaryStatistics> statsByGenre =
                books.stream().collect(Collectors.groupingBy(Book::getGenre, Collectors.summarizingInt(Book::getPages)));
        // Print result
        for (Map.Entry<String, IntSummaryStatistics> entry : statsByGenre.entrySet()) {
            String genre = entry.getKey();
            IntSummaryStatistics stats = entry.getValue();
            System.out.println("Genre: " + genre);
            System.out.println("Total Pages: " + stats.getSum());
            System.out.println("Average Pages: " + stats.getAverage());
            System.out.println("Maximum Pages: " + stats.getMax());
            System.out.println();
        }
    }
}

