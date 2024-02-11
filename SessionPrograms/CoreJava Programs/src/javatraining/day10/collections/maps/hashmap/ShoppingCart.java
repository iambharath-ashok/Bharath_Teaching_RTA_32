package javatraining.day10.collections.maps.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    public static void main(String[] args) {
        Map<String, Integer> cart = new HashMap<>();

        cart.put("Apple", 3);
        cart.put("Banana", 2);
        cart.put("Orange", 4);

        // Adding more items to the cart
        //From Java 8
        cart.put("Apple", cart.getOrDefault("Apple", 120) + 2);


        //Before Java 8 Code
        if(cart.containsKey("Apple")) {
            int fruitCount = cart.get("Apple");
            cart.put("Apple", fruitCount + 2);
        } else  {
            cart.put("Apple", 0);
        }


        // Displaying items and quantities
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
