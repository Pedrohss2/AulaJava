import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args) {
        //Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        //de A e B pelo produto de C e D.
        Scanner sc = new Scanner(System.in);

        int A,B,C,D, differenceOfProducts;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        differenceOfProducts = (A * B - C * D);
        System.out.println("Difference:" + differenceOfProducts);
        sc.close();

    }
}
