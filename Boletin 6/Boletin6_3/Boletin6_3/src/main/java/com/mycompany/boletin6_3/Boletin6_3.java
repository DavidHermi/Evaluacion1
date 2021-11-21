/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.boletin6_3;

/**
 *
 * @author David
 */
public class Boletin6_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Circulo c1 = new Circulo();
        c1.setRadio(87.4);
        c1.calcularArea();
        c1.calcularLonxitude();

        System.out.println("-------------------------");

        Circulo c2 = new Circulo(67.8);
        c2.calcularArea();
        c2.calcularLonxitude();
    }
    
}
