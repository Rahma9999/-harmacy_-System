//package com.mycompany.pharmacy;
//
//import com.mycompany.pharmacy.Container;
//import com.mycompany.pharmacy.Customer;
//import com.mycompany.pharmacy.Doctor;
//import com.mycompany.pharmacy.Inventory;
//import com.mycompany.pharmacy.Product;
//import com.mycompany.pharmacy.Receipt;
//import java.util.*;
//import java.text.SimpleDateFormat;
//
//// Main class with CLI
//public class Pharmacy {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Inventory inventory = new Inventory();
//
//        while (true) {
//            System.out.println("\nPharmacy Management System");
//            System.out.println("1. Add Customer");
//            System.out.println("2. View All Customers");
//            System.out.println("3. Delete Customer");
//            System.out.println("4. View Customer Details by Phone Number");
//            System.out.println("5. Add Doctor");
//            System.out.println("6. View All Doctors");
//            System.out.println("7. Delete Doctor");
//            System.out.println("8. View Doctor Details by Phone Number");
//            System.out.println("9. Add Product to Inventory");
//            System.out.println("10. Check Product Quantity");
//            System.out.println("11. Make a Purchase and Generate Receipt");
//            System.out.println("12. Exit");
//            System.out.print("Choose an option: ");
//
//            int choice = scanner.nextInt();
//            scanner.nextLine(); // Consume newline
//
//            try {
//                switch (choice) {
//                    case 1: // Add Customer
//                        String customerPhone;
//                        while (true) {
//                            System.out.print("Enter Customer Phone Number (11 digits): ");
//                            customerPhone = scanner.nextLine();
//                            if (customerPhone.matches("\\d{11}") && !Container.customerByPhone.containsKey(customerPhone)) {
//                                break;
//                            } else {
//                                System.out.println("Invalid or duplicate phone number.");
//                            }
//                        }
//
//                        String customerName;
//                        while (true) {
//                            System.out.print("Enter Customer Name: ");
//                            customerName = scanner.nextLine();
//                            if (customerName.matches("[a-zA-Z\\s]+")) {
//                                break;
//                            } else {
//                                System.out.println("Name must contain alphabets only.");
//                            }
//                        }
//
//                        System.out.print("Enter Address: ");
//                        String address = scanner.nextLine();
//
//                        Customer customer = new Customer(customerPhone, customerName, address);
//                        Container.customers.add(customer);
//                        Container.customerByPhone.put(customerPhone, customer);
//                        System.out.println("Customer added successfully!");
//                        break;
//
//                    case 2: // View All Customers
//                        System.out.println("All Customers:");
//                        for (Customer c : Container.customers) {
//                            System.out.println("Name: " + c.getCustomerName() + ", Phone: " + c.getCustomerPhoneNumber());
//                        }
//                        break;
//
//                    case 3: // Delete Customer
//                        System.out.print("Enter Customer Phone Number to delete: ");
//                        String deletePhone = scanner.nextLine();
//                        Container.customers.removeIf(c -> c.getCustomerPhoneNumber().equals(deletePhone));
//                        Container.customerByPhone.remove(deletePhone);
//                        System.out.println("Customer deleted if exists.");
//                        break;
//
//                    case 4: // View Customer Details by Phone Number
//                        System.out.print("Enter Customer Phone Number to view details: ");
//                        String viewPhone = scanner.nextLine();
//                        Customer foundCustomer = Container.customerByPhone.get(viewPhone);
//                        if (foundCustomer != null) {
//                            System.out.println("Name: " + foundCustomer.getCustomerName());
//                            System.out.println("Address: " + foundCustomer.getAddress());
//                            System.out.println("Total Spent: $" + foundCustomer.getTotalSpent());
//                            System.out.println("Receipts:");
//                            for (Receipt r : foundCustomer.getReceipts()) {
//                                r.displayReceipt();
//                            }
//                        } else {
//                            System.out.println("Customer not found.");
//                        }
//                        break;
//
//                    case 5: // Add Doctor
//                        String doctorPhone;
//                        while (true) {
//                            System.out.print("Enter Doctor Phone Number (11 digits): ");
//                            doctorPhone = scanner.nextLine();
//                            if (doctorPhone.matches("\\d{11}") && !Container.doctorByPhone.containsKey(doctorPhone)) {
//                                break;
//                            } else {
//                                System.out.println("Invalid or duplicate phone number.");
//                            }
//                        }
//
//                        String doctorName;
//                        while (true) {
//                            System.out.print("Enter Doctor Name: ");
//                            doctorName = scanner.nextLine();
//                            if (doctorName.matches("[a-zA-Z\\s]+")) {
//                                break;
//                            } else {
//                                System.out.println("Name must contain alphabets only.");
//                            }
//                        }
//
//                        Doctor doctor = new Doctor(doctorPhone, doctorName);
//                        Container.doctors.add(doctor);
//                        Container.doctorByPhone.put(doctorPhone, doctor);
//                        System.out.println("Doctor added successfully!");
//                        break;
//
//                    case 6: // View All Doctors
//                        System.out.println("All Doctors:");
//                        for (Doctor d : Container.doctors) {
//                            System.out.println("Name: " + d.getDoctorName() + ", Phone: " + d.getDoctorPhoneNumber());
//                        }
//                        break;
//
//                    case 7: // Delete Doctor
//                        System.out.print("Enter Doctor Phone Number to delete: ");
//                        String deleteDoctorPhone = scanner.nextLine();
//                        Container.doctors.removeIf(d -> d.getDoctorPhoneNumber().equals(deleteDoctorPhone));
//                        Container.doctorByPhone.remove(deleteDoctorPhone);
//                        System.out.println("Doctor deleted if exists.");
//                        break;
//
//                    case 8: // View Doctor Details by Phone Number
//                        System.out.print("Enter Doctor Phone Number to view details: ");
//                        String viewDoctorPhone = scanner.nextLine();
//                        Doctor foundDoctor = Container.doctorByPhone.get(viewDoctorPhone);
//                        if (foundDoctor != null) {
//                            System.out.println("Name: " + foundDoctor.getDoctorName());
//                        } else {
//                            System.out.println("Doctor not found.");
//                        }
//                        break;
//
//                    case 9: // Add Product to Inventory
//                        System.out.print("Enter Product Serial Number: ");
//                        int serialNumber = scanner.nextInt();
//                        scanner.nextLine(); // Consume newline
//
//                        Product existingProduct = Container.productBySerial.get(serialNumber);
//                        if (existingProduct != null) {
//                            System.out.print("Enter Quantity to Add: ");
//                            int addQuantity = scanner.nextInt();
//                            inventory.addProduct(existingProduct, addQuantity);
//                        } else {
//                            System.out.print("Enter Product Name: ");
//                            String productName = scanner.nextLine();
//
//                            System.out.print("Enter Product Price: ");
//                            float price = scanner.nextFloat();
//                            scanner.nextLine(); // Consume newline
//
//                            Product newProduct = new Product(serialNumber, productName, price);
//                            Container.productBySerial.put(serialNumber, newProduct);
//                            System.out.print("Enter Quantity: ");
//                            int quantity = scanner.nextInt();
//                            inventory.addProduct(newProduct, quantity);
//                        }
//                        break;
//
//                    case 10: // Check Product Quantity
//                        System.out.print("Enter Product Serial Number: ");
//                        int checkSerial = scanner.nextInt();
//                        inventory.displayProductQuantity(checkSerial);
//                        break;
//
//                    case 11: // Make a Purchase and Generate Receipt
//                        System.out.print("Enter Customer Phone Number: ");
//                        String customerPhonePurchase = scanner.nextLine();
//                        Customer customerForPurchase = Container.customerByPhone.get(customerPhonePurchase);
//
//                        if (customerForPurchase == null) {
//                            System.out.println("Customer not found.");
//                            break;
//                        }
//
//                        System.out.print("Enter Doctor Phone Number: ");
//                        String doctorPhonePurchase = scanner.nextLine();
//                        Doctor doctorForPurchase = Container.doctorByPhone.get(doctorPhonePurchase);
//
//                        if (doctorForPurchase == null) {
//                            System.out.println("Doctor not found.");
//                            break;
//                        }
//
//                        List<Product> purchasedProducts = new ArrayList<>();
//                        List<Integer> purchasedQuantities = new ArrayList<>();
//                        double totalCost = 0;
//
//                        while (true) {
//                            System.out.print("Enter Product Serial Number (or -1 to stop): ");
//                            int productSerial = scanner.nextInt();
//                            if (productSerial == -1) {
//                                break;
//                            }
//
//                            Product productForPurchase = Container.productBySerial.get(productSerial);
//                            if (productForPurchase == null) {
//                                System.out.println("Product not found.");
//                                continue;
//                            }
//
//                            System.out.print("Enter Quantity: ");
//                            int purchaseQuantity = scanner.nextInt();
//                            if (inventory.getProductQuantity(productForPurchase) >= purchaseQuantity) {
//                                inventory.reduceProductQuantity(productForPurchase, purchaseQuantity);
//                                purchasedProducts.add(productForPurchase);
//                                purchasedQuantities.add(purchaseQuantity);
//                                totalCost += productForPurchase.getPrice() * purchaseQuantity;
//                            } else {
//                                System.out.println("Not enough stock available.");
//                            }
//                        }
//
//                        // Apply 5% discount if total spent by customer > 500
//                        if (customerForPurchase.getTotalSpent() > 500) {
//                            System.out.println("5% discount applied!");
//                            totalCost *= 0.95;
//                        }
//
//                        Receipt receipt = new Receipt(
//                            customerForPurchase.getCustomerName(),
//                            doctorForPurchase.getDoctorName(),
//                            purchasedProducts,
//                            purchasedQuantities,
//                            totalCost
//                        );
//                        customerForPurchase.addToTotalSpent(totalCost);
//                        customerForPurchase.addReceipt(receipt);
//                        receipt.displayReceipt();
//                        break;
//
//                    case 12: // Exit
//                        System.out.println("Exiting the system. Goodbye!");
//                        return;
//
//                    default:
//                        System.out.println("Invalid option. Please try again.");
//                }
//            } catch (Exception e) {
//                System.out.println("Error: " + e.getMessage());
//                scanner.nextLine(); // Clear buffer
//            }
//        }
//    }
//}
