package ExerciciosIF_ElLSE;

import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        //Fazer um programa para ler um número inteiro,
        // e depois dizer se este número é negativo ou não

        Scanner sc = new Scanner(System.in);

        int number;

        System.out.println("enter a number");
        number = sc.nextInt();

        if(number < 0) {
            System.out.println("The number" + number + " is negative");
        }
        else {
            System.out.println("The number " + number + " is positive");
        }
    }
}
