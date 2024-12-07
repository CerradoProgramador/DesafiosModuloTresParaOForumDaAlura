public class Main {
    public static void main(String[] args) {

        //* Nome e Olá Mundo

        Pessoa ad000001 = new Pessoa();

        ad000001.nome = "Pedro Pires Mangueira";

        ad000001.mandarOlaMundo();

        //* Calculadora

        Calculadora numeroDobrado = new Calculadora();

        System.out.println("\nO Dobro do numero 5 é igual à " + numeroDobrado.calcularDobro(5));

        //* Spotify

        Musica fortal =  new Musica();

        fortal.titulo = "4tal";
        fortal.artista = "Matuê";
        fortal.anoDeLancamento = 2024;
        fortal.exibirFichaTecnica();

        fortal.avalia(4);
        fortal.avalia(3.5);
        fortal.avalia(4.5);
        System.out.println("Estrelas " + fortal.pegaMedia() + "/5\n");

        //*  Carro

        Carro byd = new Carro();

        byd.marca = "King";
        byd.anoDeLancamento = 2024;
        byd.cor = "Vermelho";

        byd.exibirFichaTecnica();
        byd.falarIdadeCarro();

        Carro fiat = new Carro();

        fiat.marca = "Fiat";
        fiat.anoDeLancamento = 2020;
        fiat.cor = "Prata";

        fiat.exibirFichaTecnica();
        fiat.falarIdadeCarro();

        //* Aluno

        Aluno vinicius = new Aluno();

        vinicius.nome = "Vinicius";
        vinicius.idade = 17;

        vinicius.exibirFichaAluno();
    }
}