package moduloTres.alura.carros;

public class Honda extends Carros{

    private String modelo;
    private String cor;
    private double consumoDoCarro;
    private double kmPercorrido;
    private double gasolinaGasta;

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getKmRodado(double kmPercorrido, int gasolinaGasta) {
        this.kmPercorrido = kmPercorrido;
        this.gasolinaGasta = gasolinaGasta;

        consumoDoCarro = kmPercorrido / gasolinaGasta;
        return consumoDoCarro;
    }

    public double getConsumoDoCarro() {
        return consumoDoCarro;
    }

    @Override
    public void exibeFichaTecnica(){
        System.out.println("\nModelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Consumo por Litro(descrito): " + consumoDoCarro);
        System.out.println("Média de Preço no Triênio: " + getPrecoMedioTrienio());
        System.out.println("Menor Preço do Triênio: " + getMenorPrecoTrienio());

    }
}
