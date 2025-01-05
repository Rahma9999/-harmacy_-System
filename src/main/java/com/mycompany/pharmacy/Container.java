/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pharmacy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Mr
 */
public class Container {
     public static HashMap<String, Customer> customerByPhone = new HashMap<>();
    public static HashMap<Integer, Product> productBySerial = new HashMap<>();
    public static HashMap<String, Doctor> doctorByPhone = new HashMap<>();
    public static List<Customer> customers = new ArrayList<>();
    public static List<Doctor> doctors = new ArrayList<>();
    
    public static HashMap<Customer, List> receipt = new HashMap();

}
