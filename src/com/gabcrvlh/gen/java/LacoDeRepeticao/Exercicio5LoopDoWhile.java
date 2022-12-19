package com.gabcrvlh.gen.java.LacoDeRepeticao;

import java.util.Scanner;

public class Exercicio5LoopDoWhile {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int numero, soma = 0;

        System.out.println("Encontre o número que encerra o programa.");

        do {
            System.out.println("\nInsira um número: ");
            numero = read.nextInt();
            soma += numero;
        }
        while (numero != 0);

        System.out.println("\nResposta correta!");
        System.out.println("A soma dos números digitados é igual a: " + soma);
    }
}

