/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.boletin6_3;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class Radio {
      double radio;
        final double Pi = 3.14;

        public Circulo() {
        }

        public Circulo(double radio) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Radio de la circunferencia: ");
            radio = sc.nextDouble();
            this.radio = radio;

        }

        public void setRadio(double radio) {
            this.radio = radio;
        }

        public double getRadio() {
            return radio;
        }

        public void calcularArea() {

            System.out.println("El area de la circunferencia es: " + (Math.pow(radio, 2)) * Pi);

        }

        public void calcularLonxitude() {

            System.out.println("La longitud de la circunferencia es: " + 2 * Pi * radio);

        }

    }

