public class ShoppingCartSystem {
    public static void main(String[] args) {

        Product p1 = new Product("P001", "Laptop", 1200.0, 5);
        Product p2 = new Product("P002", "Smartphone", 800.0, 10);

        // Static method
        Product.updateDiscount(10.0);

        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();
    }
}

// Product class
class Product {

    // STATIC variable
    static double discount = 0.0;

    // FINAL variable
    private final String productID;

    // Instance variables
    private String productName;
    private double price;
    private int quantity;

    // Constructor using THIS
    Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // STATIC method
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // INSTANCEOF usage
    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");

            double finalPrice = price - (price * discount / 100);
            System.out.println("Price after Discount: $" + finalPrice);
        } else {
            System.out.println("Invalid Product instance");
        }
    }
}
