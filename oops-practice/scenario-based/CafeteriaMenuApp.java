import java.util.Scanner;

// Represents the cafeteria menu
class CafeteriaMenu {

    // Stores fixed menu items
    private String[] items;

    // Initializes menu items
    public CafeteriaMenu(String[] items) {
        this.items = items;
    }

    // Displays menu with index numbers
    public void displayMenu() {
        System.out.println("Today's Cafeteria Menu:");
        for (int i = 0; i < items.length; i++) {
            System.out.println(i + " -> " + items[i]);
        }
    }

    // Returns item based on index
    public String getItemByIndex(int index) {

        // Check if index is valid
        if (index < 0 || index >= items.length) {
            return "Invalid item selection";
        }
        return items[index];
    }
}

// Main application class
public class CafeteriaMenuApp {

    public static void main(String[] args) {

        // Fixed daily menu
        String[] menuItems = {
                "Idli",
                "Dosa",
                "Veg Sandwich",
                "Pav Bhaji",
                "Fried Rice",
                "Veg Noodles",
                "Samosa",
                "Poha",
                "Tea",
                "Coffee"
        };

        // Create menu object
        CafeteriaMenu menu = new CafeteriaMenu(menuItems);

        Scanner sc = new Scanner(System.in);

        // Show menu
        menu.displayMenu();

        // Take user choice
        System.out.print("Select item by index: ");
        int choice = sc.nextInt();

        // Display selected item
        System.out.println("You selected: " + menu.getItemByIndex(choice));

        sc.close();
    }
}
