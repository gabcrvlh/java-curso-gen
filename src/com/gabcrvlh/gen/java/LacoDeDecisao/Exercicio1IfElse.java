package com.gabcrvlh.gen.java.LacoDeDecisao;

import java.util.Scanner;

public class Exercicio1IfElse {
    /*
    1. Faça um programa que receba três inteiros e diga qual deles é o maior.
     */

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n1, n2, n3;

        System.out.println("Insira o primeiro número: ");
        n1 = read.nextInt();

        System.out.println("\nInsira o segundo número: ");
        n2 = read.nextInt();

        System.out.println("\nInsira o terceiro número: ");
        n3 = read.nextInt();

        if (n1 > n2 && n1 > n3){
            System.out.println("\nO maior número é o: " + n1);
        } else if (n2 > n3) {
            System.out.println("\nO maior número é o: " + n2);
        } else {
            System.out.println("\nO maior número é o: " + n3);
        }
    }
}
