package org.example;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta c1 = new Conta(1234, 5, "987.0125.01245-00");
        double valor;
        double valorTotal = 0;
        String nomeTitular;
        int numeroContaId;
        int opcao;


        System.out.println("************ YouBank ***********");

        System.out.println("Digite seu nome: ");
        nomeTitular = sc.next();

        System.out.println("Digite seu o numero de sua conta: ");
        numeroContaId = sc.nextInt();

        do {
            System.out.println("1 - Extrato / 2 - Deposito / 3 - Saque / -1 - Encerrar");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println(c1.exibirInfo());
                    break;
                case 2:
                    System.out.println("Digite o valor a depositar");
                    valor = sc.nextDouble();
                    c1.depositar(valor);
                    System.out.println("Titular da conta: "+nomeTitular+"\nNúmero da Conta: "+numeroContaId+"\nSaldo atual é de: "+ c1.getSaldo());
                    break;

                case 3:
                    System.out.println("Digite o valor do saque");
                    valor = sc.nextDouble();
                    if (c1.sacar(valor)) {
                        System.out.println("Saque autorizado");
                    } else
                        System.out.println("Saldo insuficiente");
                     break;
                case -1:
                    System.out.println("Obrigado por utilizar nossos serviços");
                    break;
                default:
                    System.out.println("Opção Invalida!");
            }
        }while (opcao != -1) ;

            sc.close();

        }
    }
