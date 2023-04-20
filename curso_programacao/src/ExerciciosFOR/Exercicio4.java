package ExerciciosFOR;

import java.util.Scanner;

//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//.segundo Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 0; i < N; i++) {

            int numerator = sc.nextInt();
            int denominator = sc.nextInt();

            if(denominator == 0) System.out.println("impossible division");

            else {
                double division = (double) numerator / denominator;
                System.out.println(division);
            }
        }
        sc.close();
    }
}
