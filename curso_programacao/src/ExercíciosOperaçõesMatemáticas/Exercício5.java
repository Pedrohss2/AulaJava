package ExercíciosOperaçõesMatemáticas;

import java.util.Locale;
import java.util.Scanner;

public class Exercício5 {
    public static void main(String[] args) {
        //Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        //hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        //decimais.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the employee number:");
        int employeeNumber = sc.nextInt();

        System.out.println("Enter the number of hours worked:");
        int NumberOfHoursWorked = sc.nextInt();

        double wage = sc.nextDouble();

        double salary = NumberOfHoursWorked * wage;
        System.out.println("Number: " + employeeNumber);
        System.out.printf("SALARY: U$ %.2f%n", salary);

        sc.close();
    }
}
