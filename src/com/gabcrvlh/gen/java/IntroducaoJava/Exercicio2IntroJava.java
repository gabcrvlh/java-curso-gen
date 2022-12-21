package com.gabcrvlh.gen.java.IntroducaoJava;

import java.util.Scanner;

public class Exercicio2IntroJava {
    /*
    2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.
    */

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int idade, meses, anos;

        System.out.println("Qual a sua idade em dias? ");
        idade = read.nextInt();

        anos = idade / 365;
        meses = anos * 12;

        System.out.println("\n Sua idade em dias é igual a: " + idade + " dias.");
        System.out.println("Sua idade em anos é igual a: " + anos + " anos.");
        System.out.println("Sua idade em meses é igual a: " + meses + " meses.");
    }
}
