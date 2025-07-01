public class ContaBancaria {
    String titular;
    String numeroConta;
    double saldo;

    void mostrarSaldo () {
        System.out.println("Seu saldo é de: R$ " + saldo);
    }
    void depositar(double valor) {
        System.out.println("Você depositou: R$ " + valor);
        saldo = saldo + valor;
    }
    void sacar (double valor) {
        System.out.println("Você sacou: R$ " + valor);
        saldo = saldo - valor;
    }
}