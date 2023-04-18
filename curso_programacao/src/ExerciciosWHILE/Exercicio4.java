package ExerciciosWHILE;

import java.util.Scanner;

//Escreva um programa em Java que mostra todos os números ímpares de 1 até 100.
public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 1;

        while (x <= 100) {
            if( x % 2 == 0) {
                System.out.println("Par = " + x);
            }
            x++;
        }
    }
}
