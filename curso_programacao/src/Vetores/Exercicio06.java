package Vetores;


import java.util.Scanner;

//Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
//terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
//o vetor C gerado.
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quntos valores vai ter cada vetor?");
        int valor = sc.nextInt();

        int[] vectA = new int[valor];
        int[] vectB = new int[valor];
        int[] vectC = new int[valor];

        System.out.println("Digite os valores do vetor A:");
        for(int i = 0;i<vectA.length;i++){
            vectA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for(int i = 0;i<vectB.length;i++){
            vectB[i] = sc.nextInt();
        }

        for(int i = 0;i<vectC.length;i++){
            vectC[i] = vectA[i] + vectB[i];
        }

        System.out.println("Vetor resultante: ");

        for(int i = 0;i<valor;i++){
            System.out.printf("%d\n ", vectC[i]);
        }
    }
}
