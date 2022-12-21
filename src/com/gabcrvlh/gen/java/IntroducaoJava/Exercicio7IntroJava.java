package com.gabcrvlh.gen.java.IntroducaoJava;

import java.util.Scanner;

public class Exercicio7IntroJava {
    /*
    7. Escreva um sistema que lê os coeficientes a, b, c, d, e e f e calcula e mostra os valores de x e y.
    */

    public static void main(String[] args) {

        double numA = 10, numB = 8, numC = 2, numD = 5, numE = 2, numF = 15;

        double numX = ((numC * numE) - (numB * numF)) / ((numA * numE) - (numB * numD));
        double numY = ((numA * numF) - (numC * numD)) / ((numA * numE) - (numB * numD));

        System.out.println("x é igual a " + numX);
        System.out.println("y é igual a " + numY);
    }
}