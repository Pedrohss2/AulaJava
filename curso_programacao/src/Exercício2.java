import java.util.Scanner;
public class Exercício2 {

    public static void main(String[] args) {
        // Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        //mensagem explicativa.
        Scanner sc = new Scanner(System.in);

        int number1, number2;

        number1 = sc.nextInt();
        number2 = sc.nextInt();

        int sum = number1 + number2;
        System.out.println("Soma " + sum);

        sc.close();
    }
}
