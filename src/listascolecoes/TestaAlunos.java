/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listascolecoes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author alan_
 */
public class TestaAlunos {
    public static void main(String[] args) {
        
    
    // Usando os sets
    // Poderia ter sido mais genérico e ter usado Collection<String>
    Set<String> alunos = new HashSet<>();
    // métodos que tem no set:
    // não tem ordem e não posso repetir item
    alunos.add("alan");
    alunos.add("juju");
    alunos.add("didi");
    alunos.add("pituca");
    
    for (String aluno: alunos){
        System.out.println(aluno);
    }
    // removendo
    alunos.remove("pituca");
    // lambda
    alunos.forEach(aluno -> System.out.println("forEach: "+aluno));
    
    // conteins: presente em todoas as coleções
    
        System.out.println(alunos.contains("pituca"));
        
        // Se for preciso determinar posições de elementos, posso fazer uma
        // copia fiel do set em uma list
        
        List<String> alunosEmLista = new ArrayList<>(alunos);
        System.out.println(alunosEmLista.get(1));

        // Testando se aluno esta matriculado
        System.out.println(alunos.contains("alan"));

        //Testando o equals em objetos
        Aluno neny = new Aluno("Neny", 22);
        Aluno neny2 = new Aluno("Neny Gorda", 235);
        System.out.println();
    
    }  
}
