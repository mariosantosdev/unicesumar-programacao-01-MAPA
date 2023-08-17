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
public class Triglicerideos extends Exames {
    private int triglicerídeoPerMgL;
    // Esta variavel não possui getter & setter pois ela é privada e não vi necessidade de implementar esses metodos.
    private String resultTriglicerídeoPerMgL;

    public int getTriglicerídeoPerMgL() {
        return triglicerídeoPerMgL;
    }

    public void setTriglicerídeoPerMgL(int triglicerídeoPerMgL) {
        this.triglicerídeoPerMgL = triglicerídeoPerMgL;
    }
    
    @Override
    public String classificate(){
        int patientAge = Year.now().getValue() - this.getBirthdayYear();        
        
        if (patientAge>= 0 && patientAge <= 9){
            if(this.getTriglicerídeoPerMgL() < 75){
                return "Classificação: Triglicerídeo BOM";
            }else{
                return "Classificação: Triglicerídeo RUIM";
            }
        }else if (patientAge >= 10 && patientAge <= 19){
            if(this.getTriglicerídeoPerMgL() < 90){
                return "Classificação: Triglicerídeo BOM";
            }else{
                return "Classificação: Triglicerídeo RUIM";
            }
        }else{
            if(this.getTriglicerídeoPerMgL() < 150){
                return "Classificação: Triglicerídeo BOM";
            }else{
                return "Classificação: Triglicerídeo RUIM";
            }
        }
    }
    
    @Override
    public void registerExam(){
        this.setPatientName(JOptionPane.showInputDialog("Digite o nome do paciente"));
        this.setBloodGroup(JOptionPane.showInputDialog("Digite o tipo sanguinio do paciente"));
        this.setBirthdayYear(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento do paciente")));
        
        this.setTriglicerídeoPerMgL(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidede de triglicerídeos do paciente (por mg/L)")));
    }
    
    @Override
    public void showResult(){
        String message = "";
        String result = this.classificate();
        
        message += this.patientInfo();
        message += "Triglicerídeo por mg/L: " + this.getTriglicerídeoPerMgL() + "\n";
        message += result;
        
        JOptionPane.showMessageDialog(null, message);
    }
}
