package inheritance;

public class RetailOrderManagement {
     public static void main(String[] args) {

        // Creating a delivered order
        DeliveredOrder order = new DeliveredOrder(
                "ORD101",
                "10-01-2026",
                "TRK98765",
                "15-01-2026"
        );

        // Showing full order details
        order.displayOrderDetails();

        // Showing current order status
        System.out.println("Order Status : " + order.getOrderStatus());

        ShippedOrder order2 = new ShippedOrder(
        "ORD102",
        "11-01-2026", "TRK12345");

    System.out.println("-----------------------");
        order2.displayOrderDetails();
        System.out.println(order2.getOrderStatus());
    }
}

// Base class for all orders
class Order {

    // Basic order details
    String orderId;
    String orderDate;

    // Set order id and date
    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Initial status of any order
    String getOrderStatus() {
        return "Order Placed";
    }

    // Print basic order info
    void displayOrderDetails() {
        System.out.println("Order ID   : " + orderId);
        System.out.println("Order Date : " + orderDate);
    }
}

// Order that has been shipped
class ShippedOrder extends Order {

    // Tracking number after shipping
    String trackingNumber;

    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    // Status after shipping
    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }

    // Show order details with tracking info
    @Override
    void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Tracking No : " + trackingNumber);
    }
}

// Order that has been delivered
class DeliveredOrder extends ShippedOrder {

    // Date when order is delivered
    String deliveryDate;

    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Final status of order
    @Override
    String getOrderStatus() {
        return "Order Delivered";
    }

    // Show complete order details
    @Override
    void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Date : " + deliveryDate);
    } 
}
