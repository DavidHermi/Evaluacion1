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
public class Publicacion {
        private int codigo; 
         private int ano;
       private String titulo;
    public Publicacion() {
        
        
        
        
        
    }

    public Publicacion(int codigo, int ano, String titulo) {
        this.codigo = codigo;
        this.ano = ano;
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "codigo=" + codigo + ", ano=" + ano + ", titulo=" + titulo + '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public int getAno() {
        return ano;
    }
    
    
   
        
    
    
    
}
