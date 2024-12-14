package moduloTres.alura.contaBancaria;

public class ContaCorrente extends ContaBancaria {
    private double tarifa = 100;
    private boolean cobrarTarifa = true;

    public double getTarifa() {
        return tarifa;
    }

    public void setCobrarTarifa(boolean cobrarTarifa) {
        this.cobrarTarifa = cobrarTarifa;
    }

    public double cobrarTarifa() {
        while (cobrarTarifa) {
            if (this.saldo >= tarifa) {
                this.saldo -= tarifa;
                System.out.println("Estamos Cobrando " + tarifa + " De você, consulte seu saldo de " + this.saldo);
                cobrarTarifa = false;
            }
            else if (this.saldo < tarifa) {
                System.out.println("Seu saldo é insuficiente, iremos cobrar uma tarifa a mais depois");
                this.tarifa += 100;
                cobrarTarifa = false;
            }
        }
        return this.saldo;
    }
}





