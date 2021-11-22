/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_1;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Clase_1 {
    
    
     public void Metodo1 ( ) {
    
       
    int num1 = lerEnteiro();
   
    
        if(num1>0)
    {
        System.out.println(num1 +"es positivo" );
    
    }   
    
    
     System.out.println("remata o if");
    
    }
    
    
    public int lerEnteiro () {
    
    String resposta = JOptionPane.showInputDialog("teclea numero entero:");
    int num =Integer.parseInt (resposta);
    //tamen
//    int num - Integer.parseInt(JOptionPane.showInputDialog("teclea numero"))
    return num;
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
