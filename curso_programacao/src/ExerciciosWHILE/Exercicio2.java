package ExerciciosWHILE;

import java.util.Scanner;

//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        while (X != 0 && Y != 0) {
            if(X > 0 && Y > 0) {
                System.out.println("First");
            }
            else if( X < 0 && Y > 0) {
                System.out.println("second");
            }
            else if(X < 0) {
                System.out.println("third");
            }
            else {
                System.out.println("fourth");
            }
            X = sc.nextInt();
            Y = sc.nextInt();

        }
        System.out.println("null value");
        sc.close();

    }
}
