/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pharmacy;

/**
 *
 * @author Mr
 */
public class Product {
     private int serialNumber;
    private String productName;
    private float price;
    
    private int quantity;

    public Product(int serialNumber, String productName, float price, int q) {
        this.serialNumber = serialNumber;
        this.productName = productName;
        this.price = price;
        this.quantity = q;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getProductName() {
        return productName;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    
    public void addQuantity(int quantity) {
            this.quantity += quantity; 
    }
    
    public void reduceQuantity(int quantity) {
        if (this.quantity >= quantity)
            this.quantity -= quantity;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return   serialNumber + ","+ productName + "," + price + "," + quantity ;
    }
    
    
}
