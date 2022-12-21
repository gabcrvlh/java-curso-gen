package com.gabcrvlh.gen.java.IntroducaoJava;

import java.util.Scanner;

public class Exercicio6IntroJava {
    /*
    6. Construa um programa em que, tendo como dados de entrada dois pontos quaisquer no plano,
    P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é:
    */

    public static void main(String[] args) {
        int x1 = 1, x2 = 8, y1 = 0, y2 = 0;

        double p1 = (x2 - x1) * (x2 - x1);
        double p2 = (y2 - y1) * (y2 - y1);
        double pp = p1 + p2;

        double d  = Math.sqrt(pp);
        System.out.println("O resultado da distância é igual a: " + d);
    }
}

