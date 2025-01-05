/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pharmacy;

import java.util.HashMap;

/**
 *
 * @author Mr
 */
public class Inventory {
     private HashMap<Product, Integer> productQuantities = new HashMap<>();

    public void addProduct(Product product, int quantity) {
        if (productQuantities.containsKey(product)) {
            productQuantities.put(product, productQuantities.get(product) + quantity);
            System.out.println("Quantity updated for product: " + product.getProductName());
        } else {
            productQuantities.put(product, quantity);
            System.out.println("Product added to inventory: " + product.getProductName());
        }
    }

    public HashMap<Product, Integer> getProductQuantities() {
        return productQuantities;
    }
   

    public int getProductQuantity(Product product) {
        return productQuantities.getOrDefault(product, 0);
    }

    public void reduceProductQuantity(Product product, int quantity) {
        if (productQuantities.containsKey(product)) {
            int currentQuantity = productQuantities.get(product);
            if (currentQuantity >= quantity) {
                productQuantities.put(product, currentQuantity - quantity);
            } else {
                System.out.println("Not enough stock available.");
            }
        }
    }

    public void displayProductQuantity(int serialNumber) {
        Product product = Container.productBySerial.get(serialNumber);
        if (product != null) {
            int quantity = getProductQuantity(product);
            System.out.println("Product: " + product.getProductName() + ", Quantity: " + quantity);
        } else {
            System.out.println("Product not found in inventory.");
        }
    }
}
