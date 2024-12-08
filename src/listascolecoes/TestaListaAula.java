/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listascolecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author alan_
 */
public class TestaListaAula {
    
    public static void main(String[] args) {
        
        // Instanciando aulas objetos

        Aula a1 = new Aula("Revistando as ArrayLists", 21);
        Aula a2 = new Aula("Listas de objetos", 13);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);
        
        // Como foi implementado a classe Comparable na classe Aula, posso usar
        // Collections.sort() em <Aula>
        
        Collections.sort(aulas);
        // Para implementar uma segunda forma de comparação , como numeros.
        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);
        // Depois do Java 8, posso fazer isso dentro do metodo sort()
        aulas.sort(Comparator.comparing(Aula::getTempo));
    }
}
        
        
    
    

