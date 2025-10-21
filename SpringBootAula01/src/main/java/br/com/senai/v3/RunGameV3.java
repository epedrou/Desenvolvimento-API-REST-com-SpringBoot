package br.com.senai.v3;

import java.util.Scanner;

public class RunGameV3 {
    public static void main(String[] args) {
        Jogo jogo1 = new Jogo();
        ToolsBox.apresentarSaudação();
        String nome = ToolsBox.coletarNome();
        ToolsBox.apresentarProblemática();
        ToolsBox.jogar(nome, jogo1.getDrawnNumber(), jogo1.getAttempts());
        ToolsBox.finalizarJogo();
    }
}