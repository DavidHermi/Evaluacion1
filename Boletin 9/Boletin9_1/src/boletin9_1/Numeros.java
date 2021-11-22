/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_1;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Numeros {
    
    
      
    
      
        private int i = 0;
        private int num = 0;
        private int n = 0;
        private int p = 0;
        private int c0 = 0;

       

        public void diezNums() {

            while (i<10){

                num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));

                if (num==0){c0++;}
                if (num>0){p++;}
                if (num<0){n++;}

                i++;

            }

            JOptionPane.showMessageDialog(null, "Tienes " +  p + " positivos, " + n + " negaticos y " + c0 + " ceros");

        }



    }
   
   
   
          
          
          
          
          
          
          

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  
    
    
    

