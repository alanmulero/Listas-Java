package listascolecoes;

import java.util.HashSet;
import java.util.Set;

public class TabelaEspalhamento {

    private String nome;
    private int numeroMatricula;
    private final Set<TabelaEspalhamento> setAluno = new HashSet<>();


    public void adiconaAluno(TabelaEspalhamento nome){
        this.setAluno.add(nome);
    }

    public TabelaEspalhamento(String nome, int numeroMatricula) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;

    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public String toString() {
        return "TabelaEspalhamento{" +
                "nome='" + nome + '\'' +
                ", numeroMatricula=" + numeroMatricula +
                ", setAluno=" + setAluno +
                '}';
    }
}
