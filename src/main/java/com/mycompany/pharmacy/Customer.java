/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pharmacy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mr
 */
public class Customer {
     private String customerPhoneNumber;
    private String customerName;
    private String address;
    private double totalSpent;
    private List<Receipt> receipts = new ArrayList<>();

    public Customer(String customerPhoneNumber, String customerName, String address) {
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerName = customerName;
        this.address = address;
        this.totalSpent = 0;
    }
    
    
    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public double getTotalSpent() {
        return totalSpent;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTotalSpent(double totalSpent) {
        this.totalSpent = totalSpent;
    }

    public void setReceipts(List<Receipt> receipts) {
        this.receipts = receipts;
    }
    
    

    public void addToTotalSpent(double amount) {
        this.totalSpent += amount;
    }

    public void addReceipt(Receipt receipt) {
        receipts.add(receipt);
    }

    public List<Receipt> getReceipts() {
        return receipts;
    }
    
    public void discount(boolean b){
        if(b)
            totalSpent *= 0.95 ;
    }

    @Override
    public String toString() {
        return   customerPhoneNumber + "," + customerName + "," + address + "," + totalSpent + "," + receipts ;
    }
    
}
