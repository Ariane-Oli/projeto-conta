package org.example;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta c1 = new Conta(1234, 5);
        double valor;
        String cpfTitular;
        String nomeTitular;
        int numeroContaId;
        int opcao;


        System.out.println("************ YouBank ***********");

        System.out.println("Digite seu nome: ");
        nomeTitular = sc.nextLine();

        System.out.println("Digite seu o número de sua conta: ");
        numeroContaId = sc.nextInt();

        System.out.println("Informe o Cpf do Titular: ");
        cpfTitular = sc.next();

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
                    System.out.println("***********Dados do seu YouBank*********");
                    System.out.println("Titular da conta: "+nomeTitular+"\nNúmero da Conta: "+numeroContaId+"\nCpf do titular: "+cpfTitular+"\nSaldo atual é de: "+ c1.getSaldo());
                    System.out.println("*****************************************\n");
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
