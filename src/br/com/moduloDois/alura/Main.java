package br.com.moduloDois.alura;

public class Main {
    public static void main(String[] args) {

        //* Conta Bancaria

        ContaBancaria sd01 = new ContaBancaria();

        sd01.setTitular("Pedro Pires Mangueira");
        sd01.setNumeroConta(000001);

        System.out.println("Titular: " + sd01.getTitular());
        System.out.println("Numero Conta: " + sd01.getNumeroConta());

        //* Idade Pessoa

        idadePessoa juba = new idadePessoa();

        juba.setIdade(19);
        System.out.println("\nAnalisando idade...");
        juba.setNome("Jubinha");
        System.out.println("Nome: " + juba.getNome() + juba.exibirIdade());
        //*System.out.println(juba.exibirInformacoes());

        //* Desconto Produtos

        Produto hyperXCloud = new Produto();

        hyperXCloud.setNome("HyperX Cloud 7.1");
        hyperXCloud.setPreco(400);
        System.out.println("\n" + hyperXCloud.getNome() + " \n" + hyperXCloud.getPreco() + " Reais");
        System.out.println("Aplicando Desconto...");
        hyperXCloud.calcularDesconto(40);
        System.out.println("Com o desconto o preço final é de: " + hyperXCloud.getPreco());
        System.out.println("Compre à vista ou Parcel em 12x sem JUROS no cartão ALURA!");

        //* Aluno

        Aluno vinicius = new Aluno();

        vinicius.setNome("Vinicius");
        vinicius.calcularMedia(8,9,10,6);

        Aluno obito = new Aluno();

        obito.setNome("Obito");
        obito.calcularMedia(2,3,4,5);

        Aluno torugo = new Aluno();

        torugo.setNome("Torugo");
        torugo.calcularMedia(2,3,4,1);

        //* Livro

        Livro piadasDoLivret = new Livro();

        piadasDoLivret.setTitulo("Piadas do Livret");
        piadasDoLivret.setAutor("Gabriel Márcio JR");

        piadasDoLivret.exibirDetalhesLivro();
    }
}
