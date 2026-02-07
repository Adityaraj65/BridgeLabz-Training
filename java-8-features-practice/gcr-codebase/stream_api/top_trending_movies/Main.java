package stream_api.top_trending_movies;
import java.util.*;
import java.util.stream.Collectors;

public class Main{

    public static void main(String[] args) {

        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Inception", 8.8, 2010));
        movies.add(new Movie("Interstellar", 8.6, 2014));
        movies.add(new Movie("Oppenheimer", 8.9, 2023));
        movies.add(new Movie("Dune Part Two", 8.7, 2024));
        movies.add(new Movie("Tenet", 7.8, 2020));
        movies.add(new Movie("The Batman", 8.2, 2022));
        movies.add(new Movie("Avatar 2", 7.9, 2022));
        movies.add(new Movie("Everything Everywhere All At Once", 8.1, 2022));

        List<Movie> top5Movies = movies.stream().sorted(Comparator.comparing(Movie::getRating).reversed()
                                        .thenComparing(Movie::getReleaseYear).reversed()).limit(5).collect(Collectors.toList());

        top5Movies.forEach(m ->
                System.out.println(m.getName() + " | " +
                        m.getRating() + " | " +
                        m.getReleaseYear())
        );
    }
}
