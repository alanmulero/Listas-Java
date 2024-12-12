package listascolecoes;

import java.util.HashSet;
import java.util.Set;

public class TestaTabelaEspalhamento {

    public static void main(String[] args) {

        // Testando o hashCode()  @Overrride

        // Instanciando um conjunto Set
        Set<TabelaEspalhamento> tabelaEspalhamentos = new HashSet<>();

        // metodo add()
//        tabelaEspalhamentos.add(new TabelaEspalhamento("Eli",48));
//        tabelaEspalhamentos.add(new TabelaEspalhamento("Queila",50));
//        tabelaEspalhamentos.add(new TabelaEspalhamento("Flavia",36));
//        tabelaEspalhamentos.add(new TabelaEspalhamento("Janaina",46));

        TabelaEspalhamento t1 = new TabelaEspalhamento("Ana", 16);
        TabelaEspalhamento t2 = new TabelaEspalhamento("Pituca", 11);
        TabelaEspalhamento t3 = new TabelaEspalhamento("Didi", 50);
        TabelaEspalhamento t4 = new TabelaEspalhamento("Alan", 56);

        tabelaEspalhamentos.add(t1);
        tabelaEspalhamentos.add(t2);
        tabelaEspalhamentos.add(t3);
        tabelaEspalhamentos.add(t4);
        // Removendo objeto
        tabelaEspalhamentos.remove(t4);
        tabelaEspalhamentos.add(new TabelaEspalhamento("Ana jujuba", 02));
        // testando objetos
        t1.adiconaAluno(t3);

        // não respeita a ordem
        for(TabelaEspalhamento t: tabelaEspalhamentos){
            System.out.println(t);
        }

        Aluno testeSet = new Aluno("Mulero" ,123);







    }
}
