package Exercicio;

public class ContaCorrente {
    private int numConta;
    private String nomeCliente;
    private double saldo;

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public void setNomeCliente(String nome) {
        this.nomeCliente = nome;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double s) {
        this.saldo = s;
    }

    public void depositar(double deposito) {
        this.saldo = this.saldo + deposito;
    }

    public boolean sacar(double saque) {
        if ((saque+((0.5d/100)*saque)) > this.saldo) {
            return false;
        
        } else {
            this.saldo = this.saldo - ((0.5d/100)*saque);
            this.saldo = this.saldo - saque;
            return true;
        }
    }
}
