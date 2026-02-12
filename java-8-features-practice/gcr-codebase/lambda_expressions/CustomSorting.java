package lambda_expressions;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomSorting {
    public static void main(String[] args) {
        // Storing the object of Product class into an ArrayList
        List<Product> products = new ArrayList<>();
        products.add(new Product("Phone", 800, 4.5, 10));
        products.add(new Product("Laptop", 1200, 4.8, 15));
        products.add(new Product("Headphones", 200, 4.2, 5));
        products.add(new Product("Smartwatch", 350, 4.1, 8));

        // Original list
        System.out.println("Original List : ");
        products.forEach(System.out::println);
        //sort by price
        System.out.println("----sort by price----");
        products.sort(Comparator.comparing(p->p.productPrice));
        products.forEach(System.out::println);
        //sort by rating
        System.out.println("-----sort by rating -----");
        products.sort(Comparator.comparing(p->p.productRating));
        products.forEach(System.out::println);
        //sort by discount
        System.out.println("----sort by discount------");
        products.sort(Comparator.comparing(p->p.discount));
        products.forEach(System.out::println);

    }
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
        return "Product Name : "+this.productName+"Price: " +this.productPrice + " Rating: " + this.productRating + " Discount: " + this.discount;
    }
}
