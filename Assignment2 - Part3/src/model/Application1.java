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
public class Application1 {
    
    public static void main(String[] args){
        String test = "Yes";
        do{
        VitalSigns vs = new VitalSigns();
        VitalSigns cvs = new VitalSigns();

        Patient patient = new Patient();
        String choice;
        String attribute;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter FirstName: ");
            String FirstName = sc.next();
            patient.setFirstName(FirstName);
            System.out.println("Enter LastName: ");
            String LastName = sc.next();
            patient.setLastName(LastName);
            
        do {
            
            System.out.println("Enter Age:");
            float ageGroup = sc.nextFloat();
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

//            vs.setFirstName(FirstName);
//            vs.setLastName(LastName);
//            vs.setAgeGroup(ageGroup);
//            vs.setRespiratoryRate(respiratoryRate);
//            vs.setHeartRate(heartRate);
//            vs.setSystolicBloodPressure(systolicBloodPressure);
//            vs.setWeightKg(weightKg);
//            vs.setWeightPounds(weightPounds);

            Encounter en = new Encounter(new VitalSigns(ageGroup,respiratoryRate, heartRate, systolicBloodPressure,weightKg, weightPounds));

            patient.list.add(new VitalSigns(ageGroup,respiratoryRate, heartRate, systolicBloodPressure,weightKg, weightPounds));
            patient.eList.add(en);
            
            System.out.println("Do you want to add more details(Yes/No)");

            choice = sc.next();
        } while (choice.equalsIgnoreCase("Yes"));
        
        Integer counter = patient.eList.size();
        
        System.out.println(patient.list);
        System.out.println(patient.eList);
        
        System.out.println("FirstName:" +patient.getFirstName() +  "  LastName:" +patient.getLastName());
        
        System.out.println("Number of Encounters:" +counter);
        
        
        System.out.println("Attribute name to be checked: \n1.RespiratoryRate \n2.HeartRate \n3.SystolicBloodPressure \n4.WeightKilos \n5.WeightPounds");
        attribute = sc.next();
//        VitalSigns vsNew = new VitalSigns();
        VitalSigns vsNew = patient.eList.get(patient.eList.size()-1).vs;
        if (vsNew.ifPatientIsNormal(attribute) == true) {
            System.out.println("Patient is Normal");
        } else {
            System.out.println("Patient is Abnormal");
        }
        System.out.println("Do you want to add a new patient?");
        test  = sc.next();
        }while(test.equalsIgnoreCase("Yes"));
    }
    }

