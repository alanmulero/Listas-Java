package listascolecoes;

import java.util.HashSet;
import java.util.Objects;
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
    
    // metodo verifica se nome foi cadastrdo
    public boolean estaCadastrado(TabelaEspalhamento nome) {
    	return this.setAluno.contains(nome.getNome());
    }

    @Override
    public String toString() {
        return "TabelaEspalhamento{" +
                "nome='" + nome + '\'' +
                ", numeroMatricula=" + numeroMatricula +
                ", setAluno=" + setAluno +
                '}';
    }

	@Override
	public int hashCode() {
		return Objects.hash(nome, numeroMatricula);
	}


    
    // Reescrevendo equals()
	@Override
	public boolean equals(Object obj) {
		// casting
		TabelaEspalhamento outro = (TabelaEspalhamento) obj;
		return this.nome.equals(outro.nome);
	}
    
}
