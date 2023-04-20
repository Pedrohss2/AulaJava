package ExerciciosFOR;

import java.util.Scanner;

//Ler um número inteiro N e calcular todos os seus divisores.
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int i = 1; i <= number; i++) {
            if(number % i == 0){
                System.out.println(i);
            }
        }
    }
}
