package listascolecoes;

import java.util.HashSet;
import java.util.Set;

public class TestaTabelaEspalhamento {

    public static void main(String[] args) {

        // Testando o hashCode()  @Overrride

        // Instanciando um conjunto Set
        Set<TabelaEspalhamento> tabela = new HashSet<TabelaEspalhamento>();
        TabelaEspalhamento tabelaEspalhamentos = new TabelaEspalhamento(null, 0);
        //metodo add()
        tabelaEspalhamentos.adiconaAluno(new TabelaEspalhamento("Eli",48));
        tabelaEspalhamentos.adiconaAluno(new TabelaEspalhamento("Queila",50));
        tabelaEspalhamentos.adiconaAluno(new TabelaEspalhamento("Flavia",36));
        tabelaEspalhamentos.adiconaAluno(new TabelaEspalhamento("Janaina",46));

        TabelaEspalhamento t1 = new TabelaEspalhamento("Mulerinho", 16);
        TabelaEspalhamento t2 = new TabelaEspalhamento("Pituca", 11);
        TabelaEspalhamento t3 = new TabelaEspalhamento("Didi", 50);
        TabelaEspalhamento t4 = new TabelaEspalhamento("Alan", 56);
        
        tabela.add(t1);
        tabela.add(t4);
        
        for (TabelaEspalhamento item : tabela) {
			System.out.println(item);
		}
        
        System.out.println(tabela.contains(t4));
        TabelaEspalhamento tabelaEspalhamento = new TabelaEspalhamento("fusca", 1);

   
        // testando objetos com contains()
        tabelaEspalhamento.adiconaAluno(t3);
        System.out.println(tabelaEspalhamento);
        System.out.println(tabelaEspalhamento.estaCadastrado(t3));

        // não respeita a ordem
    

        Aluno testeSet = new Aluno("Mulero" ,123);

        // Testando equals()
        TabelaEspalhamento novoAluno = new TabelaEspalhamento("Mulerinho", 100);
        novoAluno.adiconaAluno(t2);
        novoAluno.estaCadastrado(novoAluno);
        // testando equals() nome novoAluno e t1 = Mulerinho
        System.out.println(novoAluno.equals(t1));  // true
        





    }

}
