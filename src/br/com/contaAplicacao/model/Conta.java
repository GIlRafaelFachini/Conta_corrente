package br.com.contaAplicacao.model;

import java.util.StringJoiner;

public abstract class Conta {
    private String nomeCliente;
    private String tipoConta;
    private double saldo;
    private double limite;

    public Conta(String nomeCliente, String tipoConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    public Conta() {
        super();
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Double getSaldo() {
        return saldo + limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void sacar(double valor) {
        if ((saldo - valor) >= 0) {
            saldo -= valor;
            System.out.println("Saque realizado");
        }else {
            System.out.println("Saque não realizado, saldo insuficiente");
        }

    }

    public void depositar(double valor) {
        System.out.println("Deposito realizado");
         saldo += valor;
    }

    public void nomeCliente(String nomeCliente){
        System.out.println("O nome do cliente é: " + nomeCliente);
    }

    @Override
    public String toString() {
        return new StringJoiner (", ", Conta.class.getSimpleName () + "[", "]")
                .add ("nomeCliente='" + nomeCliente + "'")
                .add ("tipoConta='" + tipoConta + "'")
                .add ("saldo=" + saldo)
                .add ("limite=" + limite)
                .toString ();
    }

}
