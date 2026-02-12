package event_feedback_analyzer;

import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        EventUtil analyzer = new EventUtil();
        try {
            analyzer.addRating("TECH_CONF", 5);
            analyzer.addRating("TECH_CONF", 4);
            analyzer.addRating("ART_EXPO", 3);

            // This will trigger the exception
            analyzer.addRating("MUSIC_FEST", 10);
        } catch (InvalidRatingException e) {
            System.err.println("Error: " + e.getMessage());
        }

        analyzer.printTopRatedEvents();
    }
}
