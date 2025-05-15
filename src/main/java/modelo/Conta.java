package modelo;

public abstract class Conta {
    protected String nome;

    public Conta() {
        this.nome = "";
    }

    public Conta(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double getSaldo();

    public abstract void setDeposito(double valor);
}

