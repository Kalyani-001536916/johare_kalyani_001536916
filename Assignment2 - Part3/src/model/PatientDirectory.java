/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author kalyanijohare
 */
public class PatientDirectory extends PersonDirectory {

    ArrayList<Patient> directoryPatient = new ArrayList<Patient>();

    public void addPatient(Patient patient) {
        this.directoryPatient.add(patient);
        this.directoryPerson.add(patient);
    }

    @Override
    public String toString() {
        return "PatientDirectory{" + "directoryPatient=" + directoryPatient + '}';
    }

}
