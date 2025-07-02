import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo a sua conta bancária");
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria("Bill Gates","123456-7", 100.00);

        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Consulta Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Ver Histórico");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    conta.mostrarSaldo();
                    break;
                case 2:
                    System.out.print("Valor do depósito: R$ ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.print("Valor do saque: R$ ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 4:
                    conta.mostrarHistorico();
                    break;
                case 0:
                    System.out.println("Cuide bem do seu dinheiro!");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}