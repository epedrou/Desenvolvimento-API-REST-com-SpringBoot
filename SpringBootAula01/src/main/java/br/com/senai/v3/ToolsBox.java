package br.com.senai.v3;

import java.util.Scanner;

public class ToolsBox {
    public static void apresentarSaudação() {
        System.out.println("Bem vindo ao jogo do número sorteado!");
    }

    public static String coletarNome() {
        System.out.println("Me informe, por favor, o seu nome:");

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        sc.nextLine();

        System.out.println("Olá, " + name + "!");
        return name;
    }

    public static void apresentarProblemática() {
        System.out.println("Você é capaz de descobrir o número sorteado?");
        System.out.println("Você tem 3 tentativas!");
    }

    public static void jogar(String name, int drawnNumber, int attempts) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número entre 1 e 100:");

        int chosenNumber = sc.nextInt();

        if(chosenNumber == drawnNumber) {
            System.out.println("Parabéns, " + name + ", você ganhou com apenas 1 tentativa!");
        } else {
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
    }

    public static void finalizarJogo() {
        System.out.println("Fim de Jogo!");
    }
}