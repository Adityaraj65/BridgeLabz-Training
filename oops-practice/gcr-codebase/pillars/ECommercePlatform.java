package pillars;

import java.util.ArrayList;
import java.util.List;


interface Taxable {

    // Calculates tax amount for the product
    double calculateTax();

    // Returns tax description/details
    String getTaxDetails();
}

//abstract class
abstract class Product {

    // ENCAPSULATION:
    // Fields are private so they cannot be modified directly
    private int productId;
    private String name;
    private double price;

    // Constructor to initialize common product data
    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    //abstract method
    abstract double calculateDiscount();

    /*
     * Getter methods (read-only access)
     */
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    /*
     * Setter method
     * This is the ONLY allowed way to update price
     */
    public void setPrice(double price) {
        this.price = price;
    }
}


class Electronics extends Product implements Taxable {

    Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    // 10% discount on electronics
    @Override
    double calculateDiscount() {
        return getPrice() * 0.10;
    }

    // 18% tax
    @Override
    public double calculateTax() {
        return getPrice() * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "GST @18%";
    }
}

//clothing class
class Clothing extends Product implements Taxable {

    Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    // 20% discount
    @Override
    double calculateDiscount() {
        return getPrice() * 0.20;
    }

    // 12% tax
    @Override
    public double calculateTax() {
        return getPrice() * 0.12;
    }

    @Override
    public String getTaxDetails() {
        return "GST @12%";
    }
}


class Groceries extends Product {

    Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    // Flat 5% discount
    @Override
    double calculateDiscount() {
        return getPrice() * 0.05;
    }
}


class PriceCalculator {


    static void printFinalPrices(List<Product> products) {

        for (Product p : products) {

            double tax = 0;


            if (p instanceof Taxable) {
                Taxable t = (Taxable) p; // type casting
                tax = t.calculateTax();
            }

            double discount = p.calculateDiscount();

            // Final price formula
            double finalPrice = p.getPrice() + tax - discount;

            System.out.println("Product : " + p.getName());
            System.out.println("Base Price : " + p.getPrice());
            System.out.println("Discount   : " + discount);
            System.out.println("Tax        : " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("----------------------------");
        }
    }
}


//MAIN CLASS

public class ECommercePlatform {

    public static void main(String[] args) {

        // List of Product (POLYMORPHISM)
        List<Product> productList = new ArrayList<>();

        productList.add(new Electronics(101, "Laptop", 60000));
        productList.add(new Clothing(102, "Jacket", 3000));
        productList.add(new Groceries(103, "Rice Bag", 1200));

        // One method works for all product types
        PriceCalculator.printFinalPrices(productList);
    }
}
