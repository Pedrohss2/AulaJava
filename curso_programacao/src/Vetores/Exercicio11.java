package Vetores;

import java.util.Locale;
import java.util.Scanner;

//Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
//que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
//de homens.
public class Exercicio11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int qtdMasculino = 0, qtdMulheres = 0;


        System.out.println("Quantas pessoas serao digitadas?");
        int pessoas = sc.nextInt();

        double[] altura = new double[pessoas];
        char[] genero = new char[pessoas];

        for(int i = 0; i< pessoas;i++){
            System.out.printf("Altura da %d pessoa:", i+1);
            altura[i] = sc.nextDouble();

            System.out.printf("Genero da %d pessoa:", i + 1);
            genero[i] = sc.next().charAt(0);
        }

        double menorAltura = altura[0], maiorAltura = altura[0], altuaFMtotal = 0.0;

        for(int i = 0; i< pessoas;i++){
            if(altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }
           if(altura[i] < menorAltura) {
               menorAltura = altura[i];
           }
        }

        for(int i = 0; i< pessoas;i++){
            if (genero[i] == 'M'){
                qtdMasculino++;
            }
            else {
                qtdMulheres++;
                altuaFMtotal = altuaFMtotal + altura[i];

            }
        }
            double mediaDeAlturaMulheres = altuaFMtotal / qtdMulheres;

        System.out.println("Menor altura " + menorAltura);
        System.out.println("Maior altura " + maiorAltura);
        System.out.println("Quntidade de homens " + qtdMasculino);
        System.out.printf("Media de altura feminina %.2f%n", mediaDeAlturaMulheres);
    }
}
