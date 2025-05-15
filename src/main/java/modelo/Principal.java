package modelo;

import java.util.Scanner;

/**
 * Classe Principal
 *
 * Esta classe implementa um sistema de menu interativo para manipulação de contas bancárias,
 * permitindo ao usuário criar uma conta corrente ou poupança, consultar o saldo e realizar depósitos.
 *
 * O sistema utiliza herança e polimorfismo por meio de uma classe abstrata Conta
 * e suas subclasses ContaCorrente e ContaPoupanca.
 *
 * Autor: Michel Pascoal  
 * Data: 15/05/2025
 */
public class Principal {

    /**
     * Método principal da aplicação.
     *
     * @param args argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner para leitura de dados do usuário
        Conta conta = null;                   // Referência para a conta criada (poupança ou corrente)

        int opcao; // Controle do menu
        do {
            // Exibição do menu principal
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Consultar saldo");
            System.out.println("3 - Depositar");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    // Criação da conta
                    System.out.print("Digite o nome do titular: ");
                    sc.nextLine(); // Limpa o buffer do Scanner
                    String nome = sc.nextLine();

                    System.out.print("Digite o saldo inicial: ");
                    double saldo = sc.nextDouble();

                    System.out.println("Tipo de conta: 1 - Corrente | 2 - Poupança");
                    int tipo = sc.nextInt();

                    if (tipo == 1) {
                        // Criação da Conta Corrente
                        System.out.print("Digite a taxa de serviço: ");
                        double taxa = sc.nextDouble();
                        conta = new ContaCorrente(nome, saldo, taxa);
                        System.out.println("Conta Corrente criada.");
                    } else if (tipo == 2) {
                        // Criação da Conta Poupança
                        System.out.print("Digite o juros (%): ");
                        double juros = sc.nextDouble();
                        conta = new ContaPoupanca(nome, saldo, juros);
                        System.out.println("Conta Poupança criada.");
                    } else {
                        System.out.println("Tipo inválido.");
                    }
                    break;

                case 2:
                    // Consulta de saldo
                    if (conta != null) {
                        System.out.printf("Saldo de %s: R$ %.2f\n", conta.getNome(), conta.getSaldo());
                    } else {
                        System.out.println("Nenhuma conta criada.");
                    }
                    break;

                case 3:
                    // Depósito
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
                    // Encerrar programa
                    System.out.println("Encerrando...");
                    break;

                default:
                    // Opção inválida
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0); // Loop até a opção de saída

        sc.close(); // Encerra o Scanner
    }
}

