package ExerciciosIF_ElLSE;

import java.util.Scanner;

    /*
    Escreva um programa que leia o código de um item e a quantidade deste item
    A seguir, calcule e mostre o valor da conta a pagar
    */

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int code = sc.nextInt();
        int amount = sc.nextInt();

        double sum = 0.0;

        if(code == 1) {
            sum = amount * 4.50;
        }
        else if (code == 2) {
            sum = amount * 4.50;
        }
        else if (code == 3) {
            sum = amount * 5.00;
        }
        else if(code == 4) {
            sum = amount * 2.00;
        }
        else if(code ==5) {
            sum = amount * 1.50;
        }
        System.out.printf("Total: R$ %.2f%n", sum);

        sc.close();
    }
}
