package Vetores;

import java.util.Locale;
import java.util.Scanner;

//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
//o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
//considerando a primeira posição como 0 (zero).
public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double maior = 0;
        int posicaoMaior = 0;

        System.out.println("Quantos numeros voce vai digitar?");
        int numerosDigitado = sc.nextInt();

        double[] num = new double[numerosDigitado];

        //Adicionar numeros no array
        for(int i = 0;i<num.length;i++){
            System.out.println("Digite um numero");
            num[i] = sc.nextDouble();
        }

        //Verificar o maior valor:
        for(int i = 0;i<num.length;i++){
            if(num[i] > maior){
              maior = num[i];
              posicaoMaior = i;
            }
        }
        System.out.println("MAIOR valor = " + maior);
        System.out.println("O MAIOR valor esta na posiçã = " + posicaoMaior);
    }
}
