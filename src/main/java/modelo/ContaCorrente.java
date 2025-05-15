package modelo;

/**
 * Classe ContaCorrente
 *
 * Representa uma conta corrente que possui saldo e taxa de serviço.
 * A taxa é subtraída ao consultar o saldo. Permite realizar depósitos.
 *
 * Autor: Michel Pascoal  
 * Data: 15/05/2025
 */
public class ContaCorrente extends Conta {
    private double saldo;
    private double taxaServico;

    /**
     * Construtor padrão. Inicializa os valores com 0 e nome vazio.
     */
    public ContaCorrente() {
        super();
        this.saldo = 0;
        this.taxaServico = 0;
    }

    /**
     * Construtor com parâmetros.
     *
     * @param nome Nome do titular da conta.
     * @param saldo Valor inicial do saldo.
     * @param taxaServico Valor da taxa de serviço a ser descontada.
     */
    public ContaCorrente(String nome, double saldo, double taxaServico) {
        super(nome);
        this.saldo = saldo;
        this.taxaServico = taxaServico;
    }

    /**
     * Retorna o saldo com desconto da taxa de serviço.
     *
     * @return saldo final com taxa descontada.
     */
    @Override
    public double getSaldo() {
        return saldo - taxaServico;
    }

    /**
     * Realiza depósito na conta corrente.
     *
     * @param valor Valor a ser adicionado ao saldo.
     */
    @Override
    public void setDeposito(double valor) {
        saldo += valor;
    }

    // Getters e Setters

    /**
     * Retorna o saldo bruto (sem desconto).
     *
     * @return saldo atual sem taxa aplicada.
     */
    public double getSaldoBruto() {
        return saldo;
    }

    /**
     * Retorna a taxa de serviço.
     *
     * @return taxa de serviço aplicada.
     */
    public double getTaxaServico() {
        return taxaServico;
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
     * Define a taxa de serviço.
     *
     * @param taxaServico nova taxa de serviço.
     */
    public void setTaxaServico(double taxaServico) {
        this.taxaServico = taxaServico;
    }
}
