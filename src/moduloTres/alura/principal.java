package moduloTres.alura;

import moduloTres.alura.NumeroPrimos.GeradorPrimo;
import moduloTres.alura.NumeroPrimos.VerificadorPrimo;
import moduloTres.alura.animal.Cachorro;
import moduloTres.alura.animal.Gato;
import moduloTres.alura.carros.Carros;
import moduloTres.alura.carros.Honda;
import moduloTres.alura.contaBancaria.ContaBancaria;
import moduloTres.alura.contaBancaria.ContaCorrente;

public class principal {
    public static void main(String[] args) {

        //* Calculando Media do Triênio e Verificando menor Preço.

        Carros byd = new Carros();

        byd.setModelo("King");
        byd.setPrecoMedioTrienio(40000,20000, 10000);
        byd.exibeFichaTecnica();

        //* SubClasse Honda

        Honda suv = new Honda();

        suv.setModelo("HR-V");
        suv.setCor("Prata");
        suv.getKmRodado(600, 60);
        suv.setPrecoMedioTrienio(180000,120000, 150000);
        suv.exibeFichaTecnica();

        // Exercicio 1 Finalizado ----

        // Exercico 2

        Gato raboPreto = new Gato();

        raboPreto.exibirArranharMoveis();
        raboPreto.setBrinquedo("Arranhador");
        raboPreto.emitirSom();

        Cachorro pelosBrancos = new Cachorro();

        pelosBrancos.setAbanarRabo("\nAbananado forteee");
        pelosBrancos.setSomCachorro("Au Au Au Au Au Au");
        pelosBrancos.emitirSom();

        // Exercicio 3

        ContaBancaria id0001 = new ContaBancaria();

        id0001.depositar(500);
        id0001.consultarSaldo();
        id0001.sacar(200);
        id0001.consultarSaldo();

        ContaCorrente id0002 = new ContaCorrente();

        id0002.depositar(500);
        id0002.consultarSaldo();
        id0002.sacar(200);
        id0002.consultarSaldo();
        id0002.cobrarTarifa();
        id0002.consultarSaldo();

        ContaCorrente id0003 = new ContaCorrente();

        id0003.depositar(200);
        id0003.consultarSaldo();
        id0003.sacar(200);
        id0003.consultarSaldo();
        id0003.cobrarTarifa();
        id0003.consultarSaldo();
        id0003.depositar(200);
        id0003.setCobrarTarifa(true);
        id0003.cobrarTarifa();
        id0003.consultarSaldo();

        // Exercicio 4

        VerificadorPrimo verificador = new VerificadorPrimo();
        GeradorPrimo gerador = new GeradorPrimo();


        int numero1 = 12;
        if (verificador.verificarSeEhPrimo(numero1)) {
            System.out.println(numero1 + " é primo!");
        } else {
            System.out.println(numero1 + " não é primo.");
        }

        int proximoPrimo = gerador.gerarProximoPrimo(15);
        System.out.println("O próximo número primo após 15 é " + proximoPrimo);

        System.out.println("Números primos de 1 a 20:");
        gerador.listarPrimos(1, 20);
    }
}
