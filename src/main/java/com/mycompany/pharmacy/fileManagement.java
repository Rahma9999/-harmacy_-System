/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pharmacy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author pc
 */
public class fileManagement {
    
    // Customer Section
    public static void saveCustomerToFile(Customer c) {
        try (FileWriter writer = new FileWriter("customer.txt", true)) { // Open in append mode
            writer.write(c.toString() + "\n");
            System.out.println("Data saved successfully to customer.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static boolean isCustomerExists( Customer c) {
        try (BufferedReader reader = new BufferedReader(new FileReader("customer.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equals(c.toString())) {
                    return true; // Customer exists
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; // Customer does not exist
    }
    public static void read_CustomerFromTheFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("Customer.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 2) {
                    String name = parts[0].trim();
                    String phone = parts[1].trim();
                    String address =parts[2].trim();
                    Customer cust = new Customer(name, phone,address);
//                    Container.customerByPhone.
                    Container.customerByPhone.put(phone, cust);
                    Container.customers.add(cust);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void deleteCustomerFromFile(Customer c){
        ////////
    }
    
    //Doctor Section
    public static void saveDoctorToFile(Doctor c) {
        try (FileWriter writer = new FileWriter("Doctor.txt", true)) { // Open in append mode
            writer.write(c.toString() + "\n");
            System.out.println("Data saved successfully to Doctor.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static boolean isDoctorExists( Doctor c) {
        try (BufferedReader reader = new BufferedReader(new FileReader("Doctor.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equals(c.toString())) {
                    return true; // Doctor exists
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; // Doctor does not exist
    }
    public static void read_DoctorFromTheFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("Doctor.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 2) {
                    String name = parts[0].trim();
                    String phone = parts[1].trim();
                    Doctor doc = new Doctor(name, phone);
                    Container.doctorByPhone.put(phone, doc);
                    Container.doctors.add(doc);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void deleteDoctorFromFile(Doctor d){
        ////////
    }
    
    
    //Inventory Section
    public static void saveInvertoryToFile(Inventory c) {
        try (FileWriter writer = new FileWriter("Inventory.txt", true)) { // Open in append mode
            writer.write(c.toString() + "\n");
            System.out.println("Data saved successfully to Invertory.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static boolean isInvertoryExists( Inventory c) {
        try (BufferedReader reader = new BufferedReader(new FileReader("Inventory.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equals(c.toString())) {
                    return true; // Invertory exists
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; // Invertory does not exist
    }
    public static void read_InvertoryFromTheFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("Invertory.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    //Product Section
    public static void saveProductToFile(Product c) {
        try (FileWriter writer = new FileWriter("Product.txt", true)) { // Open in append mode
            writer.write(c.toString() + "\n");
            System.out.println("Data saved successfully to Product.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static boolean isProductExists( Product c) {
        try (BufferedReader reader = new BufferedReader(new FileReader("Product.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equals(c.toString())) {
                    return true; // Product exists
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; // Product does not exist
    }
    public static void read_ProductFromTheFile() {
         try (BufferedReader reader = new BufferedReader(new FileReader("Product.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                Product product = new Product(Integer.parseInt(parts[0]), parts[1], Float.parseFloat(parts[2]), Integer.parseInt(parts[3])); // Adjust fields
                Container.productBySerial.put(Integer.parseInt(parts[0]), product);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void deleteProdcutFromFile(Product p){
        ////////
    }
    
    //Receipt Section
    public static void saveReceiptToFile(Receipt c) {
        try (FileWriter writer = new FileWriter("Receipt.txt", true)) { // Open in append mode
            writer.write(c.toString() + "\n");
            System.out.println("Data saved successfully to Receipt.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static boolean isReceiptExists( Receipt c) {
        try (BufferedReader reader = new BufferedReader(new FileReader("Receipt.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equals(c.toString())) {
                    return true; // Receipt exists
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; // Receipt does not exist
    }
    public static void read_ReceiptFromTheFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("Receipt.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteReceiptFromFile(Receipt p){
        ////////
    }
    
}
