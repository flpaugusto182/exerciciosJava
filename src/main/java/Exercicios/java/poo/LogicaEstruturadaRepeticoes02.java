package Exercicios.java.poo;
// Fazer uma classe Ex2Sorteio para:
//• Sortear um número de 0 a 1000 (dica: usar Math.random())
//• Pedir um palpite ao usuário. Se ele errar, informar se o palpite é maior ou
//menor do que o número sorteado.
//• Pedir novos palpites até que o usuário acerte e, depois disso, mostrar em
//quantas tentativas ele acertou.

import java.util.Random;
import java.util.Scanner;

public class LogicaEstruturadaRepeticoes02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(1000);
        int tentativas = 0;

        System.out.println("Tente adivinhar um número entre 0 e 1000: ");


        do {
            int randomGuess = scanner.nextInt();
            tentativas++;

            if (randomGuess < randomNumber) {
                System.out.println( "O numero sorteado é maior que o número testado! Tente novamente");

            } else if (randomGuess > randomNumber) {
                System.out.println(" O numero sorteado é menor que o número testado! Tente novamente");

            } else{
                System.out.println("ACERTOU MIZERAVI, só demorou "+tentativas+" vezes.");
            }
        } while (true);




        }
    }

