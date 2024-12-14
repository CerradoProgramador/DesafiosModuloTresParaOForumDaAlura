package moduloTres.alura.carros;

public class Carros {
    private String modelo;
    private double preco22;
    private double preco23;
    private double preco24;
    private double menorPrecoTrienio;


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void exibeFichaTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Média de Preço no Triênio: " + getPrecoMedioTrienio());
        System.out.println("Menor Preço do Triênio: " + getMenorPrecoTrienio());
    }

    public void setPrecoMedioTrienio(double preco22, double preco23, double preco24 ) {
        menorPrecoTrienio = preco22;

        this.preco22 = preco22;
        this.preco23 = preco23;
        this.preco24 = preco24;

        if (preco22 > preco23) {
            menorPrecoTrienio = preco23;
        }

        if (preco23 > preco24) {
            menorPrecoTrienio = preco24;
        }

        return;

    }

    public double getMenorPrecoTrienio() {
        return menorPrecoTrienio;
    }

    public double getPrecoTrienio() {
        return preco22 + preco23 + preco24;
    }

    public double getPrecoMedioTrienio() {
        int trienio = 3;
        double precoMedio = getPrecoTrienio() / trienio;
        return Math.round(precoMedio);
    }
}
