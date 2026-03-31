package streambuzz;
import java.util.*;
import java.util.*;

public class Program {

    // Register creator
    public void RegisterCreator(CreatorStats record) {
        CreatorStats.EngagementBoard.add(record);
    }

//    Count high-performing weeks
    public Map<String, Integer> GetTopPostCounts(List<CreatorStats> records, double likeThreshold) {

        Map<String, Integer> result = new LinkedHashMap<>();

        for (CreatorStats creator : records) {
            int count = 0;

            for (double likes : creator.WeeklyLikes) {
                if (likes >= likeThreshold) {
                    count++;
                }
            }

            if (count > 0) {
                result.put(creator.CreatorName, count);
            }
        }

        return result;
    }

    // Calculate average likes
    public double CalculateAverageLikes() {

        double total = 0;
        int weeks = 0;

        for (CreatorStats c : CreatorStats.EngagementBoard) {
            for (double likes : c.WeeklyLikes) {
                total += likes;
                weeks++;
            }
        }

        return weeks == 0 ? 0 : total / weeks;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Program p = new Program();

        while (true) {
            System.out.println("1. Register Creator");
            System.out.println("2. Show Top Posts");
            System.out.println("3. Calculate Average Likes");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    CreatorStats c = new CreatorStats();

                    System.out.println("Enter Creator Name:");
                    c.CreatorName = sc.nextLine();

                    c.WeeklyLikes = new double[4];
                    System.out.println("Enter weekly likes (Week 1 to 4):");

                    for (int i = 0; i < 4; i++) {
                        c.WeeklyLikes[i] = sc.nextDouble();
                    }
                    sc.nextLine();

                    p.RegisterCreator(c);
                    System.out.println("Creator registered successfully\n");
                    break;

                case 2:
                    System.out.println("Enter like threshold:");
                    double threshold = sc.nextDouble();
                    sc.nextLine();

                    Map<String, Integer> map =
                            p.GetTopPostCounts(CreatorStats.EngagementBoard, threshold);

                    if (map.isEmpty()) {
                        System.out.println("No top-performing posts this week");
                    } else {
                        for (Map.Entry<String, Integer> entry : map.entrySet()) {
                            System.out.println(entry.getKey() + " - " + entry.getValue());
                        }
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Overall average weekly likes: "
                            + (int) p.CalculateAverageLikes());
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Logging off - Keep Creating with StreamBuzz!");
                    return;

                default:
                    System.out.println("Invalid choice\n");
            }
        }
    }
}



