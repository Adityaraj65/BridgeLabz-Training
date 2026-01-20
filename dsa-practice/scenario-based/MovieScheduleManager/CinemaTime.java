package MovieScheduleManager;

import java.util.*;

class CinemaTime {

    private List<String> movieTitles = new ArrayList<>();
    private List<String> showTimes = new ArrayList<>();

    // Add movie
    public void addMovie(String title, String time) throws InvalidTimeFormatException {
        validateTime(time);
        movieTitles.add(title);
        showTimes.add(time);
    }

    // Search movie by keyword
    public void searchMovie(String keyword) {
        boolean found = false;

        try {
            for (int i = 0; i < movieTitles.size(); i++) {
                if (movieTitles.get(i).contains(keyword)) {
                    System.out.println(
                            String.format("Found: %s at %s",
                                    movieTitles.get(i), showTimes.get(i))
                    );
                    found = true;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index access while searching");
        }

        if (!found) {
            System.out.println("No movie found with keyword: " + keyword);
        }
    }

    // Display all movies
    public void displayAllMovies() {
        System.out.println("\n Movie Schedule:");
        for (int i = 0; i < movieTitles.size(); i++) {
            System.out.println(
                    movieTitles.get(i) + " | Time: " + showTimes.get(i)
            );
        }
    }

    // Generate printable report (List → Array)
    public void generateReport() {
        String[] titlesArray = movieTitles.toArray(new String[0]);
        String[] timesArray = showTimes.toArray(new String[0]);

        System.out.println("\n Printable Report:");
        for (int i = 0; i < titlesArray.length; i++) {
            System.out.println(titlesArray[i] + " @ " + timesArray[i]);
        }
    }

    // Time validation (HH:mm)
    private void validateTime(String time) throws InvalidTimeFormatException {
        if (!time.matches("\\d{2}:\\d{2}")) {
            throw new InvalidTimeFormatException("Invalid format: " + time);
        }

        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        if (hour > 23 || minute > 59) {
            throw new InvalidTimeFormatException("Invalid time value: " + time);
        }
    }
}

