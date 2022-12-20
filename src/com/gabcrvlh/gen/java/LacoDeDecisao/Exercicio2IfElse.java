package com.gabcrvlh.gen.java.LacoDeDecisao;

import java.util.Scanner;

public class Exercicio2IfElse {
    /*
    2. Faça um programa que entre com três números e coloque em ordem crescente.
     */

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n1, n2, n3;
        int maior = 0, meio = 0, menor = 0;

        System.out.println("Insira o primeiro número: ");
        n1 = read.nextInt();

        System.out.println("\nInsira o segundo número: ");
        n2 = read.nextInt();

        System.out.println("\nInsira o terceiro número: ");
        n3 = read.nextInt();

        if (n1 > n2 && n1 > n3){
            maior = n1;
            if (n2 > n3){
                meio = n2;
                menor = n3;
            } else {
                meio = n3;
                menor = n2;
            }
        }

        if (n2 > n1 && n2 > n3){
            maior = n2;
            if (n1 > n3){
                meio = n1;
                menor = n3;
            } else {
                meio = n3;
                menor = n1;
            }
        }

        if (n3 > n2 && n3 > n1){
            maior = n3;
            if (n2 > n1){
                meio = n2;
                menor = n1;
            } else {
                meio = n1;
                menor = n2;
            }
        }

        System.out.println("\nEm ordem: "+ menor +", "+ meio+", "+ maior);
    }
}