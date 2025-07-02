import java.util.ArrayList;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;
    private ArrayList<String> historico;

    public ContaBancaria(String titular, String numeroConta, double saldoInicial) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
        this.historico = new ArrayList<>();
        historico.add("Saldo Inicial R$ " + saldoInicial);
    }

    public String getTitular() {
        return titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getsaldo() {
        return saldo;
    }

    public ArrayList<String> getHistorico() {
        return historico;
    }

    void mostrarSaldo() {
        System.out.println("Seu saldo é de: R$ " + saldo);
    }

    void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Você depositou: R$ " + valor);
            historico.add("Depósito R$ " + valor);
        } else {
            System.out.println("Valor inválido");
        }
    }

    void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo Insuficiente");
        } else if (valor <= 0) {
            System.out.println("O valor não pode ser negativo");
        } else {
            saldo -= valor;
            System.out.println("Você sacou: R$ " + valor);
            historico.add("Saque R$ " + valor);
        }
    }
    void mostrarHistorico() {
        System.out.println("\n --- HISTÓRICO DE MOVIMENTAÇÕES ---");
        for (String movimentacao : historico) {
            System.out.println(movimentacao);
        }
    }
}