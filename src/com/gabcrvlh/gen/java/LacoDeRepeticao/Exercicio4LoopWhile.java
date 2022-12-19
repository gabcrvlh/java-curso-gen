package com.gabcrvlh.gen.java.LacoDeRepeticao;

import java.util.Scanner;

public class Exercicio4LoopWhile {
    /*
    Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região.
    Para tanto, a cada uma das pessoas era perguntado: idade, gênero (1-feminino / 2-masculino / 3-Outros), e as
    opções (1, se a pessoa era calma; 2, se era nervosa e 3, se era agressiva). Pede-se para elaborar um sistema
    que permita ler os dados de 150 pessoas, calcule e mostre o número de:
    - mulheres nervosas;
    - homens agressivos;
    - outros calmos;
    - pessoas calmas;
    - pessoas nervosas com mais de 40 anos;
    - pessoas calmas com menos de 18 anos.
    */

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int contagem = 0, idade, genero, opcao;
        int mulherNervosa = 0, homemAgressivo = 0, outroCalmos = 0;
        int totalCalmas = 0, nervosasAcima40 = 0, calmasAbaixo18 = 0;

        while (contagem != 150) {
            contagem++;

            System.out.println("Pessoa " + contagem);

            System.out.println("Insira sua idade: ");
            idade = read.nextInt();

            System.out.println("Insira seu gênero (Somente números): 1 = feminino, 2 = masculino, 3 = outro.");
            genero = read.nextInt();

            System.out.println("Você se considera uma pessoa (selecione uma opção): 1 = calma, 2 = nervosa, 3 = agressiva.");
            opcao = read.nextInt();

            if (genero == 1 && opcao == 2) {
                mulherNervosa++;
            }

            if (genero == 2 && opcao == 3) {
                homemAgressivo++;
            }

            if (genero == 3 && opcao == 1) {
                outroCalmos++;
            }

            if (opcao == 1) {
                totalCalmas++;
            }

            if (idade > 40 && opcao == 2) {
                nervosasAcima40++;
            }

            if (idade < 18 && opcao == 1) {
                calmasAbaixo18++;
            }
            System.out.println(" ");
        }

            System.out.println("Total de mulheres nervosas: " + mulherNervosa);
            System.out.println("Total de homens agressivos: " + homemAgressivo);
            System.out.println("Total de pessoas calmas de outro gênero: " + outroCalmos);
            System.out.println("Total de pessoas calmas: " + totalCalmas);
            System.out.println("Total de pessoas nervosas com mais de 40 anos: " + nervosasAcima40);
            System.out.println("Total de pessoas calmas com menos de 18 anos: " + calmasAbaixo18);

    }
}
