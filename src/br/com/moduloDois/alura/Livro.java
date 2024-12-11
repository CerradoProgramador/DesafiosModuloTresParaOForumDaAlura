package br.com.moduloDois.alura;

public class Livro {

    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhesLivro(){
        System.out.println("\n" + "Compre o livro \n" + titulo + "\n" + "Autor: " + autor);
    }
}
