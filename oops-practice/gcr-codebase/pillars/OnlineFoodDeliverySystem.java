package pillars;

// Handles discount-related actions
interface Discountable {
    void applyDiscount(double percent);

    String getDiscountDetails();
}

// Common base for all food items
abstract class FoodItem {

    private String itemName;
    protected double price;
    protected int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Displays item info
    public void getItemDetails() {
        System.out.println(itemName + " | Qty: " + quantity + " | Price: ₹" + price);
    }

    // Each item calculates its own total
    public abstract double calculateTotalPrice();
}

// Represents vegetarian food
class VegItem extends FoodItem implements Discountable {

    private double discount;

    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    // No extra charges for veg
    @Override
    public double calculateTotalPrice() {
        return (price * quantity) - discount;
    }

    // Applies discount
    @Override
    public void applyDiscount(double percent) {
        discount = (price * quantity) * percent / 100;
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Discount Applied";
    }
}

// Represents non-veg food
class NonVegItem extends FoodItem {

    private static final double EXTRA_CHARGE = 50;

    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    // Includes extra non-veg charge
    @Override
    public double calculateTotalPrice() {
        return (price * quantity) + EXTRA_CHARGE;
    }
}

// Demonstrates polymorphism
class OnlineFoodDeliverySystem {
    public static void main(String[] args) {

        FoodItem[] order = {
                new VegItem("Paneer Burger", 120, 2),
                new NonVegItem("Chicken Pizza", 250, 1)
        };

        for (FoodItem item : order) {
            item.getItemDetails();
            System.out.println("Total: ₹" + item.calculateTotalPrice());
        }
    }
}

