package ExerciciosFOR;

import java.util.Locale;
import java.util.Scanner;

//Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino)
// de 10 pessoas. Faça um algoritmo que calcule e escreva:
//a. a maior e a menor altura do grupo;
//b. média de altura dos homens;
//c. o número de mulheres.
public class Exercicio9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int sexoDaPessoa, numeroDeHomes = 0, numerosDeMulheres = 0;
        float alturaDaPessoa = 0, mediaDeAlturaDosHomens = 0, maiorAltura = 0, menorAltura = 0, somaH = 0;

        for(int i = 0; i<10; i++) {
            System.out.println("Qual seu sexo? (1-Masculino) (2-Feminino)");
            sexoDaPessoa = sc.nextInt();
            System.out.println("Digite sua altura");
            alturaDaPessoa = sc.nextFloat();

            if (sexoDaPessoa == 1) {
                numeroDeHomes++;
                somaH += alturaDaPessoa;
            }
            else if(sexoDaPessoa == 2) {
                numerosDeMulheres++;
            }
            else {
                System.out.println("Opçao de sexo invalida");
            }
            if(alturaDaPessoa > maiorAltura) {
                maiorAltura = alturaDaPessoa;
            }
            else if(alturaDaPessoa < maiorAltura) {
                menorAltura = alturaDaPessoa;
            }
            mediaDeAlturaDosHomens = somaH / numeroDeHomes;
        }
            System.out.println("Amaior altura é "+maiorAltura + " e a menor altura é" + menorAltura);
            System.out.println("A media de altura dos homens é: " + mediaDeAlturaDosHomens);
            System.out.println("A quantidade de mulheres é: "+ numerosDeMulheres);
    }
}
