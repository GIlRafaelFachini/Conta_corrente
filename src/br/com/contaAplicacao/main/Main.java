package br.com.contaAplicacao.main;

import br.com.contaAplicacao.model.ContaInvestimento;
import br.com.contaAplicacao.model.ContaJuridica;
import br.com.contaAplicacao.model.ContaPoupanca;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ContaPoupanca contaPoupanca = null;
        ContaInvestimento contaInvestimento = null;
        ContaJuridica contaJuridica = null;

        int op;
        int oc;
        double valor;
        String nomeCliente = null;


        do {
            System.out.println("--------------Menu de Operações Bancarias----------------");
            System.out.println("1.Abrir conta");
            System.out.println("2.Sacar da conta");
            System.out.println("3.Depositar na conta");
            System.out.println("4.Saldo da conta");
            System.out.println("5.Sair");
            System.out.println("----------------------------------");
            op = scanner.nextInt();

            if (op == 1) {
                System.out.println("Qual nome do Cliente?");
                scanner.nextLine();
                nomeCliente = scanner.nextLine();
                System.out.println("Qual tipo de conta quer abrir? n1 poupança, n2 investimento, n3 juridica");
                oc = scanner.nextInt();

                if (oc == 1) {
                    contaPoupanca = new ContaPoupanca();
                    contaPoupanca.parametrosContaPoupanca();
                    contaPoupanca.nomeCliente(nomeCliente);

                } else if (oc == 2) {
                    contaInvestimento = new ContaInvestimento();
                    contaInvestimento.parametrosContaInvestimento();
                    contaInvestimento.nomeCliente(nomeCliente);

                } else if (oc == 3) {
                    contaJuridica = new ContaJuridica();
                    contaJuridica.parametrosJuridica();
                    contaJuridica.nomeCliente(nomeCliente);
                }

            } else if (op == 2) {

                System.out.println("De qual tipo de conta quer sacar? n1 poupança, n2 investimento, n3 juridica.");
                oc = scanner.nextInt();
                if (oc == 1) {

                    System.out.println(" Digite o valor do saque");
                    valor = scanner.nextDouble();
                    assert contaPoupanca != null;
                    contaPoupanca.sacar(valor);

                } else if (oc == 2) {

                    System.out.println("Digite o valor do saque");
                    valor = scanner.nextDouble();
                    assert contaInvestimento != null;
                    contaInvestimento.sacar(valor);

                } else if (oc == 3) {

                    System.out.println("Digite o valor do saque");
                    valor = scanner.nextDouble();
                    assert contaJuridica != null;
                    contaJuridica.sacar(valor);

                }

            } else if (op == 3) {

                System.out.println(" Em qual tipo de conta quer depositar? n1 poupança, n2 investimento , n3 juridica.");
                oc = scanner.nextInt();
                if (oc == 1) {
                    System.out.println(" Digite o valor do deposito");
                    valor = scanner.nextDouble();
                    assert contaPoupanca != null;
                    contaPoupanca.depositar(valor);
                    System.out.println("Depositado na conta poupança R$: " + valor + " reais ");

                } else if (oc == 2) {
                    System.out.println(" Digite o valor do deposito");
                    valor = scanner.nextDouble();
                    assert contaInvestimento != null;
                    contaInvestimento.depositar(valor);
                    System.out.println("Depositado na conta investmento R$: " + valor + " reais ");

                } else if (oc == 3) {

                    System.out.println(" Digite o valor do deposito");
                    valor = scanner.nextDouble();
                    assert contaJuridica != null;
                    contaJuridica.depositar(valor);
                    System.out.println("Depositado na conta juridica R$: " + valor + " reais ");

                }


            } else if (op == 4) {
                System.out.println ("Qual tipo de conta quer ver o saldo? n1 poupança ou n2 investimento");
                oc = scanner.nextInt ();
                if (oc == 1) {
                    assert contaPoupanca != null;
                    System.out.println ("O saldo da sua conta poupança" + nomeCliente + " é : " + contaPoupanca.getSaldo () + " reais ");
                } else if (oc == 2) {
                    assert contaInvestimento != null;
                    System.out.println ("O saldo da sua conta investmento" + nomeCliente + " é : " + contaInvestimento.getSaldo () + " reais ");
                } else if (oc == 3) {
                    assert contaJuridica != null;
                    System.out.println ("O saldo da sua conta juridica" + nomeCliente + " é : " + contaJuridica.getSaldo () + " reais ");
                }

            } else if (op == 5) {
                System.out.println("Saindo do programa!");
                scanner.close();
            }

        } while (op != 5);

    }
}