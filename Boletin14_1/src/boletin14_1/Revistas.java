/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14_1;

/**
 *
 * @author dam1
 */
public class Revistas extends Publicacion {
    
    private int numrevista ;

    public Revistas(int num ) {
        super ();
        
        this.numrevista = num;
    }
    
    
    
     @Override
    public String toString() {
        return super.toString()+"revista{"+"numrevista="+numrevista+')';
    }
    
    
         public int getCodigo() {
        return super.getCodigo();
    }

    public int getAno() {
        return super.getAno();
 
  
    
}
    
}
