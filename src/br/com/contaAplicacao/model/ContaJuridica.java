package br.com.contaAplicacao.model;

public class ContaJuridica extends Conta{

    public void parametrosJuridica() {
        setSaldo(500.0);
        setLimite (1000.0);
        System.out.println("Conta Juridica criada com sucesso!");
    }
}
