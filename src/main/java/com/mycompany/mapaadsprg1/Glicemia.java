/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapaadsprg1;

import javax.swing.JOptionPane;

/**
 *
 * @author mariosantos
 */
public class Glicemia extends Exames {
    private int glucosePerMgL;
    
    public int getGlucosePerMgL() {
        return this.glucosePerMgL;
    }

    public void setGlucosePerMgL(int glucosePerMgL) {
        this.glucosePerMgL = glucosePerMgL;
    }
       
    @Override
    public void registerExam(){
        this.setPatientName(JOptionPane.showInputDialog("Digite o nome do paciente"));
        this.setBloodGroup(JOptionPane.showInputDialog("Digite o tipo sanguinio do paciente"));
        this.setBirthdayYear(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento do paciente")));
        
        this.setGlucosePerMgL(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidede de glicose do paciente (por mg/L)")));
    }
    
    @Override
    public String classificate(){
        if(this.glucosePerMgL < 100){
            return "Classificação: Normoglicemia";
        }else if(this.glucosePerMgL >= 100 && this.glucosePerMgL < 126){
            return "Classificação: Pré-diabetes";
        }else{
            return "Classificação: Diabetes estabelecido";
        }
    }
    
    @Override
    public void showResult(){
        String message = "";
        String result = this.classificate();
        
        message += this.patientInfo();
        message += "Glicose por mg/L: " + this.getGlucosePerMgL()+ "\n";
        message += result;
        JOptionPane.showMessageDialog(null, message);
    }
}
