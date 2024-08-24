package application;
import entities.Jogador;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUM_TIMES = 5;
        final int JOGADORES_POR_TIME = 11;

        Jogador[][] times = new Jogador[NUM_TIMES][JOGADORES_POR_TIME];

        for (int time = 0; time < NUM_TIMES; time++) {
            System.out.println("Dados do Time " + (time + 1) + ":");
            for (int i = 0; i < JOGADORES_POR_TIME; i++) {
                System.out.println("Jogador " + (i + 1) + ":");
                System.out.print("Idade: ");
                int idade = scanner.nextInt();
                System.out.print("Peso (kg): ");
                double peso = scanner.nextDouble();
                System.out.print("Altura (m): ");
                double altura = scanner.nextDouble();
                times[time][i] = new Jogador(idade, peso, altura);
            }
        }

        int contMenor18 = 0;
        for (int time = 0; time < NUM_TIMES; time++) {
            for (int i = 0; i < JOGADORES_POR_TIME; i++) {
                if (times[time][i].getIdade() < 18) {
                    contMenor18++;
                }
            }
        }
        System.out.println("Quantidade de jogadores com idade inferior a 18 anos: " + contMenor18);

        for (int time = 0; time < NUM_TIMES; time++) {
            double somaIdade = 0;
            for (int i = 0; i < JOGADORES_POR_TIME; i++) {
                somaIdade += times[time][i].getIdade();
            }
            double mediaIdade = somaIdade / JOGADORES_POR_TIME;
            System.out.println("Média das idades do Time " + (time + 1) + ": " + mediaIdade);
        }

        double somaAltura = 0;
        int totalJogadores = NUM_TIMES * JOGADORES_POR_TIME;
        for (int time = 0; time < NUM_TIMES; time++) {
            for (int i = 0; i < JOGADORES_POR_TIME; i++) {
                somaAltura += times[time][i].getAltura();
            }
        }
        double mediaAltura = somaAltura / totalJogadores;
        System.out.println("Média das alturas de todos os jogadores: " + mediaAltura);

        int contMais80kg = 0;
        for (int time = 0; time < NUM_TIMES; time++) {
            for (int i = 0; i < JOGADORES_POR_TIME; i++) {
                if (times[time][i].getPeso() > 80) {
                    contMais80kg++;
                }
            }
        }
        double porcentagemMais80kg = (contMais80kg / (double) totalJogadores) * 100;
        System.out.println("Porcentagem de jogadores com mais de 80kg: " + porcentagemMais80kg + "%");
    }
}