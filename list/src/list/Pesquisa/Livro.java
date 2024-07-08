package list.Pesquisa;

import java.lang.reflect.Constructor;

public class Livro {

        //atributos 
        private String titulo;
        private String autor;
        private int anoPublicacao;

        public Livro(String titulo, String autor, int  anoPublicacao){
            this.titulo = titulo;
            this.autor = autor;
            this.anoPublicacao = anoPublicacao;
        }

        public String getTitulo() {
            return titulo;
        }
        public int getAnoPublicacao() {
            return anoPublicacao;
        }
        public String getAutor() {
            return autor;
        }
        
        
        @Override
        public String toString() {
        // TODO Auto-generated method stub
        return "Livro{" +
        "titulo='" + titulo + '\'' +
        ", autor='" + autor + '\'' +
        ", anoPublicacao=" + anoPublicacao +
        '}';
        }    
    }

