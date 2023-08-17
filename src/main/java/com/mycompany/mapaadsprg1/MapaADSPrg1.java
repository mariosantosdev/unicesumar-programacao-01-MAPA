/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mapaadsprg1;

/**
 *
 * @author mariosantos
 */
public class MapaADSPrg1 {

    public static void main(String[] args) {
        // Glicemia
        Glicemia glicemia = new Glicemia();
        
        glicemia.registerExam();
        glicemia.showResult();
        
        // Colesterol
        Colesterol colesterol = new Colesterol();
        
        colesterol.registerExam();
        colesterol.showResult();
        
        // Triglicerideos
        Triglicerideos triglicerideos = new Triglicerideos();
        
        triglicerideos.registerExam();
        triglicerideos.showResult();
    }
}
