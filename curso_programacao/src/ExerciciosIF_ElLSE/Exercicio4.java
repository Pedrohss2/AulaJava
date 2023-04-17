package ExerciciosIF_ElLSE;

import java.util.Scanner;

    /*
    Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
    começar em um dia e terminar em outro,
    tendo uma duração mínima de 1 hora e máxima de 24 horas.
    */

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startTime = sc.nextInt();
        int endOfTheGame = sc.nextInt();

            int duration = 0;

            if (startTime < endOfTheGame) {
                duration = endOfTheGame - startTime;
            }
            else {
                duration = 24 - startTime + endOfTheGame;
            }

        System.out.println("the game laste: " + duration + " Hour(s)");

    }
}
