package event_feedback_analyzer;

import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class EventUtil {
//    List<Integer>list=new ArrayList<>();
    Map<String,List<Integer>>map=new HashMap<>();
    public void addRating(String id ,int rating) throws InvalidRatingException{
        if(rating<1||rating>5){
            throw new InvalidRatingException("Rating must be between 1-5");
        }
        map.computeIfAbsent(id,k->new ArrayList<>()).add(rating);
    }
    public double getAverageRating(String eventId){
        List<Integer>rating=map.get(eventId);
        if(rating==null){
            return 0.0;
        }
        return rating.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }
    // Identify top-rated events
    public void printTopRatedEvents() {
        System.out.println("--- Top Rated Events ---");
        map.entrySet().stream()
                .sorted((e1, e2) -> Double.compare(getAverageRating(e2.getKey()), getAverageRating(e1.getKey())))
                .forEach(entry -> {
                    System.out.printf("Event: %s | Avg: %.2f\n", entry.getKey(), getAverageRating(entry.getKey()));
                });
    }
}
