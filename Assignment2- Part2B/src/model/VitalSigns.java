/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author kalyanijohare
 */
public class VitalSigns {

    private String FirstName;
    private String LastName;
    private float ageGroup;
    private float respiratoryRate;
    private float heartRate;
    private float systolicBloodPressure;
    private float weightKg;
    private float weightPounds;
    private String attribute;

    public VitalSigns(float ageGroup, float respiratoryRate, float heartRate, float systolicBloodPressure, float weightKg, float weightPounds) {
        this.ageGroup = ageGroup;
        this.respiratoryRate = respiratoryRate;
        this.heartRate = heartRate;
        this.systolicBloodPressure = systolicBloodPressure;
        this.weightKg = weightKg;
        this.weightPounds = weightPounds;
    }

    public VitalSigns() {
    }
    
    
    
    String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public float getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(float ageGroup) {
        this.ageGroup = ageGroup;
    }

    public float getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(float respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public float getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(float heartRate) {
        this.heartRate = heartRate;
    }

    public float getSystolicBloodPressure() {
        return systolicBloodPressure;
    }

    public void setSystolicBloodPressure(float systolicBloodPressure) {
        this.systolicBloodPressure = systolicBloodPressure;
    }
    
    public float getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(float weightKg) {
        this.weightKg = weightKg;
    }

    public float getWeightPounds() {
        return weightPounds;
    }

    public void setWeightPounds(float weightPounds) {
        this.weightPounds = weightPounds;
    }

    @Override
    public String toString() {
        return "VitalSigns{" + "FirstName=" + FirstName + ", LastName=" + LastName + ", ageGroup=" + ageGroup + ", respiratoryRate=" + respiratoryRate + ", heartRate=" + heartRate + ", systolicBloodPressure=" + systolicBloodPressure + ", weightKg=" + weightKg + ", weightPounds=" + weightPounds + ", timeStamp=" + timeStamp +'}';
    }

    public boolean isNormal() {
        boolean condn = false;

        if(ageGroup < 1){
            if ((respiratoryRate >= 30 && respiratoryRate <= 50) && (heartRate >= 120 && heartRate <= 160)
                    && (systolicBloodPressure >= 50 && systolicBloodPressure <= 70) && (weightKg >= 2 && weightKg <= 3)
                    && (weightPounds >= 4.5 && weightPounds <= 7)) {
                condn = true;
        }
        
            System.out.println("Patient is from New Born Age Group");

        }
        else if (ageGroup >0 && ageGroup <= 1) {
            if ((respiratoryRate >= 20 && respiratoryRate <= 30) && (heartRate >= 80 && heartRate <= 140)
                    && (systolicBloodPressure >= 70 && systolicBloodPressure <= 100) && (weightKg >= 4 && weightKg <= 10)
                    && (weightPounds >= 9 && weightPounds <= 22)) {
                condn = true;
            }

            System.out.println("Patient is from Infant Age Group");

        } else if (ageGroup > 1 && ageGroup <= 3) {
            if ((respiratoryRate >= 20 && respiratoryRate <= 30) && (heartRate >= 80 && heartRate <= 130)
                    && (systolicBloodPressure >= 80 && systolicBloodPressure <= 110) && (weightKg >= 10 && weightKg <= 14)
                    && (weightPounds >= 22 && weightPounds <= 31)) {
                condn = true;
            }

            System.out.println("Patient is from Toddler Age Group");

        } else if (ageGroup > 3 && ageGroup <= 5) {
            if ((respiratoryRate >= 20 && respiratoryRate <= 30) && (heartRate >= 80 && heartRate <= 120)
                    && (systolicBloodPressure >= 80 && systolicBloodPressure <= 110) && (weightKg >= 14 && weightKg <= 18)
                    && (weightPounds >= 31 && weightPounds <= 40)) {
                condn = true;
            }
            System.out.println("Patient is from PreSchooler Age Group");

        } else if (ageGroup >6 && ageGroup <= 12) {
            if ((respiratoryRate >= 20 && respiratoryRate <= 30) && (heartRate >= 70 && heartRate <= 110)
                    && (systolicBloodPressure >= 80 && systolicBloodPressure <= 120) && (weightKg >= 20 && weightKg <= 42)
                    && (weightPounds >= 41 && weightPounds <= 92)) {
                condn = true;
            }
            System.out.println("Patient is from School Age Group");

        } else {
            if ((respiratoryRate >= 12 && respiratoryRate <= 20) && (heartRate >= 55 && heartRate <= 105)
                    && (systolicBloodPressure >= 110 && systolicBloodPressure <= 120) && (weightKg > 50)
                    && (weightPounds >= 110)) {
                condn = true;
            }
            System.out.println("Patient is from Adolescent Age Group");
        }
        return condn;
    }

    public boolean ifPatientIsNormal(String attribute) {
        boolean condn = false;

        if (attribute.equals("RespiratoryRate")) 
        {
            if(ageGroup < 1){
                if (respiratoryRate >= 30 && respiratoryRate <= 50) {
                    condn = true;
            }

                System.out.println("Patient is from New Born Age Group");

            }
            else if (ageGroup >0 && ageGroup <= 1) {
                if (respiratoryRate >= 20 && respiratoryRate <= 30) {
                    condn = true;
                }

                System.out.println("Patient is from Infant Age Group");

            } else if (ageGroup > 1 && ageGroup <= 3) {
                if (respiratoryRate >= 20 && respiratoryRate <= 30) {
                    condn = true;
                }

                System.out.println("Patient is from Toddler Age Group");

            } else if (ageGroup > 3 && ageGroup <= 5) {
                if (respiratoryRate >= 20 && respiratoryRate <= 30) {
                    condn = true;
                }
                System.out.println("Patient is from PreSchooler Age Group");

            } else if (ageGroup > 6 && ageGroup <= 12) {
                if (respiratoryRate >= 20 && respiratoryRate <= 30) {
                    condn = true;
                }
                System.out.println("Patient is from School Age Group");

            } else if (ageGroup >= 13 ){
                if (respiratoryRate >= 12 && respiratoryRate <= 20) {
                    condn = true;
                }
                System.out.println("Patient is from Adolescent Age Group");
            }
           return condn; 
        }   
       
        else if (attribute.equals("HeartRate")) 
        {
            if(ageGroup < 1){
                if (heartRate >= 120 && heartRate <= 160) {
                    condn = true;
            }

                System.out.println("Patient is from New Born Age Group");

            }
            else if (ageGroup >0 && ageGroup <= 1) {
                if (heartRate >= 80 && heartRate <= 140) {
                    condn = true;
                }

                System.out.println("Patient is from Infant Age Group");

            } else if (ageGroup > 1 && ageGroup <= 3) {
                if (heartRate >= 80 && heartRate <= 130)
                {
                    condn = true;
                }

                System.out.println("Patient is from Toddler Age Group");

            } else if (ageGroup > 3 && ageGroup <= 5) {
                if (heartRate >= 80 && heartRate <= 120)
                {
                    condn = true;
                }
                System.out.println("Patient is from PreSchooler Age Group");

            } else if (ageGroup > 6 && ageGroup <= 12) {
                if (heartRate >= 70 && heartRate <= 110)
                {
                    condn = true;
                }
                System.out.println("Patient is from School Age Group");

            } else {
                if (heartRate >= 55 && heartRate <= 105)
                {
                    condn = true;
                }
                System.out.println("Patient is from Adolescent Age Group");
            }
        }
        
        else if (attribute.equals("WeightKilos")) 
        {
            if(ageGroup < 1){
                if (weightKg >= 2 && weightKg <= 3)
                {
                    condn = true;
                }

                System.out.println("Patient is from New Born Age Group");

            }
            else if (ageGroup >0 && ageGroup <= 1) {
                if  (weightKg >= 4 && weightKg <= 10)
                {
                    condn = true;
                }

                System.out.println("Patient is from Infant Age Group");

            } else if (ageGroup > 1 && ageGroup <= 3) {
                if (weightKg >= 10 && weightKg <= 14)
                {
                    condn = true;
                }

                System.out.println("Patient is from Toddler Age Group");

            } else if (ageGroup > 3 && ageGroup <= 5) {
                if (weightKg >= 14 && weightKg <= 18)
                {
                    condn = true;
                }
                System.out.println("Patient is from PreSchooler Age Group");

            } else if (ageGroup > 6 && ageGroup <= 12) {
                if (weightKg >= 20 && weightKg <= 42)
                {
                    condn = true;
                }
                System.out.println("Patient is from School Age Group");

            } else {
                if (weightKg > 50) {
                    condn = true;
                }
                System.out.println("Patient is from Adolescent Age Group");
            }
        }
        
        else if (attribute.equals("SystolicBloodPressure"))
        {
            if(ageGroup < 1)
            {
                
                if (systolicBloodPressure >= 50 && systolicBloodPressure <= 70)
                {
                    condn = true;
                }

                System.out.println("Patient is from New Born Age Group");

            }
            else if (ageGroup >0 && ageGroup <= 1) {
                if (systolicBloodPressure >= 70 && systolicBloodPressure <= 100)
                {
                    condn = true;
                }

                System.out.println("Patient is from Infant Age Group");

            } else if (ageGroup > 1 && ageGroup <= 3) {
                if (systolicBloodPressure >= 80 && systolicBloodPressure <= 110) 
                {
                    condn = true;
                }

                System.out.println("Patient is from Toddler Age Group");

            } else if (ageGroup > 3 && ageGroup <= 5) {
                if (systolicBloodPressure >= 80 && systolicBloodPressure <= 110) 
                {
                    condn = true;
                }
                System.out.println("Patient is from PreSchooler Age Group");

            } else if (ageGroup > 6 && ageGroup <= 12) {
                if (systolicBloodPressure >= 80 && systolicBloodPressure <= 120) 
                {
                    condn = true;
                }
                System.out.println("Patient is from School Age Group");

            } else {
                if (systolicBloodPressure >= 110 && systolicBloodPressure <= 120) 
                {
                    condn = true;
                }
                System.out.println("Patient is from Adolescent Age Group");
            }
        }
        
        else if (attribute.equals("WeightPounds"))
        {
            if(ageGroup < 1){
                if (weightPounds >= 4.5 && weightPounds <= 7)
                {
                    condn = true;
                }

                System.out.println("Patient is from New Born Age Group");

            }
            else if (ageGroup >0 && ageGroup <= 1) {
                if (weightPounds >= 9 && weightPounds <= 22) {
                    condn = true;
                }

                System.out.println("Patient is from Infant Age Group");

            } else if (ageGroup > 1 && ageGroup <= 3) {
                if (weightPounds >= 22 && weightPounds <= 31) {
                    condn = true;
                }

                System.out.println("Patient is from Toddler Age Group");

            } else if (ageGroup > 3 && ageGroup <= 5) {
                if (weightPounds >= 31 && weightPounds <= 40) {
                    condn = true;
                }
                System.out.println("Patient is from PreSchooler Age Group");

            } else if (ageGroup > 6 && ageGroup <= 12) {
                if (weightPounds >= 41 && weightPounds <= 92) {
                    condn = true;
                }
                System.out.println("Patient is from School Age Group");

            } else {
                if (weightPounds >= 110) {
                    condn = true;
                }
                System.out.println("Patient is from Adolescent Age Group");
            }
           
        }
      return condn;
    }
}

    
