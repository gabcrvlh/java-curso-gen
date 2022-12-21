package com.gabcrvlh.gen.java.IntroducaoJava;

import java.util.Scanner;

public class Exercicio5IntroJava {
    /*
    5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno.
    Considerar que a média é ponderada e que o peso das notas é: 2, 3 e 5, respectivamente.
    */

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double n1, n2, n3, nota1, nota2, nota3, peso;

        System.out.println("Digite a primeira nota: ");
        n1 = read.nextInt();

        System.out.println("\nDigite a segunda nota: ");
        n2 = read.nextInt();

        System.out.println("\nDigite a terceira nota: ");
        n3 = read.nextInt();

        nota1 = n1 * 2;
        nota2 = n2 * 3;
        nota3 = n3 * 5;

        peso = 2 + 3 + 5;

        double mediaP = (nota1 + nota2 + nota3) / peso;
        System.out.println("\nA média ponderada é igual a: " + mediaP);
    }
}
