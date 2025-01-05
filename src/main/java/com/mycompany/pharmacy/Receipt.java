/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pharmacy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Mr
 */
public class Receipt {
    private String date;
    private String customerName;
    private String doctorName;
    private List<Product> products;
    private List<Integer> quantities;
    private double totalCost;

    public Receipt(String customerName, String doctorName, List<Product> products, List<Integer> quantities, double totalCost) {
        this.date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        this.customerName = customerName;
        this.doctorName = doctorName;
        this.products = products;
        this.quantities = quantities;
        this.totalCost = totalCost;
    }

    public String getDate() {
        return date;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Integer> getQuantities() {
        return quantities;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setQuantities(List<Integer> quantities) {
        this.quantities = quantities;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
    
    

    public void displayReceipt() {
        System.out.println("\n--- Receipt ---");
        System.out.println("Date: " + date);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Doctor: " + doctorName);
        System.out.println("Items Purchased:");
        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            int q = quantities.get(i);
            System.out.println(p.getProductName() + " - Quantity: " + q + ", Price: $" + p.getPrice());
        }
        System.out.println("Total Cost: $" + totalCost);
        System.out.println("----------------");
    }

    public double getTotalCost() {
        return totalCost;
    }

    @Override
    public String toString() {
        return "Receipt{" + "date=" + date + ", customerName=" + customerName + ", doctorName=" + doctorName + ", products=" + products + ", quantities=" + quantities + ", totalCost=" + totalCost + '}';
    }

}
