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
public class Multimedia {
    private String Autor ;
    private String Titulo ;
    private String Formato ;
    private int duracion ;

    public Multimedia() {
    }

    public Multimedia(String Autor, String Titulo, String Formato, int duracion) {
        this.Autor = Autor;
        this.Titulo = Titulo;
        this.Formato = Formato;
        this.duracion = duracion;
    }

    public String getAutor() {
        return Autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getFormato() {
        return Formato;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "Multimedia{" + "Autor=" + Autor + ", Titulo=" + Titulo + ", Formato=" + Formato + ", duracion=" + duracion + '}';
    }
    
    
    
    
}
