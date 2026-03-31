package ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private int orderId;
    private List<OrderItem> items;
    private boolean isPaid;

    public Order(int orderId) {
        this.orderId = orderId;
        this.items = new ArrayList<>();
        this.isPaid = false;
    }

    // add product to order
    public void addItem(Product product, int quantity) {
        items.add(new OrderItem(product, quantity));
    }

    // calculate total amount
    public double calculateTotal() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.getItemTotal();
        }
        return total;
    }

    // make payment (POLYMORPHISM)
    public void makePayment(Payment payment) throws PaymentFailedException {

        double amount = calculateTotal();

        if (amount <= 0) {
            throw new IllegalStateException("Order amount is invalid");
        }

        payment.pay(amount);
        isPaid = true;

        System.out.println("Order " + orderId + " payment successful");
    }

    // cancel order
    public void cancelOrder() {
        if (isPaid) {
            System.out.println("Cannot cancel a paid order");
        } else {
            System.out.println("Order " + orderId + " cancelled");
        }
    }

    // order status
    public void showOrderStatus() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Total Amount: " + calculateTotal());
        System.out.println("Payment Status: " + (isPaid ? "PAID" : "NOT PAID"));
    }
}
