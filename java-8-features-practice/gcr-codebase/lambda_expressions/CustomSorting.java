package lambda_expressions;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomSorting {
    public static void main(String[] args) {
        // For sorting the list based on price
        SortingInterface sortOnPrice = (List<Product> products) -> {
            products.sort(Comparator.comparing(p -> p.productPrice));
        };

        // For sorting the list based on rating
        SortingInterface sortOnRating = (List<Product> products) -> {
            products.sort(Comparator.comparing(p -> p.productRating));
        };

        // For sorting the list based on discount
        SortingInterface sortOnDiscount = (List<Product> products) -> {
            products.sort(Comparator.comparing(p -> p.discount));
        };


        // Storing the object of Product class into an ArrayList
        List<Product> products = new ArrayList<>();
        products.add(new Product("Phone", 800, 4.5, 10));
        products.add(new Product("Laptop", 1200, 4.8, 15));
        products.add(new Product("Headphones", 200, 4.2, 5));
        products.add(new Product("Smartwatch", 350, 4.1, 8));

        // Original list
        System.out.println("Original List : ");
        products.forEach(System.out::println);

        // Invoking methods
        sortOnPrice.sort(products);
        System.out.println("Sorted by Price : ");
        products.forEach(System.out::println);
        sortOnRating.sort(products);
        System.out.println("Sorted by Rating : ");
        products.forEach(System.out::println);
        sortOnDiscount.sort(products);
        System.out.println("Sorted by Discount : ");
        products.forEach(System.out::println);
    }
}


interface SortingInterface{
    void sort(List<Product> list);
}


class Product{
    public String productName;                             // Stores the name of product
    public double productPrice;                           // Stores the price of product
    public double productRating;                          // Stores the rating of the product
    public double discount;                               // Stores the discount on that product

    // Constructor to initialize the instance variables
    public Product(String productName, double productPrice, double productRating, double discount) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productRating = productRating;
        this.discount = discount;
    }

    // toString method to represent Product object into String
    @Override
    public String toString() {
        return "Product Name : "+this.productName+"\n Price: " +this.productPrice + "\n Rating: " + this.productRating + "\n Discount: " + this.discount;
    }
}
