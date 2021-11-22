/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_4;

import java.util.Scanner;




public class Nome {
   Scanner sc = new Scanner (System.in);
   

   
    
   
   
   
   
   
   public void Nome_Peso () {
    String nom1 = getNome ();
    int pes1 = getPeso ();
     String nom2 = getNome ();   
      int pes2 = getPeso ();  
  
    
    }
    
    
    
    
       public int getPeso () {
    
     System.out.println("Teclea el peso:");
   int pes= sc.nextInt ();
     
   return pes;
   
      
    
    }
       
       
     public String getNome () {
     
         System.out.println("teclea el nombre");
         String nom= sc.toString();
         
         return nom ;
         
     
     } 
    
    
    
    
    
    
    
}
