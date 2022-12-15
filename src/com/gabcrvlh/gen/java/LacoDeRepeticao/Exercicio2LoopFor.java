package com.gabcrvlh.gen.java.LacoDeRepeticao;

import java.util.Scanner;

public class Exercicio2LoopFor {
    // 2. Ler 10 números e imprimir quantos são pares e quantos são ímpares.

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int i, numero, par = 0, impar = 0;

        for (i = 0; i <= 9; i++){
            System.out.println("Insira um número: ");
            numero = read.nextInt();

            if (numero % 2 == 0){
                par++;
            } else {
                impar++;
            }
        }

        System.out.println("Quantidade de números pares: " + par);
        System.out.println("Quantidade de números ímpares: " + impar);
    }
}
