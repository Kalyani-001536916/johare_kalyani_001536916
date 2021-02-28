///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package model;
//
///**
// *
// * @author kalyanijohare
// */
//public class Main {
//    
//    public static void main(String[] args){
//        
//        Patient p = new Patient();
//        p.setFirstName("Kalyani");
//        p.setLastName("Johare");
//
//        VitalSigns vs = new VitalSigns();
//        
//        System.out.println("Test Cases for New Born");
//        vs.setFirstName("Kalyani");
//        vs.setLastName("Johare");
//        vs.setAgeGroup(0);
//        vs.setRespiratoryRate(35);
//        vs.setHeartRate(125);
//        vs.setSystolicBloodPressure(55);
//        vs.setWeightKg(2);
//        vs.setWeightPounds(5);
//        
//        if(vs.isNormal() == true){
//            System.out.println("Patient is Normal");
//        }
//        else{
//            System.out.println("Patient is Abnormal");
//        }
//        
//        p.list.add(vs);
//        System.out.println("Attributes of patient are initialized");
//        System.out.println("Arraylist contains Patient's Vital Signs:FisrtName= " +p.FirstName+  ", LastName=" +p.LastName+   "\n List: " +p.list);
//        
//        
//        System.out.println("Test Cases for New Born");
//        vs.setFirstName("Kalyani");
//        vs.setLastName("Johare");
//        vs.setAgeGroup(0);
//        vs.setRespiratoryRate(35);
//        vs.setHeartRate(115);
//        vs.setSystolicBloodPressure(55);
//        vs.setWeightKg(2);
//        vs.setWeightPounds(5);
//        
//        if(vs.isNormal() == true){
//            System.out.println("Patient is Normal");
//        }
//        else{
//            System.out.println("Patient is Abnormal");
//        }
//        
//        p.list.add(vs);
//        System.out.println("Attributes of patient are initialized");
//        System.out.println("Arraylist contains Patient's Vital Signs: FisrtName=" +p.FirstName+  ", LastName=" +p.LastName+   "\n List: " +p.list);
//        
//        System.out.println("Test Cases for Infant");
//        vs.setFirstName("Kalyani");
//        vs.setLastName("Johare");
//        vs.setAgeGroup(1);
//        vs.setRespiratoryRate(25);
//        vs.setHeartRate(125);
//        vs.setSystolicBloodPressure(75);
//        vs.setWeightKg(5);
//        vs.setWeightPounds(10);
//        
//        if(vs.isNormal() == true){
//            System.out.println("Patient is Normal");
//        }
//        else{
//            System.out.println("Patient is Abnormal");
//        }
//        
//        p.list.add(vs);
//        System.out.println("Attributes of patient are initialized");
//        System.out.println("Arraylist contains Patient's Vital Signs: FisrtName=" +p.FirstName+  ", LastName=" +p.LastName+   "\n List: " +p.list);
//        
//        System.out.println("Test Cases for Infant");
//        vs.setFirstName("Kalyani");
//        vs.setLastName("Johare");
//        vs.setAgeGroup(1);
//        vs.setRespiratoryRate(25);
//        vs.setHeartRate(75);
//        vs.setSystolicBloodPressure(75);
//        vs.setWeightKg(5);
//        vs.setWeightPounds(10);
//        
//        if(vs.isNormal() == true){
//            System.out.println("Patient is Normal");
//        }
//        else{
//            System.out.println("Patient is Abnormal");
//        } 
//       
//        p.list.add(vs);
//        System.out.println("Attributes of patient are initialized");
//        System.out.println("Arraylist contains Patient's Vital Signs: FisrtName=" +p.FirstName+  ", LastName=" +p.LastName+   "\n List: " +p.list);
//        
//        System.out.println("Test Cases for Toddler");
//        vs.setFirstName("Kalyani");
//        vs.setLastName("Johare");
//        vs.setAgeGroup(2);
//        vs.setRespiratoryRate(25);
//        vs.setHeartRate(125);
//        vs.setSystolicBloodPressure(85);
//        vs.setWeightKg(12);
//        vs.setWeightPounds(30);
//        
//        if(vs.isNormal() == true){
//            System.out.println("Patient is Normal");
//        }
//        else{
//            System.out.println("Patient is Abnormal");
//        }
//        
//        p.list.add(vs);
//        System.out.println("Attributes of patient are initialized");
//        System.out.println("Arraylist contains Patient's Vital Signs: FisrtName=" +p.FirstName+  ", LastName=" +p.LastName+   "\n List: " +p.list);
//        
//        System.out.println("Test Cases for Toddler");
//        vs.setFirstName("Kalyani");
//        vs.setLastName("Johare");
//        vs.setAgeGroup(2);
//        vs.setRespiratoryRate(25);
//        vs.setHeartRate(125);
//        vs.setSystolicBloodPressure(75);
//        vs.setWeightKg(12);
//        vs.setWeightPounds(30);
//        
//        if(vs.isNormal() == true){
//            System.out.println("Patient is Normal");
//        }
//        else{
//            System.out.println("Patient is Abnormal");
//        }
//        
//        p.list.add(vs);
//        System.out.println("Attributes of patient are initialized");
//        System.out.println("Arraylist contains Patient's Vital Signs: FisrtName=" +p.FirstName+  ", LastName=" +p.LastName+   "\n List: " +p.list);
//        
//        System.out.println("Test Cases for PreSchooler");
//        vs.setFirstName("Kalyani");
//        vs.setLastName("Johare");
//        vs.setAgeGroup(4);
//        vs.setRespiratoryRate(25);
//        vs.setHeartRate(85);
//        vs.setSystolicBloodPressure(85);
//        vs.setWeightKg(15);
//        vs.setWeightPounds(32);
//        
//        if(vs.isNormal() == true){
//            System.out.println("Patient is Normal");
//        }
//        else{
//            System.out.println("Patient is Abnormal");
//        }
//        
//        p.list.add(vs);
//        System.out.println("Attributes of patient are initialized");
//        System.out.println("Arraylist contains Patient's Vital Signs: FisrtName= " +p.FirstName+  ", LastName=" +p.LastName+   "\n List: " +p.list);
//        
//        System.out.println("Test Cases for PreSchooler");
//        vs.setFirstName("Kalyani");
//        vs.setLastName("Johare");
//        vs.setAgeGroup(4);
//        vs.setRespiratoryRate(25);
//        vs.setHeartRate(85);
//        vs.setSystolicBloodPressure(85);
//        vs.setWeightKg(10);
//        vs.setWeightPounds(32);
//        
//        if(vs.isNormal() == true){
//            System.out.println("Patient is Normal");
//        }
//        else{
//            System.out.println("Patient is Abnormal");
//        }
//        
//        p.list.add(vs);
//        System.out.println("Attributes of patient are initialized");
//        System.out.println("Arraylist contains Patient's Vital Signs: FisrtName= " +p.FirstName+  ", LastName=" +p.LastName+   "\n List: " +p.list);
//        
//        
//        System.out.println("Test Cases for School Age");
//        vs.setFirstName("Kalyani");
//        vs.setLastName("Johare");
//        vs.setAgeGroup(7);
//        vs.setRespiratoryRate(25);
//        vs.setHeartRate(75);
//        vs.setSystolicBloodPressure(85);
//        vs.setWeightKg(25);
//        vs.setWeightPounds(45);
//        
//        if(vs.isNormal() == true){
//            System.out.println("Patient is Normal");
//        }
//        else{
//            System.out.println("Patient is Abnormal");
//        }
//        
//        p.list.add(vs);
//        System.out.println("Attributes of patient are initialized");
//        System.out.println("Arraylist contains Patient's Vital Signs: FisrtName= " +p.FirstName+  ", LastName=" +p.LastName+   "\n List: " +p.list);
//        
//        System.out.println("Test Cases for School Age");
//        vs.setFirstName("Kalyani");
//        vs.setLastName("Johare");
//        vs.setAgeGroup(7);
//        vs.setRespiratoryRate(25);
//        vs.setHeartRate(75);
//        vs.setSystolicBloodPressure(85);
//        vs.setWeightKg(15);
//        vs.setWeightPounds(45);
//        
//        if(vs.isNormal() == true){
//            System.out.println("Patient is Normal");
//        }
//        else{
//            System.out.println("Patient is Abnormal");
//        }
//        
//        p.list.add(vs);
//        System.out.println("Attributes of patient are initialized");
//        System.out.println("Arraylist contains Patient's Vital Signs: FisrtName= " +p.FirstName+  ", LastName=" +p.LastName+   "\n List: " +p.list);
//        
//        
//        System.out.println("Test Cases for Adolescent");
//        vs.setFirstName("Kalyani");
//        vs.setLastName("Johare");
//        vs.setAgeGroup(14);
//        vs.setRespiratoryRate(15);
//        vs.setHeartRate(60);
//        vs.setSystolicBloodPressure(115);
//        vs.setWeightKg(55);
//        vs.setWeightPounds(115);
//        
//        if(vs.isNormal() == true){
//            System.out.println("Patient is Normal");
//        }
//        else{
//            System.out.println("Patient is Abnormal");
//        }
//        
//        p.list.add(vs);
//        System.out.println("Attributes of patient are initialized");
//        System.out.println("Arraylist contains Patient's Vital Signs: FisrtName= " +p.FirstName+  ", LastName=" +p.LastName+   "\n List: " +p.list);
//        
//        System.out.println("Test Cases for Adolescent");
//        vs.setFirstName("Kalyani");
//        vs.setLastName("Johare");
//        vs.setAgeGroup(14);
//        vs.setRespiratoryRate(15);
//        vs.setHeartRate(60);
//        vs.setSystolicBloodPressure(115);
//        vs.setWeightKg(45);
//        vs.setWeightPounds(115);
//        
//        if(vs.isNormal() == true){
//            System.out.println("Patient is Normal");
//        }
//        else{
//            System.out.println("Patient is Abnormal");
//        }
//        
//        p.list.add(vs);
//        System.out.println("Attributes of patient are initialized");
//        System.out.println("Arraylist contains Patient's Vital Signs: FisrtName=" +p.FirstName+  ", LastName=" +p.LastName+   "\n List: " +p.list);
//        
//    }
//    
//}
