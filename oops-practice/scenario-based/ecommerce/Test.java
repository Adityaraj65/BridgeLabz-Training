package ecommerce;

public class Test {

    public static void main(String[] args) {

        try {
            // Create product service
            ProductService productService = new ProductService();

            // Create products
            Product p1 = new Product(1, "Laptop", 50000);
            Product p2 = new Product(2, "Mouse", 500);

            // Add products
            productService.addProduct(p1);
            productService.addProduct(p2);

            // Display products
            System.out.println("---- Product List ----");
            productService.displayAllProduct();

            // Create customer
            Customer customer = new Customer(101, "Aditya", 22, "9876543210");
            System.out.println("---- Customer Details ----");
            customer.displayCustomerDetails();

            // Create order
            Order order = new Order(1001);
            order.addItem(p1, 1);
            order.addItem(p2, 2);

            // Show order before payment
            System.out.println("---- Order Before Payment ----");
            order.showOrderStatus();

            // Choose payment method
            Payment payment = new CardPayment();
            // Payment payment = new UpiPayment();

            // Make payment
            order.makePayment(payment);

            // Show order after payment
            System.out.println("---- Order After Payment ----");
            order.showOrderStatus();

            // Try cancelling order
            order.cancelOrder();

        } catch (PaymentFailedException e) {
            System.out.println("Payment failed: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

