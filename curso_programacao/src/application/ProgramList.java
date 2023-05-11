package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramList {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char response;

        List<Employee> list = new ArrayList<>();

        System.out.println("How many employees will be registered");
        int employees = sc.nextInt();

        do {
            for(int i = 1; i <= employees; i++) {
                System.out.println("Employee # " + i + " :");

                System.out.println("Id: ");
                sc.nextLine();
                int id = sc.nextInt();

                //Faz a verificação do ID == ao anterior, fazendo a chamada da função hasId....
                while (hasId(list,id)) {
                    System.out.print("Id already taken. Try again: ");
                    id = sc.nextInt();
                }

                // *-----------------------------------------
                //  Pedir os dados e adicionar na minha lista

                System.out.println("Name: ");
                sc.next();
                String name = sc.nextLine();

                System.out.println("Salary");
                double salary = sc.nextDouble();

                /* Inicializar a lista: */
                list.add(new Employee(id, name , salary));
            }

            //O ID que vai ser acrescentado a porcetagem...
            System.out.println();
            System.out.println("Enter the employee id that will have salary increase");
            int id = sc.nextInt();

            //Fazendo a verificação do id, Se não existir um ID, me retorna null.
            Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

            if(emp == null) {
                System.out.println("This id does not exist!");
            }
            else {
                System.out.println("Enter the percentage:");
                double percentage = sc.nextDouble();
                emp.increaseSalary(percentage);
            }

            //Escrevendo a lista na tela...
            System.out.println("List of employees:");
            for(Employee lts : list) {
                System.out.println(lts);
            }

            System.out.println("Do you want to continue? (Y/N)");
            response = sc.next().charAt(0);
        }while (response == 'Y');

    }

    //Verificando se na minha lista ja tem um ID igual ao anterior....
    //Se tiver, vai me retorna um valor true
    public static boolean hasId(List<Employee> list, int id) {
            Employee emp = list.stream().filter( (x -> x.getId()== id)).findFirst().orElse(null);
            return emp != null;
    }
}
