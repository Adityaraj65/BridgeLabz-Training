package class_and_object;

public class ShoppingCartSimulator {

	public static void main(String[] args) {
        CartItem cartItem = new CartItem("Laptop", 999.99, 1);

        cartItem.displayItem();
        cartItem.addItem(2);
        cartItem.removeItem(1);
        cartItem.displayTotalCost();

	}

}
//Class Definition
class CartItem {

 // Fields
 private String itemName;
 private double price;
 private int quantity;

 // Constructor
 public CartItem(String itemName, double price, int quantity) {
     this.itemName = itemName;
     this.price = price;
     this.quantity = quantity;
 }

 // Method to add items
 public void addItem(int qty) {
     quantity += qty;
     System.out.println("Added " + qty + " of " + itemName + " to the cart.");
 }

 // Method to remove items
 public void removeItem(int qty) {
     if (qty <= quantity) {
         quantity -= qty;
         System.out.println("Removed " + qty + " of " + itemName + " from the cart.");
     }
 }

 // Method to display total cost
 public void displayTotalCost() {
     double totalCost = price * quantity;
     System.out.println("Total cost: $" + totalCost);
 }

 // Method to display item details
 public void displayItem() {
     System.out.println("Item: " + itemName + ", Price: $" + price + ", Quantity: " + quantity);
 }
}

