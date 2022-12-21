package com.gabcrvlh.gen.java.IntroducaoJava;

import java.util.Scanner;

public class Exercicio4IntroJava {
    /*
    Escreva um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão:
    */

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

    int a, b, c, r, s, d;

        System.out.println("Escolha um número para o A: ");
        a = read.nextInt();
        System.out.println("\nEscolha um número para o B: ");
        b = read.nextInt();
        System.out.println("\nEscolha um número para o C: ");
        c = read.nextInt();

        r = (a + b) * (a + b);
        s = (b + c) * (b + c);

        d = (r + s) / 2;

        System.out.println("O resultado da expressão r = (a + b) * (a + b) é igual a: " + r);
        System.out.println("O resultado da expressão s = (b + c) * (b + c) é igual a: " + s);
        System.out.println("O resultado da expressão d = (r + s) / 2 é igual a: " + d);
    }
}

