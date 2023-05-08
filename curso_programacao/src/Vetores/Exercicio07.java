package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double media = 0;

        System.out.println("Quantos elementos vai ter o vetor? ");
        int elementos = sc.nextInt();

        double[] vect = new double[elementos];

        for(int i =0;i<vect.length;i++){
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        System.out.println("Media do vetor");
        for(int i = 0;i<vect.length;i++){
            media += vect[i] / elementos;
        }

        System.out.printf("MEDIA DOS VETORES : \n%.3f%n", media);
        System.out.println(" ELEMENTOS ABAIXO DA MEDIA: ");

        for(int i = 0;i<vect.length;i++){
            if(vect[i] < media) {
                System.out.printf("%.1f%n", vect[i]);
            }
        }
        sc.close();
    }
}
