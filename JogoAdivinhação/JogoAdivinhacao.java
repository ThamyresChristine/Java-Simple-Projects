package JogoAdivinhação;

import java.util.Random;
import java.util.Scanner;


public class JogoAdivinhacao {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1; // Número entre 1 e 100
        
        int tentativas = 0;
        //boolean acertou = false;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Eu escolhi um número entre 1 e 100. Tente adivinhar!");

        while (true) {
            System.out.print("Digite seu palpite: ");
            int palpite = input.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("Muito baixo! Tente novamente.");
            } else if (palpite > numeroSecreto) {
                System.out.println("Muito alto! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número " + numeroSecreto + " em " + tentativas + " tentativas.");
            }
        }

        //input.close();
    }
}

