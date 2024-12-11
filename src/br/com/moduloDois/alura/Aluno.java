package br.com.moduloDois.alura;

public class Aluno {
    private String nome;
    private double notaFinal;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaFinal() {
        return notaFinal;
    }


    public double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
        notaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
        if (notaFinal >= 6) {
            System.out.println("\n" + nome + " Passou com a nota " + notaFinal);
        } else if (notaFinal <= 3) {
            System.out.println("\n" + nome + " Reprovou com a nota " + notaFinal);
        } else {
            System.out.println("\n" + nome + " Está de recuperação com a nota " + notaFinal);
        }
        return notaFinal;
    }
}
