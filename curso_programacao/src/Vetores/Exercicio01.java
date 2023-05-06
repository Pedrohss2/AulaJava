package Vetores;
//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
// Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar?");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for(int i = 0; i< vect.length;i++){
            System.out.println("Digite um numero:");
            vect[i] = sc.nextInt();
        }

        System.out.println("Numeros negativos:");
        for(int i = 0; i<vect.length;i++){
            if(vect[i] < 0){
                System.out.println(vect[i]);
            }
        }
    }
}
