package com.gabcrvlh.gen.java.LacoDeDecisao;

import java.util.Scanner;

public class Exercicio3If {
    /*
    3. Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
    - infantil: 10-14
    - juvenil: 15-17
    - adulto: 18-25
     */

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int idade;

        System.out.println("Insira sua idade: ");
        idade = read.nextInt();

        if (idade >= 10 && idade <= 14){
            System.out.println("Você está na categoria: infantil.");
        }
        if (idade >= 15 && idade <= 17){
            System.out.println("Você está na categoria: juvenil.");
        }
        if (idade >= 18 && idade <= 25){
            System.out.println("Você está na categoria: adulto.");
        }
    }
}
