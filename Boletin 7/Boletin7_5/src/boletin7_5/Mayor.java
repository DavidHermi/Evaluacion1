/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_5;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Mayor {
    
     public void esMaior () {
    
         int num1 = lerNumero ();
         
         int num2 = lerNumero ();
         
         int num3 = lerNumero ();
         
         
         if (num1>num2|num1>num3) {
     
         System.out.println(num1+"es mayor");
     }
         
         else if (num2>num1|num2>num3)
         {
         
             System.out.println(num2+"es mayor");
         
         }
         
         
         else if (num3>num1|num3>num2) {
         
             System.out.println(num3+"es maior");   
         
         }
         
            System.out.println("FIN");
     }
           
     
     
     public int lerNumero() {
    
    String resposta = JOptionPane.showInputDialog("teclea numero entero:");
    int num =Integer.parseInt (resposta);
    
     return num;
    
    
    }
    
    
    
    
}

    