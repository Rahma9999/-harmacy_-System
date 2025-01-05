/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pharmacy;

/**
 *
 * @author Mr
 */
public class Doctor {
     private String doctorPhoneNumber;
    private String doctorName;

    public Doctor(String doctorPhoneNumber, String doctorName) {
        this.doctorPhoneNumber = doctorPhoneNumber;
        this.doctorName = doctorName;
    }
    

    public String getDoctorPhoneNumber() {
        return doctorPhoneNumber;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorPhoneNumber(String doctorPhoneNumber) {
        this.doctorPhoneNumber = doctorPhoneNumber;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    
    

    @Override
    public String toString() {
        return doctorPhoneNumber + ", " + doctorName;
    } 
    
    
}
