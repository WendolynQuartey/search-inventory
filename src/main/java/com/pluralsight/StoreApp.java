package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class StoreApp {
    public static void main(String[] args) {
        try {
            ArrayList<Product> inventory = new ArrayList<Product>();
            BufferedReader buffReader = new BufferedReader(new FileReader("src/main/resources/inventory.csv"));

            String fileLine;
            int i = 0;
            System.out.println("We carry the following inventory: ");
            while ((fileLine = buffReader.readLine()) != null) {
                String[] productInfo = fileLine.split("\\|");
                Product newProduct = new Product(
                        Integer.parseInt(productInfo[0]),
                        productInfo[1],
                        Double.parseDouble(productInfo[2])
                );
               inventory.add(newProduct);
                System.out.printf("id: %d %s - Price: $%.2f%n",
                        newProduct.getId(), newProduct.getName(), newProduct.getPrice());
               i++;
            }
            buffReader.close();
        } catch (IOException e){
            System.err.println(e);
            System.err.println("This file can not be reached!");
        }
    }
}
