package modelo;

public class ContaPoupanca extends Conta {
    private double saldo;
    private double juros;

    public ContaPoupanca() {
        super();
        this.saldo = 0;
        this.juros = 0;
    }

    public ContaPoupanca(String nome, double saldo, double juros) {
        super(nome);
        this.saldo = saldo;
        this.juros = juros;
    }

    @Override
    public double getSaldo() {
        return saldo + (saldo * juros / 100);
    }

    @Override
    public void setDeposito(double valor) {
        saldo += valor;
    }

    public double getSaldoBruto() {
        return saldo;
    }

    public double getJuros() {
        return juros;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }
}

