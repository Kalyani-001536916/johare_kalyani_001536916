/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author kalyanijohare
 */
public class Application2 {

    public static void main(String[] args) {

        //Patient 1 - normal
        PatientDirectory directoryPatient1 = new PatientDirectory();
        Patient patient1 = new Patient();
        patient1.setFirstName("Kalyani");
        patient1.setLastName("Johare");
        VitalSigns vs1 = new VitalSigns(2, 25, 85, 85, 13, 23);
        Encounter encounter1 = new Encounter(vs1);
        patient1.eList.add(encounter1);
        directoryPatient1.addPatient(patient1);

        //Patient 2 - normal
        PatientDirectory directoryPatient2 = new PatientDirectory();
        Patient patient2 = new Patient();
        patient2.setFirstName("Shreya");
        patient2.setLastName("Kanhe");
        VitalSigns vs2 = new VitalSigns(10, 25, 75, 85, 25, 45);
        Encounter encounter2 = new Encounter(vs2);
        patient2.eList.add(encounter2);
        directoryPatient2.addPatient(patient2);

        //Patient 3 - with BP abnormal
        PatientDirectory directoryPatient3 = new PatientDirectory();
        Patient patient3 = new Patient();
        patient3.setFirstName("Trupti");
        patient3.setLastName("Raut");
        VitalSigns vs3 = new VitalSigns(4, 25, 85, 70, 15, 32);
        Encounter encounter3 = new Encounter(vs3);
        patient3.eList.add(encounter3);
        directoryPatient3.addPatient(patient3);

        //Patient 4 - with BP abnormal
        PatientDirectory directoryPatient4 = new PatientDirectory();
        Patient patient4 = new Patient();
        patient4.setFirstName("Chintan");
        patient4.setLastName("Bhargave");
        VitalSigns vs4 = new VitalSigns(8, 25, 75, 70, 25, 45);
        Encounter encounter4 = new Encounter(vs4);
        patient4.eList.add(encounter4);
        directoryPatient3.addPatient(patient4);

        House house1 = new House();
        house1.personList.add(patient1);

        House house2 = new House();
        house2.personList.add(patient2);

        House house3 = new House();
        house3.personList.add(patient3);

        House house4 = new House();
        house4.personList.add(patient4);

        Community community1 = new Community();
        community1.house.add(house1);
        community1.house.add(house2);

        Community community2 = new Community();
        community2.house.add(house3);
        community2.house.add(house4);
        
        System.out.println("List of Patients:");
        System.out.println("Patient 1:"  +patient1);
        System.out.println("Patient 2:"  +patient2);
        System.out.println("Patient 3:"  +patient3);
        System.out.println("Patient 4:"  +patient4);

        int count1 = 0;
        for (House h : community1.house) {
            for (Person p : h.personList) {
                Patient patient = new Patient();
                patient = (Patient) p;
                if (!patient.eList.get(patient.eList.size() - 1).vs.ifPatientIsNormal("SystolicBloodPressure")) {
                    count1 = count1 + 1;
                    System.out.println("Below are the abnormal cases found in Community1: \n" +patient);
                }
            }
        }
        System.out.println("Number of abnormal cases in Community1:" + count1);
        
        int count2 = 0;
        for (House h : community2.house) {
            for (Person p : h.personList) {
                Patient patient = new Patient();
                patient = (Patient) p;         
                if (!patient.eList.get(patient.eList.size() - 1).vs.ifPatientIsNormal("SystolicBloodPressure")) {
                    count2 = count2 + 1;
                    System.out.println("Below are the abnormal cases found in Community2: \n" +patient);
                }               
            }
        }
        System.out.println("Number of abnormal cases in Community2:" + count2);
    }
}
