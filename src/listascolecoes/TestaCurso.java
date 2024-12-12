/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listascolecoes;

import java.util.List;

/**
 *
 * @author alan_
 */
public class TestaCurso {
    public static void main(String[] args) {
        
        Curso javaColecoes = new Curso("COlecoes Java", "Paulo");
        // tenho que criar um metodo para adicionar aulas porque esta com a lista protegida com Collections.unmodifiableList(aulas); // Devolve uma copia que não pode ser alterada
    //   javaColecoes.getAulas().add(new Aula("Trabalhando co ArrayList", 56));//criando e instanciando e populando list
        List<Aula> aulas = javaColecoes.getAulas();
        javaColecoes.adicionaAula(new Aula("Aula protegida", 2));
        // Mesma referencia abaixo, mesmo apontamento.
        System.out.println(aulas);
        System.out.println(javaColecoes);
        
        // Criando segundo curso
        Curso colecoes2 = new Curso("Colecoes 2", "Nico");
        colecoes2.adicionaAula(new Aula("Colecao Java 2", 23));
        colecoes2.adicionaAula(new Aula("Pós graduação em Java", 500 ));
        colecoes2.adicionaAula(new Aula("git", 30));

    }
    
}
