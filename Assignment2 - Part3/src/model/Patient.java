/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author kalyanijohare
 */
public class Patient extends Person {

//    public String FirstName;
//    public String LastName;
//    private float ageGroup;
//    private float respiratoryRate;
//    private float heartRate;
//    private float systolicBloodPressure;
//    private float weightKg;
//    private float weightPounds;
//    private String attribute;
//    
//    
//
//    public String getFirstName() {
//        return FirstName;
//    }
//
//    public void setFirstName(String FirstName) {
//        this.FirstName = FirstName;
//    }
//
//    public String getLastName() {
//        return LastName;
//    }
//
//    public void setLastName(String LastName) {
//        this.LastName = LastName;
//    }
//
//    public float getAgeGroup() {
//        return ageGroup;
//    }
//
//    public void setAgeGroup(float ageGroup) {
//        this.ageGroup = ageGroup;
//    }
//
//    public float getRespiratoryRate() {
//        return respiratoryRate;
//    }
//
//    public void setRespiratoryRate(float respiratoryRate) {
//        this.respiratoryRate = respiratoryRate;
//    }
//
//    public float getHeartRate() {
//        return heartRate;
//    }
//
//    public void setHeartRate(float heartRate) {
//        this.heartRate = heartRate;
//    }
//
//    public float getSystolicBloodPressure() {
//        return systolicBloodPressure;
//    }
//
//    public void setSystolicBloodPressure(float systolicBloodPressure) {
//        this.systolicBloodPressure = systolicBloodPressure;
//    }
//
//    public float getWeightKg() {
//        return weightKg;
//    }
//
//    public void setWeightKg(float weightKg) {
//        this.weightKg = weightKg;
//    }
//
//    public float getWeightPounds() {
//        return weightPounds;
//    }
//
//    public void setWeightPounds(float weightPounds) {
//        this.weightPounds = weightPounds;
//    }
    ArrayList<VitalSigns> list = new ArrayList<VitalSigns>();
    ArrayList<Encounter> eList = new ArrayList<Encounter>();

    private void display() {

    }

    public static boolean patientNormal(VitalSigns vs) {
        if (vs.isNormal() == true) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Patient{" + "FirstName = " + FirstName + ", LastName = " +LastName+ ", Encounter List = " + eList +'}';
    }

//    public static void main(String[] args) {
//
//        VitalSigns vs = new VitalSigns();
//        VitalSigns cvs = new VitalSigns();
//
//        Patient patient = new Patient();
//        String choice;
//        String attribute;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter FirstName: ");
//            String FirstName = sc.next();
//            patient.setFirstName(FirstName);
//            System.out.println("Enter LastName: ");
//            String LastName = sc.next();
//            patient.setLastName(LastName);
//            
//        do {
//            
//            System.out.println("Enter Age:");
//            float ageGroup = sc.nextFloat();
//            System.out.println("Enter Respiratory Rate:");
//            float respiratoryRate = sc.nextFloat();
//            System.out.println("Enter Heart Rate");
//            float heartRate = sc.nextFloat();
//            System.out.println("Enter Systolic Blood Pressure:");
//            float systolicBloodPressure = sc.nextFloat();
//            System.out.println("Enter Weight in Kg:");
//            float weightKg = sc.nextFloat();
//            System.out.println("Enter Weight in Pounds:");
//            float weightPounds = sc.nextFloat();
//
////            vs.setFirstName(FirstName);
////            vs.setLastName(LastName);
////            vs.setAgeGroup(ageGroup);
////            vs.setRespiratoryRate(respiratoryRate);
////            vs.setHeartRate(heartRate);
////            vs.setSystolicBloodPressure(systolicBloodPressure);
////            vs.setWeightKg(weightKg);
////            vs.setWeightPounds(weightPounds);
//
//            Encounter en = new Encounter(new VitalSigns(ageGroup,respiratoryRate, heartRate, systolicBloodPressure,weightKg, weightPounds));
//
//            patient.list.add(new VitalSigns(ageGroup,respiratoryRate, heartRate, systolicBloodPressure,weightKg, weightPounds));
//            patient.eList.add(en);
//            
//            System.out.println("Do you want to add more details(Yes/No)");
//
//            choice = sc.next();
//        } while (choice.equalsIgnoreCase("Yes"));
//        
//        Integer counter = patient.eList.size();
//        
//        System.out.println(patient.list);
//        System.out.println(patient.eList);
//        
//        System.out.println("FirstName:" +patient.getFirstName() +  "  LastName:" +patient.getLastName());
//        
//        System.out.println("Number of Encounters:" +counter);
//        
//        
//        System.out.println("Attribute name to be checked: \n1.RespiratoryRate \n2.HeartRate \n3.SystolicBloodPressure \n4.WeightKilos \n5.WeightPounds");
//        attribute = sc.next();
//        VitalSigns vsNew = new VitalSigns();
//        vsNew = patient.list.get(patient.list.size()-1);
//        if (vsNew.ifPatientIsNormal(attribute) == true) {
//            System.out.println("Patient is Normal");
//        } else {
//            System.out.println("Patient is Abnormal");
//        }
//    }
}
