package com.gabcrvlh.gen.java.Desafios;

import java.util.Scanner;

public class DesafioAposta {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int escolha, saldo = 100, numero;

        System.out.println("### Menu da Aposta ###");

        while(true) {
            if (saldo == 0) {
                System.out.println("Seu saldo está zerado. Você perdeu.");
                System.exit(0);

            } else if (saldo >= 200) {
                System.out.println("Seu saldo atingiu 200 ou mais. Você ganhou!");
                System.exit(0);

            } else {
                System.out.println("""
                \nEscolha um número:
                1. Ver o saldo atual.
                2. Parar de jogar e ficar com o saldo atual.
                3. Continuar jogando.""");

                escolha = read.nextInt();

                switch (escolha) { // testar: switch(read.nextInt()!!)
                    case 1:
                        System.out.println("\nSaldo atual: " + saldo);
                        break;

                    case 2:
                        System.out.println("Encerrando a aposta...");
                        System.out.println("Saldo final: " + saldo);
                        System.out.println("Agradecemos a participação.");
                        System.exit(0);


                    case 3:
                        numero = (int) Math.round(Math.random() * 100);

                        if (numero < 50) {
                            saldo -= numero;

                        } else if (numero == 50) {
                            continue;
                        } else {
                            saldo += numero;
                        }
                        break;

                }
            }
        }
    }
}
