package Vetores;


import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//bem como os nomes dessas pessoas caso houver.
public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas? 5");
        int numeroDePessoas = sc.nextInt();

        String[] name = new String[numeroDePessoas];
        int[] idade = new int[numeroDePessoas];
        double[] altura = new double[numeroDePessoas];

        for(int i = 0; i<numeroDePessoas; i++){
            System.out.printf("Dados da %da pessoa", i+1);
            System.out.println("NOME:");
            name[i] = sc.next();
            System.out.println("Idade: ");
            idade[i] = sc.nextInt();
            System.out.println("Altura: ");
            altura[i] = sc.nextDouble();
        }

        double numeroDePessoasComMenosDe16 = 0.0;
        double alturaTotal = 0.0;
        for(int i = 0; i<numeroDePessoas;i++){
            if(idade[i] < 16){
                numeroDePessoasComMenosDe16++;
            }
            alturaTotal += altura[i];
        }

        double alturaMedia = alturaTotal /  numeroDePessoas;
        double percentualMenores = (numeroDePessoasComMenosDe16 / numeroDePessoas) * 100.00;

        System.out.printf("Altura media: %.2f\n", alturaMedia);
        System.out.printf("Pessoas com menos de 16: %.1f%%\n", percentualMenores);

        for (int i = 0; i<numeroDePessoas; i++){
            if(idade[i] < 16){
                System.out.printf("%s\n", name[i]);
            }
        }
        sc.close();
    }
}

