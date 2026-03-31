import java.util.Scanner;

public class RockPaperScissors{

    // Generate computer choice
    static String getComputerChoice() {

        int choice = (int) (Math.random() * 3);

        if (choice == 0) return "rock";
        if (choice == 1) return "paper";
        return "scissors";
    }

    // Determine winner of a game
    static String findWinner(String userChoice, String computerChoice) {

        if (userChoice.equals(computerChoice)) {
            return "Draw";
        }

        if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
            (userChoice.equals("paper") && computerChoice.equals("rock")) ||
            (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return "User";
        }

        return "Computer";
    }

    // Calculate win statistics
    static String[][] calculateStatistics(int userWins, int computerWins, int totalGames) {

        String[][] stats = new String[2][3];

        double userPercentage = (userWins * 100.0) / totalGames;
        double computerPercentage = (computerWins * 100.0) / totalGames;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf(userPercentage);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.valueOf(computerPercentage);

        return stats;
    }

    // Display results
    static void displayResults(String[][] gameResults, String[][] stats) {

        System.out.println("\nGame Results");
        System.out.println("Game\tWinner");
        System.out.println("----------------");

        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i + 1) + "\t" + gameResults[i][0]);
        }

        System.out.println("\nStatistics");
        System.out.println("Player\tWins\tWinning %");
        System.out.println("----------------------------");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(
                    stats[i][0] + "\t" +
                    stats[i][1] + "\t" +
                    stats[i][2]
            );
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int totalGames = scanner.nextInt();
        scanner.nextLine();

        String[][] gameResults = new String[totalGames][1];

        int userWins = 0;
        int computerWins = 0;

        for (int i = 0; i < totalGames; i++) {

            System.out.print("Enter choice (rock/paper/scissors): ");
            String userChoice = scanner.nextLine().toLowerCase();

            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            gameResults[i][0] = winner;

            if (winner.equals("User")) userWins++;
            if (winner.equals("Computer")) computerWins++;
        }

        String[][] statistics = calculateStatistics(userWins, computerWins, totalGames);
        displayResults(gameResults, statistics);

        scanner.close();
    }
}
