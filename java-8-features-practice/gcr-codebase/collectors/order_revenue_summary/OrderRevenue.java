package collectors.order_revenue_summary;

import java.util.*;
import java.util.stream.Collectors;

class Order {
    String customer;
    double amount;

    Order(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }
}

public class OrderRevenue {
    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order("Rohit", 2000),
                new Order("Anjali", 3000),
                new Order("Rohit", 2500)
        );

        Map<String, Double> revenue =
                orders.stream()
                        .collect(Collectors.groupingBy(
                                o -> o.customer,
                                Collectors.summingDouble(o -> o.amount)
                        ));

        System.out.println(revenue);
    }
}

