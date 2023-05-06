package Vetores;

import java.util.Locale;
import java.util.Scanner;

//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
//- Imprimir todos os elementos do vetor
//- Mostrar na tela a soma e a média dos elementos do vetor
public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double media, soma;

        System.out.println("Quantos numeros voce vai digitar?");
         n = sc.nextInt();

        double[] vect = new double[n];

        for(int i = 0; i<vect.length;i++){
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        //Os valores do array
        System.out.println("Valores:");
        for(int i = 0; i<vect.length;i++){
            System.out.printf("%.1f%n", vect[i]);
        }

        //Andando indice por indice e somando os numeros
        soma = 0.0;
        for (double v : vect) {
            soma += v;
        }

        //A media dos numeros do array
        media = soma / n;

        System.out.printf("Soma %.2f%n", soma);
        System.out.printf("Soma %.2f%n", media);

        sc.close();
    }
}
