package Vetores;

import java.util.Scanner;

//Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
//devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
//da pessoa mais velha.
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos pessoas vai digitar? ");
        int pessoas = sc.nextInt();

        int pessoaMaisVelha;

        int[] idade = new int[pessoas];
        String[] nomes = new String[pessoas];

        for(int i = 0; i < nomes.length;i++){
            System.out.println("Nome: ");
            nomes[i] = sc.next();

            System.out.println("Idade:");
            idade[i] = sc.nextInt();
        }


        pessoaMaisVelha = idade[0];
        int maior = 0;
        for (int i = 0; i < pessoas;i++){
            if(idade[i] > pessoaMaisVelha) {
                pessoaMaisVelha = idade[i];
                maior++;
            }
        }
        System.out.println("Pessoa mais velha: " + nomes[maior]);
    }
}
