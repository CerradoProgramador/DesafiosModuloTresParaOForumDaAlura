package moduloTres.alura.animal;

public class Gato extends Animal {
    private String brinquedo;
    private String arranharMoveis;

    public void setBrinquedo(String brinquedo) {
        this.brinquedo = brinquedo;
    }

    public void exibirArranharMoveis() {
        this.arranharMoveis = "Gato aranhando a TV";
    }

    @Override
    public void emitirSom() {
        System.out.println("\nmiaaaauuu");
        System.out.println("Gato brinca com o " + this.brinquedo);
        System.out.println(this.arranharMoveis);
    }


}
