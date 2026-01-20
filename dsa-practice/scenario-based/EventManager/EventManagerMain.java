package EventManager;

public class EventManagerMain {
    public static void main(String[] args) {

        int[] ticketPrices = {4500, 1200, 3000, 800, 1500, 6000, 2000};

        TicketPriceOptimizer.quickSort(ticketPrices, 0, ticketPrices.length - 1);

        System.out.println("Sorted Ticket Prices:");
        for (int price : ticketPrices) {
            System.out.print(price + " ");
        }

        System.out.println("\n\nTop 3 Cheapest Tickets:");
        for (int i = 0; i < 3; i++) {
            System.out.print(ticketPrices[i] + " ");
        }

        System.out.println("\n\nTop 3 Most Expensive Tickets:");
        for (int i = ticketPrices.length - 3; i < ticketPrices.length; i++) {
            System.out.print(ticketPrices[i] + " ");
        }
    }
}
