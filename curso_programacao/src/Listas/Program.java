package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Tamanho da lista
list.size();


list.add(2, "Julia");
list.remove(1);
*/
public class Program {
    public static void main(String[] args) {
        //Não aceita tipos primitivos
        List<String> list = new ArrayList<>();
        list.add("Maria");// [0]
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");

        System.out.println(list.size());


        for (String lista : list) {
            System.out.println(lista);
        }
        System.out.println("----------------------");

        //PREDICADO [true or false]
        list.removeIf(lista -> lista.charAt(0) == 'M');

        for (String lista : list) {
            System.out.println(lista);
        }

        System.out.println("----------------------");
        System.out.println("Index of Bob " + list.indexOf("Bob"));

        System.out.println("----------------------");
         List<String> result = list.stream().filter(lista -> lista.charAt(0) == 'B').collect(Collectors.toList());

        for (String lista : result) {
            System.out.println(lista);
        }

        System.out.println("----------------------");
        String name = list.stream().filter(lista -> lista.charAt(0) == 'c').findFirst().orElse(null);
        System.out.println(name);
    }
}
