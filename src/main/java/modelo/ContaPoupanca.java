package modelo;

/**
 * Classe ContaPoupanca
 *
 * Representa uma conta poupança com saldo e taxa de juros.
 * Ao consultar o saldo, os rendimentos de juros são adicionados.
 * Permite realizar depósitos.
 *
 * Autor: Michel Pascoal  
 * Data: 15/05/2025
 */
public class ContaPoupanca extends Conta {
    private double saldo;
    private double juros;

    /**
     * Construtor padrão. Inicializa os valores com 0 e nome vazio.
     */
    public ContaPoupanca() {
        super();
        this.saldo = 0;
        this.juros = 0;
    }

    /**
     * Construtor com parâmetros.
     *
     * @param nome Nome do titular da conta.
     * @param saldo Valor inicial do saldo.
     * @param juros Taxa de juros em percentual.
     */
    public ContaPoupanca(String nome, double saldo, double juros) {
        super(nome);
        this.saldo = saldo;
        this.juros = juros;
    }

    /**
     * Retorna o saldo com acréscimo dos juros.
     *
     * @return saldo final com rendimento aplicado.
     */
    @Override
    public double getSaldo() {
        return saldo + (saldo * juros / 100);
    }

    /**
     * Realiza depósito na conta poupança.
     *
     * @param valor Valor a ser adicionado ao saldo.
     */
    @Override
    public void setDeposito(double valor) {
        saldo += valor;
    }

    // Getters e Setters

    /**
     * Retorna o saldo bruto (sem juros aplicados).
     *
     * @return saldo atual da conta.
     */
    public double getSaldoBruto() {
        return saldo;
    }

    /**
     * Retorna a taxa de juros.
     *
     * @return taxa de juros em percentual.
     */
    public double getJuros() {
        return juros;
    }

    /**
     * Define o saldo diretamente.
     *
     * @param saldo novo saldo.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Define a taxa de juros.
     *
     * @param juros nova taxa de juros em percentual.
     */
    public void setJuros(double juros) {
        this.juros = juros;
    }
}

