package modelo;

public class ContaCorrente extends Conta {
    private double saldo;
    private double taxaServico;

    public ContaCorrente() {
        super();
        this.saldo = 0;
        this.taxaServico = 0;
    }

    public ContaCorrente(String nome, double saldo, double taxaServico) {
        super(nome);
        this.saldo = saldo;
        this.taxaServico = taxaServico;
    }

    @Override
    public double getSaldo() {
        return saldo - taxaServico;
    }

    @Override
    public void setDeposito(double valor) {
        saldo += valor;
    }

    public double getSaldoBruto() {
        return saldo;
    }

    public double getTaxaServico() {
        return taxaServico;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTaxaServico(double taxaServico) {
        this.taxaServico = taxaServico;
    }
}
