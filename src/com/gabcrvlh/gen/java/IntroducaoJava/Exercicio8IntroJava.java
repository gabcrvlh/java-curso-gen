package com.gabcrvlh.gen.java.IntroducaoJava;

import java.util.Scanner;

public class Exercicio8IntroJava {
    /*
    8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e
    dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e os
    impostos de 45%, escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor.
    */

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int custoDeFabrica;

        System.out.println("Qual o custo da fabricação? ");
        custoDeFabrica = read.nextInt();

        double percentagemDistribuidor = custoDeFabrica * 0.28;
        double imposto = custoDeFabrica * 0.45;
        double custoConsumidor = custoDeFabrica + imposto + percentagemDistribuidor;

        System.out.println("O valor total do carro é igual a: " + custoConsumidor);
    }
}
