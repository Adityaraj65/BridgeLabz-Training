package generics;

import java.util.ArrayList;
import java.util.List;

/*
 * Base class for all warehouse items
 * Keeps common data in one place
 */
abstract class WarehouseItem {
    private String name;
    private double price;

    public WarehouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Each item explains itself differently
    public abstract String getDetails();
}

/*
 * Electronics item
 */
class Electronics extends WarehouseItem {
    private int warrantyYears;

    public Electronics(String name, double price, int warrantyYears) {
        super(name, price);
        this.warrantyYears = warrantyYears;
    }

    @Override
    public String getDetails() {
        return "Electronics -> " + getName() +
                ", Price: " + getPrice() +
                ", Warranty: " + warrantyYears + " years";
    }
}

/*
 * Grocery item
 */
class Groceries extends WarehouseItem {
    private String expiryDate;

    public Groceries(String name, double price, String expiryDate) {
        super(name, price);
        this.expiryDate = expiryDate;
    }

    @Override
    public String getDetails() {
        return "Groceries -> " + getName() +
                ", Price: " + getPrice() +
                ", Expiry: " + expiryDate;
    }
}

/*
 * Furniture item
 */
class Furniture extends WarehouseItem {
    private String material;

    public Furniture(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }

    @Override
    public String getDetails() {
        return "Furniture -> " + getName() +
                ", Price: " + getPrice() +
                ", Material: " + material;
    }
}

/*
 * Generic storage
 * Only allows WarehouseItem or its children
 */
class Storage<T extends WarehouseItem> {

    private List<T> items = new ArrayList<>();

    // Add item safely
    public void addItem(T item) {
        items.add(item);
    }

    // Get all items
    public List<T> getAllItems() {
        return items;
    }
}

/*
 * Utility class for common warehouse operations
 */
class WarehouseUtils {

    // Works with any type of WarehouseItem
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.getDetails());
        }
    }
}

/*
 * Main class - program starts here
 */
public class SmartWarehouse {

    public static void main(String[] args) {

        // Electronics storage
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 75000, 2));
        electronicsStorage.addItem(new Electronics("Mobile", 30000, 1));

        // Grocery storage
        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Rice", 1200, "2026-01-10"));
        groceriesStorage.addItem(new Groceries("Milk", 60, "2025-02-01"));

        // Furniture storage
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", 2500, "Wood"));
        furnitureStorage.addItem(new Furniture("Table", 8000, "Steel"));

        System.out.println("=== Electronics ===");
        WarehouseUtils.displayItems(electronicsStorage.getAllItems());

        System.out.println("\n=== Groceries ===");
        WarehouseUtils.displayItems(groceriesStorage.getAllItems());

        System.out.println("\n=== Furniture ===");
        WarehouseUtils.displayItems(furnitureStorage.getAllItems());
    }
}

