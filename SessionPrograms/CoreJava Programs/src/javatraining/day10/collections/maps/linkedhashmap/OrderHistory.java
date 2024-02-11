package javatraining.day10.collections.maps.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class OrderHistory {
    private Map<Integer, Order> orderHistory = new LinkedHashMap<>();

    public void placeOrder(int orderId, Order order) {
        orderHistory.put(orderId, order);
    }

    public void displayHistory() {
        for (Map.Entry<Integer, Order> entry : orderHistory.entrySet()) {
            System.out.println("Order ID: " + entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        OrderHistory history = new OrderHistory();
        history.placeOrder(1001, new Order("Product A", 3, 150));
        history.placeOrder(1002, new Order("Product B", 2, 200));
        history.placeOrder(1003, new Order("Product C", 1, 50));

        history.displayHistory();
    }
}

class Order {
    String product;
    int quantity;
    double total;

    public Order(String product, int quantity, double total) {
        this.product = product;
        this.quantity = quantity;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Product: " + product + ", Quantity: " + quantity + ", Total: $" + total;
    }
}
