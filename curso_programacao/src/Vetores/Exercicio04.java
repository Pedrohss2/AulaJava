package Vetores;

import java.util.Scanner;

//Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
//tela todos os números pares, e também a quantidade de números pares.
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeDePares = 0;
        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        for(int i = 0; i<numeros.length;i++){
            System.out.println("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Numeros pares:");
        for(int i = 0; i<numeros.length;i++){
            if(numeros[i] % 2 == 0){
                System.out.println(numeros[i]);
                quantidadeDePares++;
            }
        }

        System.out.println("Quantidade de pares: "+ " " +quantidadeDePares);


    }
}
