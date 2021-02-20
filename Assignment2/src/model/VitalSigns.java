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
public class VitalSigns {
    private float ageGroup;
    private float respiratoryRate; 
    private float heartRate;
    private float systolicBloodPressure;
    private float weightKg;
    private float weightPounds;

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
    
    public boolean isNormal(){
        boolean condn = true;
        
        if(ageGroup <= 1)
        {
            if((respiratoryRate>=20 && respiratoryRate <=30) && (heartRate>=80 && heartRate<=140) &&
                    (systolicBloodPressure>=70 && systolicBloodPressure<=100) && (weightKg>=4 && weightKg<=10) && 
                    (weightPounds>=9 && weightPounds<=22)){
                condn = true;
            }
            
            System.out.println("Patient is Infant");
            
        }
        else if(ageGroup >=1 && ageGroup<=3)
        {
            if((respiratoryRate>=20 && respiratoryRate <=30) && (heartRate>=80 && heartRate<=130) &&
                    (systolicBloodPressure>=80 && systolicBloodPressure<=110) && (weightKg>=10 && weightKg<=14) && 
                    (weightPounds>=22 && weightPounds<=31)){
                condn = true;
            }
            
            System.out.println("Patient is Toddler");
            
        }
        else if(ageGroup >=3 && ageGroup<=5)
        {
            if((respiratoryRate>=20 && respiratoryRate <=30) && (heartRate>=80 && heartRate<=120) &&
                    (systolicBloodPressure>=80 && systolicBloodPressure<=110) && (weightKg>=14 && weightKg<=18) && 
                    (weightPounds>=31 && weightPounds<=40)){
                condn = true;
        }
            System.out.println("Patient is PreSchooler");
            
        }
        else if(ageGroup >=6 && ageGroup<=12)
        {
            if((respiratoryRate>=20 && respiratoryRate <=30) && (heartRate>=70 && heartRate<=110) &&
                    (systolicBloodPressure>=80 && systolicBloodPressure<=120) && (weightKg>=20 && weightKg<=42) && 
                    (weightPounds>=41 && weightPounds<=92)){
                condn = true;
        }
            System.out.println("Patient is School Age");
            
        }
        else
        {
            if((respiratoryRate>=12 && respiratoryRate <=20) && (heartRate>=55 && heartRate<=105) &&
                        (systolicBloodPressure>=110 && systolicBloodPressure<=120) && (weightKg>50) && 
                        (weightPounds>=110)){
                condn = true;
            }
           System.out.println("Patient is Adolescent"); 
        }
        return condn;
    }
}

 

