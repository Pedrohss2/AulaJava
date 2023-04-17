package ExercíciosOperaçõesMatemáticas;

import java.util.Locale;
import java.util.Scanner;
public class Exercício3 {
    public static void main(String[] args) {
        //Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        // decimais conforme exemplos.
        //Fórmula da área: area = π . raio2
        //Considere o valor de π = 3.14159
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double ray, area, PI =3.1415;

        System.out.println("Enter the radius value:");
        ray = sc.nextDouble();

        area = PI * Math.pow(ray, 2.0);
        System.out.printf("A= %.4f%n ", area);

        sc.close();
    }
}
