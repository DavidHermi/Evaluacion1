/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_2;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Clase_2 {
      Scanner sc = new Scanner (System.in);
      
      
      public void Metodo2 () {
    
           short num1 = lerEnteiro();
           short num2 = lerEnteiro ();  
           short resta = (short) (num1 - num2) ;
           short suma = (short) (num1 + num2);
           
           if (num1>=num2) {
               System.out.println("resta" +resta);
         
           
           
           
           
           }
           
           else 
           
           
           {
           
               System.out.println("suma"+suma);
           
           
           }
    
    
      System.out.println("remata o if");
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     public short lerEnteiro () {
     System.out.println("teclea el numero :");
     short num= sc.nextShort();
     return num;
    
    
    
     } 
    
    
    
    
    
}
