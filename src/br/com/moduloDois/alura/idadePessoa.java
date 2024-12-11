package br.com.moduloDois.alura;

public class idadePessoa {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String exibirIdade(){
        if (idade >= 18){
            return " Pode passar é maior de Idade";
        }
        return "Não pode passar é menor de 18";
    }

    /*
     //* Peguei no Chat gpt, nunca tinha utilizado ternario aqui no java
     Parece ser mais fácil do que no Python, achei bem intuitiva a sintaxe //;
    public String exibirInformacoes() {
        return "Nome: " + nome + ", Idade: " + idade +
                (idade <= 18 ? ". Não pode passar, é menor de 18." : ". Pode passar, é maior de 18.");
    }
     */

}
