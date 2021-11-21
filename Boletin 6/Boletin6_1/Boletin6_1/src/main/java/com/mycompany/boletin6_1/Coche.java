/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.boletin6_1;

/**
 *
 * @author David
 */
public class Coche {
      
    
    private int velocidade;

        public Coche(){

            velocidade = 0;

        }

        public int getVelocidade() {

            return velocidade;

        }

        public void acelerar (int aceleracion){

            velocidade = velocidade + aceleracion;

        }

        public void frenar (int freno) {

            velocidade = velocidade + freno;

        }


    }
    
    
    
    
    
    
    
    
    
    
    
    
    