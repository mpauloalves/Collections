package list.Pesquisa.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoalList;

    public OrdenacaoPessoa() {
        this.pessoalList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoalList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoalList);
        Collections.sort(pessoasPorIdade, (p1, p2) -> Integer.compare(p1.getIdade(), p2.getIdade()));
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoalList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 30, 1.80);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 25, 1.70);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 17, 1.56);

       // System.out.println("Ordenado por Idade: " + ordenacaoPessoa.ordenarPorIdade());
       System.out.println("Ordenado por Altura: " + ordenacaoPessoa.ordenarPorAltura());
    }
}
