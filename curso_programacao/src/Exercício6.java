import java.util.Locale;
import java.util.Scanner;

public class Exercício6 {

    public static void main(String[] args) {
        //Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
        //mostre:
        //a) a área do triângulo retângulo que tem A por base e C por altura.
        //b) a área do círculo de raio C. (pi = 3.14159)
        //c) a área do trapézio que tem A e B por bases e C por altura.
        //d) a área do quadrado que tem lado B.
        //e) a área do retângulo que tem lados A e B

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A, B, C, TRIANGULO, CIRCULO, TRAPEZIO ,QUADRADO ,RETANGULO, PI =3.14159;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C  = sc.nextDouble();

        TRIANGULO = A * C / 2.0;
        CIRCULO = PI * Math.pow(C,2);
        TRAPEZIO = (A + B) * C / 2.0;
        QUADRADO = Math.pow(B,2);
        RETANGULO = A * B;
        System.out.printf("Triangulo :  %.3f%n", TRIANGULO);
        System.out.printf("Circulo :  %.3f%n", CIRCULO);
        System.out.printf("Trapezio :   %.3f%n", TRAPEZIO);
        System.out.printf("QUADRADO :  %.3f%n", QUADRADO);
        System.out.printf("RETANGULO :   %.3f%n", RETANGULO);

        sc.close();
    }
}
