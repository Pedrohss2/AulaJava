package ExerciciosIF_ElLSE;

import java.util.Scanner;

    /*
    Fazer um programa para ler um número inteiro
    e dizer se este número é par ou ímpar.
     */
    public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        System.out.println("enter a number");
        number = sc.nextInt();

        if(number % 2 == 0) {
            System.out.println("Par");
        }
        else {
            System.out.println("Impar");
        }
    }
}
