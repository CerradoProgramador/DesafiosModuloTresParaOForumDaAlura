package moduloTres.alura.contaBancaria;

public class ContaBancaria {
    private int idConta;
    private String titular;
    protected double saldo;


    public double depositar(double valor) {
        this.saldo += valor;
        System.out.println("Foi depositado o valor de " + valor + " consulte seu novo saldo");
        return this.saldo;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
        System.out.println("Você sacou o total de " + valor + " foi sacado com sucesso");
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: " + this.saldo);
    }

    public double getSaldo() {
        return saldo;
    }



}
