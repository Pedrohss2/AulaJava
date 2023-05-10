package application;


import entities.Rent;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rent[] rent = new Rent[10];

        System.out.println("How many rooms will be rented? ");
        int n = sc.nextInt();

        for(int i = 1; i<= n; i++) {
            System.out.println("Rent # " + i + ":");

            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();


            System.out.println("Email: ");
            String email = sc.next();

            System.out.println("Room: ");
            int room = sc.nextInt();

            rent[room] = new Rent(name, email);
        }

        System.out.println("busy rooms");
        for(int i = 0; i < rent.length; i++){
            if(rent[i] != null) {
                System.out.println(i + ": " + rent[i]);
            }
        }
        sc.close();
    }
}
