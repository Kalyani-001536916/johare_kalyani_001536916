/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author kalyanijohare
 */
public class Patient {
    
    private void display(){
        
    }
    
    public static boolean patientNormal(VitalSigns vs){
        if(vs.isNormal() == true){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    public static void main(String[] s){
     
    VitalSigns vs = new VitalSigns();
     
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age:");
        float ageGroup =sc.nextFloat();
        System.out.println("Enter Respiratory Rate:");
        float respiratoryRate = sc.nextFloat();
        System.out.println("Enter Heart Rate");
        float heartRate = sc.nextFloat();
        System.out.println("Enter Systolic Blood Pressure:");
        float systolicBloodPressure = sc.nextFloat();
        System.out.println("Enter Weight in Kg:");
        float weightKg = sc.nextFloat();
        System.out.println("Enter Weight in Pounds:");
        float weightPounds = sc.nextFloat();
               
        vs.setAgeGroup(ageGroup);
        vs.setRespiratoryRate(respiratoryRate);
        vs.setHeartRate(heartRate);
        vs.setSystolicBloodPressure(systolicBloodPressure);
        vs.setWeightKg(weightKg);
        vs.setWeightPounds(weightPounds);
                
        if(patientNormal(vs)== true){
            System.out.println("Patient is Normal");
        }
        else{
            System.out.println("Patient is AbNormal");
        }
        
            
}
}
