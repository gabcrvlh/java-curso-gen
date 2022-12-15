package com.gabcrvlh.gen.java.LacoDeRepeticao;

import java.util.Scanner;

public class Exercicio3LoopWhile {
    /*
    3. Solicitar a idade de várias pessoas e imprimir total de pessoas com menos de 21 anos,
    e total de pessoas com mais de 50 anos. O programa termina quando o valor insirido for -99.
    */

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int idade = 0, totalAbaixo21 = 0, totalAcima50 = 0;

        while (idade != -99){
            System.out.println("Insira a idade: ");
            idade = read.nextInt();

            if (idade < 21 && idade != -99){
                totalAbaixo21++; }

            if (idade > 50){
                totalAcima50++; }

            System.out.println("\nCaso deseje encerrar o programa, insira: -99");
        }

        System.out.println("Quantidade de pessoas com menos de 21 anos: " + totalAbaixo21);
        System.out.println("Quantidade de pessoas com mais de 50 anos: " + totalAcima50);

    }
}
