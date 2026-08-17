package day12.EnumAsTypeSafe;

public class SeasonM{

    public enum Season {
        WINTER("Cold"),
        SPRING("Mild"),
        SUMMER("Hot"),
        FALL("Cool");

        private final String description;

        Season(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    public static void main(String[] args) {

        System.out.println("All Seasons");
        for (Season season : Season.values()) {
            System.out.println(season.name() + ": " + season.getDescription());
        }

        System.out.println("\nSeason Messages ");
        
        for (Season season : Season.values()) {
            switch (season) {
                case SUMMER:
                    System.out.println(season + " -> Beach time! Stay hydrated in the heat.");
                    break;
                default:
                    System.out.println(season + " -> Regular season routines apply.");
                    break;
            }
        }
    }
}
