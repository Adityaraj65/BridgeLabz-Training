import java.util.Scanner;

public class Cards {

    // Method to initialize the deck of cards
    // Each card is stored as "Rank of Suit"
    static String[] initializeDeck(String[] suits, String[] ranks) {

        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;

        // Combine each rank with each suit
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index++] = ranks[j] + " of " + suits[i];
            }
        }
        return deck;
    }

    // Method to shuffle the deck of cards
    // Uses swapping with a random card from remaining deck
    static String[] shuffleDeck(String[] deck) {

        int n = deck.length;

        for (int i = 0; i < n; i++) {

            // Generate random index between i and n-1
            int randomCardNumber = i + (int) (Math.random() * (n - i));

            // Swap current card with random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    // Method to distribute n cards to x players
    // Returns a 2D array of players and their cards
    static String[][] distributeCards(String[] deck, int numberOfPlayers, int cardsPerPlayer) {

        int totalCardsRequired = numberOfPlayers * cardsPerPlayer;

        // Check if distribution is possible
        if (totalCardsRequired > deck.length) {
            return null;
        }

        String[][] players = new String[numberOfPlayers][cardsPerPlayer];

        int cardIndex = 0;

        // Distribute cards sequentially
        for (int i = 0; i < numberOfPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    // Method to print players and their cards
    static void printPlayersCards(String[][] players) {

        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + " cards:");

            for (int j = 0; j < players[i].length; j++) {
                System.out.println("  " + players[i][j]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Define suits and ranks
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        // Initialize deck
        String[] deck = initializeDeck(suits, ranks);

        // Shuffle deck
        deck = shuffleDeck(deck);

        // Take user inputs
        System.out.print("Enter number of players: ");
        int numberOfPlayers = scanner.nextInt();

        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = scanner.nextInt();

        // Distribute cards
        String[][] players = distributeCards(deck, numberOfPlayers, cardsPerPlayer);

        // Check distribution validity
        if (players == null) {
            System.out.println("Not enough cards to distribute.");
        } else {
            // Print players and their cards
            printPlayersCards(players);
        }

        scanner.close();
    }
}
