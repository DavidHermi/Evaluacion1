/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_5;

import javax.swing.*;
public class Sueldo {
    private int i = 0;
        private int numT;
        private int mil = 0;
        private int xMil = 0;

    public Sueldo(){}

        public void traballadoresSoldo(){

            numT = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de trabajadores"));

            while (i<numT){

                int $ = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero del trabajador " + (i+1)));

                if ($>1000 && $<1750){mil++;}

                else if ($<1000){xMil++;}

                i++;

            }

            float menosMil = ((xMil*100)/numT);

            JOptionPane.showMessageDialog(null, "Hay " + mil + " trabajadores que cobran entre 1000€ y 1750€."
                    + "\nEl "+menosMil+"% de trabajadores no llega a los 1000€.");

        }

}
