/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listascolecoes;

import java.util.Collections;

/**
 *
 * @author alan_
 */
public class Aula implements Comparable<Aula>{
    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }

    @Override
    public String toString() {
        return "Aula :{" + "titulo=" + titulo + ", tempo=" + tempo + '}';
    }
    
    // Ordenando lista de objetos:
    //  implementando metodo compareTo()
    @Override
    public int compareTo(Aula o) {
        return this.titulo.compareTo(o.titulo);
           
    }
     // Agora o Collections.sort() funciona com <aula>
    
            
    
}
