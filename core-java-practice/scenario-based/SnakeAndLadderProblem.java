public class SnakeAndLadderProblem {

    private static final int WINNING_POSITION = 100;

    public static void main(String[] args) {

        // UC1–UC6: Single player game
        game();

        System.out.println("--------------------------------");

        // UC7: Two player game
        gameWith2Player();
    }

    
    //UC1   Player starts from position 0
   
    public static int startPosition() {
        return 0;
    }

    //    UC2 Roll the dice to get a number between 1 and 6
    
    public static int dieRoll() {
        return (int) (Math.random() * 6) + 1;
    }

   
    //    Check the option 0 -> No Play 1 -> Ladder 2 -> Snake
   
    public static int optionsCheck() {
        return (int) (Math.random() * 3);
    }

    //    Single player game logic
    public static void game() {

        int currPosition = startPosition();
        int diceRollCount = 0;

        System.out.println("Single Player Game Started");
        System.out.println("Player starts at position 0");

        while (currPosition < WINNING_POSITION) {

            int diceValue = dieRoll();   // UC2
            diceRollCount++;

            int option = optionsCheck(); // UC3
            int previousPosition = currPosition;

            if (option == 0) {
                // No Play
                System.out.println("\nNo Play");
            } 
            else if (option == 1) {
                // Ladder
                System.out.println("\nLadder");
                currPosition += diceValue;
            } 
            else {
                // Snake
                System.out.println("\nSnake");
                currPosition -= diceValue;
            }

            // UC4: Reset if position goes below 0
            if (currPosition < 0) {
                currPosition = 0;
            }

            // UC5: Ensure exact 100
            if (currPosition > WINNING_POSITION) {
                currPosition = previousPosition;
            }

            // UC6: Print position and dice count
            System.out.println("Dice rolled: " + diceValue);
            System.out.println("Current position: " + currPosition);
            System.out.println("Total dice rolls: " + diceRollCount);
        }

        System.out.println("\nSingle player reached position 100");
    }

    //   UC 7 Two player game
    public static void gameWith2Player() {

        int player1Position = startPosition();
        int player2Position = startPosition();
        boolean isPlayer1Turn = true;

        System.out.println("Two Player Game Started");

        while (player1Position < WINNING_POSITION &&
               player2Position < WINNING_POSITION) {

            int diceValue = dieRoll();
            int option = optionsCheck();

            if (isPlayer1Turn) {

                int previousPosition = player1Position;
                System.out.println("\nPlayer 1 rolled: " + diceValue);

                if (option == 0) {
                    System.out.println("Player 1: No Play");
                    isPlayer1Turn = false;

                } else if (option == 1) {
                    System.out.println("Player 1: Ladder");
                    player1Position += diceValue;

                } else {
                    System.out.println("Player 1: Snake");
                    player1Position -= diceValue;
                    isPlayer1Turn = false;
                }

                if (player1Position < 0) {
                    player1Position = 0;
                }

                if (player1Position > WINNING_POSITION) {
                    player1Position = previousPosition;
                }

                System.out.println("Player 1 position: " + player1Position);

            } else {

                int previousPosition = player2Position;
                System.out.println("\nPlayer 2 rolled: " + diceValue);

                if (option == 0) {
                    System.out.println("Player 2: No Play");
                    isPlayer1Turn = true;

                } else if (option == 1) {
                    System.out.println("Player 2: Ladder");
                    player2Position += diceValue;

                } else {
                    System.out.println("Player 2: Snake");
                    player2Position -= diceValue;
                    isPlayer1Turn = true;
                }

                if (player2Position < 0) {
                    player2Position = 0;
                }

                if (player2Position > WINNING_POSITION) {
                    player2Position = previousPosition;
                }

                System.out.println("Player 2 position: " + player2Position);
            }
        }

        if (player1Position == WINNING_POSITION) {
            System.out.println("\nPlayer 1 won the game");
        } else {
            System.out.println("\nPlayer 2 won the game");
        }
    }
}
