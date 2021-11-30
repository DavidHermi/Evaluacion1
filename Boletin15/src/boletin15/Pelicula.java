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
public class Pelicula extends Multimedia {
    private String actorPrincipal;
    private String actrizPrincipal;

    public Pelicula(String actorPrincipal, String actrizPrincipal, String Autor, String Titulo, String Formato, int duracion) {
        super(Autor, Titulo, Formato, duracion);
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }
    
       @Override
    public String toString() {
        return super.toString()+"Pelicula{"+"actrizPrincipal,actorPrincipal="+actrizPrincipal+actorPrincipal+')';
    }       
    
    
    
    
    
    
}
