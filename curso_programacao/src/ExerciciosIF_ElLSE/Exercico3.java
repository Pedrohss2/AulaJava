package ExerciciosIF_ElLSE;

import java.util.Scanner;

    /*
    Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
    Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
    ordem crescente ou decrescente.
    */
public class Exercico3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B;

        System.out.println("Enter a number: ");
        A = sc.nextInt();

        System.out.println("enter another number ");
        B = sc.nextInt();

        if(A % B == 0 || B % A == 0){
            System.out.println("multiple");
        }
        else{
            System.out.println("No multiple");
        }
    }
}
