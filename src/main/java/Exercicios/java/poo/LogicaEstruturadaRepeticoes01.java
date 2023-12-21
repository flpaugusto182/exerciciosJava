package Exercicios.java.poo;
//1) Fazer uma classe Ex1Primos para:
//• Receber um inteiro N do usuário
//• Testar se este inteiro é primo ou não e informar

import java.util.Scanner;

public class LogicaEstruturadaRepeticoes01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserir um número inteiro: ");
        int n = scanner.nextInt();

        boolean ehPrimo =  true;

        if (n <= 1){
            ehPrimo= false;
        }else{
            for (int i = 2; i <=Math.sqrt(n) ; i++) {
                if ( n % i == 0){
                    ehPrimo = false;
                    break;
                }

            }
        }
        if (ehPrimo){
            System.out.println(n+ " é primo.");
        }else{
            System.out.println(n+" não é primo.");
        }



    }
}
