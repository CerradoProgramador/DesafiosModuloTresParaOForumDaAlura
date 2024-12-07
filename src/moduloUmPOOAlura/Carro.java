package moduloUmPOOAlura;

public class Carro {
    String marca;
    int anoDeLancamento;
    String cor;

    public void exibirFichaTecnica(){
        System.out.println("\nMarca: " + marca);
        System.out.println("Ano: " + anoDeLancamento);
        System.out.println("Cor: " + cor);
    }

    public void falarIdadeCarro() {
        int anoAtual = 2024;
        int idade = anoAtual - anoDeLancamento;

        if (idade == 0) {
            System.out.println("moduloUmPOOAlura.Carro de Lançamento");
        } else if (idade <= 3) {
            System.out.println("moduloUmPOOAlura.Carro Semi Novo");
        } else if (idade > 20) {
            System.out.println("Vai pagar mais IPVA não paizão");
        } else {
            System.out.println("A idade do carro é de " + idade + " anos.");
        }
    }

}
