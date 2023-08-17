/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapaadsprg1;

import java.time.Year;
import javax.swing.JOptionPane;

/**
 *
 * @author mariosantos
 */
public class Colesterol extends Exames {
    private int ldlPerMgL;
    private int hdlPerMgL;  
    private String patientRisk;
    
    public int getLdlPerMgL() {
        return ldlPerMgL;
    }

    public void setLdlPerMgL(int ldlPerMgL) {
        this.ldlPerMgL = ldlPerMgL;
    }

    public int getHdlPerMgL() {
        return hdlPerMgL;
    }

    public void setHdlPerMgL(int hdlPerMgL) {
        this.hdlPerMgL = hdlPerMgL;
    }

    public String getPatientRisk() {
        return patientRisk;
    }

    public void setPatientRisk(String patientRisk) {
        this.patientRisk = patientRisk;
    }
    
    @Override
    public void registerExam(){
        this.setPatientName(JOptionPane.showInputDialog("Digite o nome do paciente"));
        this.setBloodGroup(JOptionPane.showInputDialog("Digite o tipo sanguinio do paciente"));
        this.setBirthdayYear(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento do paciente")));
        
        this.setLdlPerMgL(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidede de colesterol LDL do paciente (por mg/L)")));
        this.setHdlPerMgL(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidede de colesterol HDL do paciente (por mg/L)")));
        this.setPatientRisk(JOptionPane.showInputDialog("Digite o risco do paciente (A - Alto; M - Médio; B Baixo)"));
    }
    
    @Override
    public String classificate(){
        int patientAge = Year.now().getValue() - this.getBirthdayYear();
        String result = "";
        
        // Classificate HDL
        if(patientAge >= 0 && patientAge <= 19){
            if (this.getHdlPerMgL() > 45){
                result = "Classificação HDL: BOM\n";
            }else{
                result = "Classificação HDL: RUIM\n";
            }
        }else{
            if (this.getHdlPerMgL() > 40){
                result = "Classificação HDL: BOM\n";
            }else{
                result = "Classificação HDL: RUIM\n";
            }
        }
        
        // Classificate LDL
        switch(this.getPatientRisk()){
            case "B": // Baixo
                if(this.getLdlPerMgL() < 100){
                    result += "Classificação LDL: BOM";
                }else{
                    result += "Classificação LDL: RUIM";
                }
                break;
            case "M": // Médio
                if(this.getLdlPerMgL() < 70){
                    result += "Classificação LDL: BOM";
                }else{
                    result += "Classificação LDL: RUIM";
                }
                break;
            case "A": // Alto
                if(this.getLdlPerMgL() < 50){
                    result += "Classificação LDL: BOM";
                }else{
                    result += "Classificação LDL: RUIM";
                }
                break;
        }
        
        return result;
    }
    
    @Override
    public void showResult(){
        String message = "";
        String result = this.classificate();
        
        message += this.patientInfo();
        message += "Colesterol HDL por mg/L: " + this.getHdlPerMgL() + "\n";
        message += "Colesterol LDL por mg/L: " + this.getLdlPerMgL() + "\n";
        message += "Risco do paciente: " + this.getPatientRisk() + "\n";
        message += result;
        
        JOptionPane.showMessageDialog(null, message);
    }
}
