package br.com.senai;

import java.util.Scanner;

public class RunGameV1 {
    public static void main(String[] args) {
        int drawnNumber = 50;

        System.out.println("Bem vindo ao jogo do número sorteado!");
        System.out.println("Me informe, por favor, o seu nome:");

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        sc.nextLine();

        System.out.println("Olá, " + name + ", você é capaz de descobrir o número sorteado?");
        System.out.println("Você tem 3 tentativas!");
        System.out.println("Digite um número entre 1 e 100:");

        int chosenNumber = sc.nextInt();

        if(chosenNumber == drawnNumber) {
            System.out.println("Parabéns, " + name + ", você ganhou com apenas 1 tentativa!");
        } else {
            int attempts = 2;
            System.out.println("Tente novamente! Digite outro número entre 1 e 100:");
            while(attempts <= 3) {
                chosenNumber = sc.nextInt();
                if(chosenNumber == drawnNumber) {
                    System.out.println("Parabéns, " + name + ", você ganhou com " + attempts + " tentativas!");
                    break;
                }
                attempts =  attempts + 1;
                if(attempts <= 3) {
                    System.out.println("Tente novamente! Digite outro número entre 1 e 100:");
                } else {
                    System.out.println("Que pena, " + name + ", você perdeu!");
                }
            }
        }
        System.out.println("Fim de Jogo!");
        sc.close();
    }
}