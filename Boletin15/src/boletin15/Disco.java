/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin15;

/**
 *
 * @author dam1
 */
public class Disco extends Multimedia {
   
 private String xenero ;

    public Disco() {
    }

    public Disco(String xenero, String Autor, String Titulo, String Formato, int duracion) {
        super(Autor, Titulo, Formato, duracion);
        this.xenero = xenero;
    }

    public void setXenero(String xenero) {
        this.xenero = xenero;
    }

 
     @Override
    public String toString() {
        return super.toString()+"Disco{"+"Disco="+xenero+')';
    }  
 
 
 
}
    
    
    

