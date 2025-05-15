package modelo;

/**
 * Classe abstrata Conta
 *
 * Representa uma conta bancária genérica com o atributo nome e métodos abstratos
 * para consultar saldo e realizar depósitos. Serve como base para diferentes tipos
 * de contas, como conta corrente e conta poupança.
 *
 * Autor: Michel Pascoal  
 * Data: 15/05/2025
 */
public abstract class Conta {
    protected String nome;

    /**
     * Construtor padrão. Inicializa o nome como vazio.
     */
    public Conta() {
        this.nome = "";
    }

    /**
     * Construtor com parâmetro.
     *
     * @param nome Nome do titular da conta.
     */
    public Conta(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o nome do titular da conta.
     *
     * @return nome do titular.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do titular da conta.
     *
     * @param nome Nome do titular.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método abstrato que deve retornar o saldo da conta.
     *
     * @return saldo com possíveis ajustes (juros ou taxa).
     */
    public abstract double getSaldo();

    /**
     * Método abstrato que deve realizar um depósito na conta.
     *
     * @param valor Valor a ser depositado.
     */
    public abstract void setDeposito(double valor);
}
