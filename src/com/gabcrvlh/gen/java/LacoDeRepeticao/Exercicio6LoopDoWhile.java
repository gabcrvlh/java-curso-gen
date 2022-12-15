package com.gabcrvlh.gen.java.LacoDeRepeticao;

import java.util.Scanner;

public class Exercicio6LoopDoWhile {
    /*
    Escrever um programa que receba vários números inteiros no teclado.
    E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0 (zero).
    */

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int numero, contador = 0;
        double media = 0.0;

        do {
            System.out.println("Insira um número inteiro: ");
            numero = read.nextInt();

            if (numero != 0 && numero % 3 == 0){
                media += numero;
                contador++;
            }
            System.out.println("\nCaso deseje encerrar o programa, insira: 0");
        }
        while (numero != 0);

        System.out.println("\nTotal: " + (media / contador));
    }
}
