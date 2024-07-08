package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {

    // atributos

    private List<Livro> livrolList;

    public CatalagoLivros() {
        this.livrolList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {

        livrolList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {

        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrolList.isEmpty()) {
            for (Livro l : livrolList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }

        }
        return livrosPorAutor;

    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livrolList.isEmpty()) {
            for (Livro l : livrolList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }

            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livrolList.isEmpty()) {
            for (Livro l : livrolList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }

        }

        return livroPorTitulo;

    }
        public static void main(String[] args) {
            CatalagoLivros catalagoLivros = new CatalagoLivros();
            catalagoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
            catalagoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
            catalagoLivros.adicionarLivro("Livro 3", "Autor 2", 2022);
            catalagoLivros.adicionarLivro("Livro 4", "Autor 4", 2023);
            catalagoLivros.adicionarLivro("Livro 5", "Autor 5", 2000);

            System.out.println(catalagoLivros.pesquisarPorAutor("Autor 2"));
            System.out.println(catalagoLivros.pesquisarPorIntervaloAnos(2020, 2022));
            System.out.println(catalagoLivros.pesquisarPorTitulo("Livro 1"));
        }

}
