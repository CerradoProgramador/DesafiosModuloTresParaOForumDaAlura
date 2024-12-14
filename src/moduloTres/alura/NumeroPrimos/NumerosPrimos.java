package moduloTres.alura.NumeroPrimos;

public class NumerosPrimos {


    public boolean verificarPrimalidade(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }


    public void listarPrimos(int inicio, int fim) {
        for (int i = inicio; i <= fim; i++) {
            if (verificarPrimalidade(i)) {
                System.out.println(i + " é primo");
            }
        }
    }
}
