package Vetores;

import java.util.Locale;
import java.util.Scanner;
//Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
//no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
//os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
//igual a 6.0 (seis).
public class Exercicio10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos serao digitados? ");
        int alunos = sc.nextInt();

        String[] nomes = new String[alunos];
        double[] nota1 = new double[alunos];
        double[] nota2 = new double[alunos];

        for(int i = 0; i< alunos;i++) {
            System.out.printf("Digite nome,  primeira e segunda nota do %do aluno", i+1 );
            nomes[i] = sc.next();
            sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
        }

        System.out.println("Aprovados: ");

        for(int i = 0; i< alunos;i++){
            double media = (nota1[i] + nota2[i]) / 2;
            if(media >= 6.0) {
                System.out.printf("%s\n", nomes[i]);
            }
        }
        sc.close();

    }
}
