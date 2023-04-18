package ExerciciosWHILE;

import java.util.Scanner;

/*
Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
*/

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int password = sc.nextInt();

        // Considere a senha '2002' como a senha correta.
        while (password != 2002) {
            System.out.println("invalid password");
            password = sc.nextInt();
        }

        System.out.println("correct password");
        sc.close();
    }
}
