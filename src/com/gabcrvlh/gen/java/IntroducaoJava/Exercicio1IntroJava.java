package com.gabcrvlh.gen.java.IntroducaoJava;

import java.util.Scanner;

public class Exercicio1IntroJava {
    /*
    1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a
    expressa apenas em dias.
    */

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int anoNasc, anoAtual, bissexto = 0, i;
        int anos, mes, dia, mesAtual, diaHoje, total;

        System.out.println("Insira o ano atual: ");
        anoAtual = read.nextInt();

        System.out.println("\nInsira quantos anos você tem: ");
        anos = read.nextInt();

        System.out.println("\nInsira o mês de nascimento: ");
        mes = read.nextInt();

        System.out.println("\nInsira o mês atual: ");
        mesAtual = read.nextInt();

        System.out.println("\nInsira o dia de nascimento: ");
        dia = read.nextInt();

        System.out.println("\nInsira o dia de hoje: ");
        diaHoje = read.nextInt();

        anoNasc = anoAtual - anos;

        for (i = anoNasc; i <= anoAtual; i++){
            if (i % 400 == 0) {
                bissexto++;
            } else {
                if(i % 4 == 0 && i % 100 != 0){
                    bissexto++;
                }
            }
        }

        total = (((mesAtual - mes) * 30) + (anos * 365) + (diaHoje - dia) + bissexto);
        System.out.println("\nSua idade em dias é igual a: " + total);
    }
}

