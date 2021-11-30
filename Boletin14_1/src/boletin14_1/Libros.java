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
public class Libros extends Publicacion {
    
    private boolean  prestado ;

    public Libros() {
    }

    public Libros  ( String prestado) {
        super ();
        this.prestado = false ;
       
     
    }

    @Override
    public String toString() {
        return super.toString()+"libro{"+"prestado="+prestado+')';
    }
    
    @Override
     public int getCodigo() {
        return super.getCodigo();
    }
@Override
    public int getAno() {
        return super.getAno();
 
  
    
}
}
