package ExerciciosFOR;

import java.util.Scanner;

//exibir a tabuada de multiplicação de um número digitado pelo usuário.
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int value = sc.nextInt();
        int tab = 0;

        for(int i = 0; i <= 10; i++) {
            tab = i * value;
            System.out.println( value +" X " + i + " = " +tab);
        }
        sc.close();
    }

}
