/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listascolecoes;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author alan_
 */
public class ListasColecoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String aula1 = "Modelando a classe Aula";
        String aula2 = "Conhecendo mais de listas";
        String aula3 = "Trabalhando com Cursos e Sets";
        String aula4 = "Modelando a classe Aula 2";
        String aula5 = "Modelando a classe Aula 3";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        aulas.add(aula4);
        aulas.add(aula5);
        // removendo por index
        aulas.remove(2);
        
        // Ordenando com método sort()
        Collections.sort(aulas);

        for (String aula : aulas) {
            System.out.println(aula);
        }
        
        // Método foreach
        aulas.forEach(item -> {System.out.println("Para cada aula: " + item);});
        
        
        
        
    }

}
