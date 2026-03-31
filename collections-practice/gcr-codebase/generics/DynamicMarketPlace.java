package generics;

import java.util.ArrayList;
import java.util.List;

interface Category {
    String getCategoryName();
}

//book category
enum BookCategory implements Category {
    FICTION, EDUCATIONAL, COMICS;

    public String getCategoryName() {
        return name();
    }
}

//clothing categories
enum ClothingCategory implements Category {
    MEN, WOMEN, KIDS;

    public String getCategoryName() {
        return name();
    }
}

//gadget categories
enum GadgetCategory implements Category {
    MOBILE, LAPTOP, ACCESSORY;

    public String getCategoryName() {
        return name();
    }
}

/*
 * Generic Product class
 * Category is restricted using bounded type
 */
class Product<T extends Category> {

    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDetails() {
        return "Product: " + name +
                ", Category: " + category.getCategoryName() +
                ", Price: " + price;
    }
}

//Utility class for product operations

class MarketplaceUtils {

    // Generic method with bounded type
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discount);
    }
}

//main class
public class DynamicMarketPlace {

    public static void main(String[] args) {

        // Different product types
        Product<BookCategory> book =
                new Product<>("Java Basics", 500, BookCategory.EDUCATIONAL);

        Product<ClothingCategory> shirt =
                new Product<>("T-Shirt", 1200, ClothingCategory.MEN);

        Product<GadgetCategory> phone =
                new Product<>("Smartphone", 25000, GadgetCategory.MOBILE);

        // Mixed catalog
        List<Product<?>> catalog = new ArrayList<>();
        catalog.add(book);
        catalog.add(shirt);
        catalog.add(phone);

        System.out.println("=== Before Discount ===");
        for (Product<?> p : catalog) {
            System.out.println(p.getDetails());
        }

        // Apply discounts
        MarketplaceUtils.applyDiscount(book, 10);
        MarketplaceUtils.applyDiscount(shirt, 20);
        MarketplaceUtils.applyDiscount(phone, 5);

        System.out.println("\n=== After Discount ===");
        for (Product<?> p : catalog) {
            System.out.println(p.getDetails());
        }
    }
}

