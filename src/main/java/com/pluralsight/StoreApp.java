package com.pluralsight;

import java.util.ArrayList;


public class StoreApp {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();
        System.out.println("We carry the following inventory: ");
        for (Product p : inventory) {
            System.out.printf("id: %d %s - Price: $%.2f%n",
                    p.getId(), p.getName(), p.getPrice());
        }
}
    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();

        inventory.add(new Product(1, "Laptop", 999.99));
        inventory.add(new Product(2, "Wireless Mouse", 25.50));
        inventory.add(new Product(3, "Mechanical Keyboard", 89.99));
        inventory.add(new Product(4, "USB-C Cable (2m)", 12.75));
        inventory.add(new Product(6, "Noise Cancelling Headphones", 199.95));

        return inventory;
    }
}
