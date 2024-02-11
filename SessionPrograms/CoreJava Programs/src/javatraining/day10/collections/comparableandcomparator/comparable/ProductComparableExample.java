package javatraining.day10.collections.comparableandcomparator.comparable;

import java.util.*;

class Product implements Comparable<Product> {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return name + " - $" + price;
    }
}

public class ProductComparableExample {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 999.99));
        products.add(new Product("Phone", 699.99));
        products.add(new Product("Tablet", 499.99));


        Collections.sort(products);

        for (Product product : products) {
            System.out.println(product);
        }

        Comparator<Product> highToLow = Comparator.comparing(Product::getPrice).reversed();
        Collections.sort(products, highToLow);
        System.out.println("============================================");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
