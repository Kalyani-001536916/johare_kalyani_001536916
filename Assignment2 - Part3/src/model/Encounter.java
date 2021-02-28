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
public class Encounter {

    public VitalSigns vs;

    public Encounter(VitalSigns vs) {
        this.vs = vs;
    }

    @Override
    public String toString() {
        return "Encounter{" + "vs=" + vs + '}';
    }

}
