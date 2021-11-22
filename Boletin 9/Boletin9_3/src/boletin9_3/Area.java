/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_3;

import javax.swing.*;
public class Area {
     private boolean positivo = false;
        private int b;
        private int h;

        public Area(){}

        public void areatriangulo(){

            do {

                b = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                h = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));

                if (b<=0 || h<=0){JOptionPane.showMessageDialog(null, "Introduce un valor positivo");}

                if (b>0 && h>0) { positivo = true;}
            }
            while (positivo == false);

            float area = (float) (b*h)/2;

            JOptionPane.showMessageDialog(null, "Area del triangulo: " + area);

        }


    }

