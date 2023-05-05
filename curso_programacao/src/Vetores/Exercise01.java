package Vetores;


import java.util.Locale;
import java.util.Scanner;

        //Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
        //e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

public class Exercise01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("how many numbers will you type?");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for(int i = 0;i < vect.length; i++){
            sc.nextLine();
            System.out.print("enter a number:");
            vect[i] = sc.nextInt();
        }

        for(int i = 0;i<n;i++){
            if(vect[i] < 0){
                System.out.println("negative numbers " + vect[i]);
            }
        }

        sc.close();
    }
}
