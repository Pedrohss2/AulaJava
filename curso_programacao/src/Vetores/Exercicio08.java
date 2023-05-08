package Vetores;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
//aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
//digitado, mostrar a mensagem "NENHUM NUMERO PAR"
public class Exercicio08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double numeroPares = 0, quantidade = 0;

        System.out.println("Quantos elemntos vai ter o vetor?");
        int elementos = sc.nextInt();

        double[] numero = new double[elementos];

        for(int i = 0; i<numero.length;i++){
            System.out.println("Digite um numero");
            numero[i] = sc.nextDouble();
        }

        for(int i = 0; i<numero.length;i++){
            if(numero[i] %2 == 0){
                quantidade = quantidade + numero[i];
                numeroPares++;
            }
        }
        if(numeroPares != 0) {
            double media = quantidade / numeroPares;
            System.out.printf("Media %.2f%n", media);
        }
        else {
            System.out.println("Nem um numero PAR.");
        }
        sc.close();
    }
}
