package br.com.contaAplicacao.model;

public class ContaPoupanca extends Conta {

    public void parametrosContaPoupanca(){
        setSaldo(30.0);
        setLimite (0.0);
        System.out.println("Conta Poupança criada com sucesso!");
    }

}

