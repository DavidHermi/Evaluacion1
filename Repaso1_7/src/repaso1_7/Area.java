/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso1_7;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Area {
    
    private int l ;
    private int i = 0 ;
    
    
     public void Area () {
     
     while (i<1){
         do {
      l = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado positivo"));
      
      
      
         } while (l<0);
         
         
     int Area = l* l ;
         System.out.println("El Area es:  "+Area);
     
     i++;
     
     
     
     }
         
     
     
     
     
     
     }
     
    
    
}
