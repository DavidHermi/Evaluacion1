/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.boletin6_1;

/**
 *
 * @author David
 */
public class Boletin6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Coche car = new Coche();
        car.acelerar(56);
        System.out.println("Velocidad: "+car.getVelocidade()+"Km/h");
        car.frenar(14);
        System.out.println("Velocidad: "+car.getVelocidade()+"Km/h");
    }
    
}
