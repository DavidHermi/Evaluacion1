/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_3;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Clase_3 {
    
    Scanner sc = new Scanner (System.in); 
    
    

      public void comparaNumero() {
    
          int num1 = lerNumero ();
      
           
           if (num1>0) {
               System.out.println("+") ;
         
           
           
           
           
           }
           
           else if (num1<0)
           
           
           {
           
               System.out.println("-");
           
           
           }
           
           else if (num1==0)
               
           {
           
               System.out.println("0");
               
           }
    
    
      System.out.println("remata o if");
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public int lerNumero() {
     System.out.println("teclea el numero :");
     int num= sc.nextInt();
     return num;
    
    
    
     } 
    
    
    
    
    
}
