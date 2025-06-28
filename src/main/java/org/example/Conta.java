package org.example;

public class Conta {
    private int numeroConta;
    private int digitoVerif;
    private String cpfTitular;
    private double saldo;

    public Conta(int numeroConta, int digitoVerif, String cpfTitular) {
        super();
        this.numeroConta = numeroConta;
        this.digitoVerif = digitoVerif;
        this.cpfTitular = cpfTitular;
        this.saldo = 0.0;

    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getDigitoVerif() {
        return digitoVerif;
    }

    public void setDigitoVerif(int digitoVerif) {
        this.digitoVerif = digitoVerif;
    }

    public String getCpfTitular() {
        return cpfTitular;
    }

    public void setCpfTitular(String cpfTitular) {
        this.cpfTitular = cpfTitular;
    }
    public double getSaldo() {
        return this.saldo;
    }


    public String exibirInfo(){
        return "Conta " +numeroConta+" / + (" +cpfTitular+  ") + R$" + String.format("%.2f",this.saldo);
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void valorTotal(double valor){
        this.saldo += valor;
    }
    public boolean sacar(double valor){
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

}


