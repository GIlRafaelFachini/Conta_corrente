package br.com.contaAplicacao.model;

public  class ContaInvestimento extends Conta {
    public void parametrosContaInvestimento() {
        setSaldo(45.0);
        setLimite (500.0);
        System.out.println("Conta Investimento criada com sucesso!");
    }

}
