/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapaadsprg1;

/**
 *
 * @author mariosantos
 */
public abstract class Exames {
    private String patientName;
    private String bloodGroup;
    private int birthdayYear;

    public String getPatientName() {
        return this.patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getBloodGroup() {
        return this.bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getBirthdayYear() {
        return this.birthdayYear;
    }

    public void setBirthdayYear(int birthdayYear) {
        this.birthdayYear = birthdayYear;
    }
    
    public String patientInfo(){
        String info = "";
        info += "Nome: " + this.getPatientName() + "\n";
        info += "Tipo Sanguinio: " + this.getBloodGroup() + "\n";
        info += "Ano de Nascimento: " + this.getBirthdayYear() + "\n";
        info += "\n";
        
        return info;
    }
    
    public abstract String classificate();
    
    public abstract void showResult();
    
    public abstract void registerExam();
}
