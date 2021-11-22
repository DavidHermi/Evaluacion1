/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_2;

import javax.swing.JOptionPane;
public class Operacion {
    
    
        private int i = 10;
        private int suma = 0;
        private double producto = 1;

    

        public void SumaProducto(){


            while (i<90){

                suma = suma + i;
                producto = (producto*i);

                i++;

            }

            JOptionPane.showMessageDialog(null, "La suma de numeros del 10 al 90 es: " + suma + ". Y el producto: " + producto);

        }

    }    
    
    
    
