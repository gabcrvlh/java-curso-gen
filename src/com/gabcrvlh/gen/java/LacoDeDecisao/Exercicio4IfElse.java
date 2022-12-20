package com.gabcrvlh.gen.java.LacoDeDecisao;

import java.util.Scanner;

public class Exercicio4IfElse {
    /*
    4. Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar.
    Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
    */

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int numero;

        System.out.println("Insira um número: ");
        numero = read.nextInt();

        if (numero % 2 == 0){
            System.out.println("\nSeu número é par. E a raiz quadrada dele é igual a " + Math.sqrt(numero));
        } else {
            System.out.println("\nSeu número é ímpar. E ele elevado ao quadrado é igual a " + Math.pow(numero, 2));
        }
    }
}
