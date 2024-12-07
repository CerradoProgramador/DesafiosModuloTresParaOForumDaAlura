public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double somaDasAvaliacoes;
    int numeroDeAvaliacoes;

    public void exibirFichaTecnica() {
        System.out.println("\nChama " + this.titulo);
        System.out.println("Som de " + this.artista);
        System.out.println("Lançado em " + this.anoDeLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        numeroDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / numeroDeAvaliacoes;
    }


}
