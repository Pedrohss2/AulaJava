package ExerciciosWHILE;

//Escreva um programa em Java que mostra todos osnúmeros pares de 1 até 100.
public class Exercicio5 {
    public static void main(String[] args) {

        int x = 1;

        while (x <= 100) {
            if(x % 2 == 1){
                System.out.println(x);
            }
            x++;
        }
    }
}
