package modelo;

import java.util.Scanner;
import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta = null;

        int opcao;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Consultar saldo");
            System.out.println("3 - Depositar");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do titular: ");
                    sc.nextLine(); // limpar buffer
                    String nome = sc.nextLine();

                    System.out.print("Digite o saldo inicial: ");
                    double saldo = sc.nextDouble();

                    System.out.println("Tipo de conta: 1 - Corrente | 2 - Poupança");
                    int tipo = sc.nextInt();

                    if (tipo == 1) {
                        System.out.print("Digite a taxa de serviço: ");
                        double taxa = sc.nextDouble();
                        conta = new ContaCorrente(nome, saldo, taxa);
                        System.out.println("Conta Corrente criada.");
                    } else if (tipo == 2) {
                        System.out.print("Digite o juros (%): ");
                        double juros = sc.nextDouble();
                        conta = new ContaPoupanca(nome, saldo, juros);
                        System.out.println("Conta Poupança criada.");
                    } else {
                        System.out.println("Tipo inválido.");
                    }
                    break;

                case 2:
                    if (conta != null) {
                        System.out.printf("Saldo de %s: R$ %.2f\n", conta.getNome(), conta.getSaldo());
                    } else {
                        System.out.println("Nenhuma conta criada.");
                    }
                    break;

                case 3:
                    if (conta != null) {
                        System.out.print("Valor do depósito: ");
                        double valor = sc.nextDouble();
                        conta.setDeposito(valor);
                        System.out.println("Depósito realizado.");
                    } else {
                        System.out.println("Nenhuma conta criada.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
