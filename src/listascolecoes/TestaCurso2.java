/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listascolecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author alan_
 */
public class TestaCurso2 {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("colecao testacurso2", "paulo2");

        javaColecoes.adicionaAula(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adicionaAula(new Aula("Criando uma Aula", 20));
        javaColecoes.adicionaAula(new Aula("Modelando com colecoes", 24));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();

        // Usando um segundo construtor que recebe o proprio tipo para oferecer uma copia de lista.
        // visto que a lista tem um atributo imutavel
        List<Aula> aulasCopiaExata = new ArrayList<>(aulasImutaveis); // aqui ele copia
        // Depois disso o metodo Collections.sort() funciona novamente.
        System.out.println(aulasImutaveis);
        Collections.sort(aulasCopiaExata);
        System.out.println(aulasCopiaExata);

    }

}
