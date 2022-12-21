package com.gabcrvlh.gen.java.IntroducaoJava;

import java.util.Scanner;

public class Exercicio3IntroJava {
    /*
    3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos
    e mostre-o expresso em horas, minutos e segundos.
    */

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int segundos, horas, minutos;

        System.out.println("Quantos segundos já se passaram no evento? ");
        segundos =  read.nextInt();

        minutos = segundos / 60;
        horas = minutos / 60;

        System.out.println("\n Já se passaram " + segundos + " segundos.");
        System.out.println("\n Já se passaram " + minutos + " minutos.");
        System.out.println("\n Já se passaram " + horas + " horas.");
    }
}

