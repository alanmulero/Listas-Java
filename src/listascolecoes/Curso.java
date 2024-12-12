/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listascolecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author alan_
 */
public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private List<Aluno> alunos = new ArrayList<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas); // Devolve uma copia que não pode ser alterada
    }

    // método para ver se aluno esta matriculado
    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }


    // Método para adicionar aula e proteger lista
    public void adicionaAula(Aula aula){
        this.aulas.add(aula);
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + ", instrutor=" + instrutor + ", aulas=" + aulas + '}';
    }
    
    
    
    
}
