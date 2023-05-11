package Listas;

import org.jetbrains.annotations.NotNull;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;


public class Program {
    public static void main(String[] args) {
        //Lista de numero intero
        //Instanciar uma classe que implementa a interface
        List<String> list = new ArrayList<>();

        //Adicionar elementos
        list.add("Lucas");
        list.add("Maria");
        list.add("Bob");
        list.add("Alex");

        //Inserir um elemento em determinada posição
        list.add(2, "Joao");

        //Tamanho da lista
        System.out.println(list.size());


        for(String x : list) {
            System.out.println(x);
        }
        System.out.println("------------------");
        //Remover elemento da lista
        //list.remove(1);

        //Remover por um predicado:
        //Função lambda:
        //True or False
        list.removeIf(x -> x.charAt(0) == 'M');

        for(String x : list) {
            System.out.println(x);
        }
        System.out.println("------------------");
        //Posição de um elemento:
        System.out.println("Index of Bob " + list.indexOf("Bob"));
        System.out.println("Index of Marco " + list.indexOf("Marco"));

        System.out.println("------------------");
        //Filtar minha lista:
        //Criar uma nova lista, contendo apenas os nomes comecando com 'A'                                                                    //Para converter para lista:
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for(String x : result) {
            System.out.println(x);
        }

        System.out.println("------------------");
        //O primeiro elemento que atenda o predicado:                           Retorna um opn String
                                                                                 //Se o elemnto nao existir, retorna NULL
        String name = list.stream().filter((x -> x.charAt(0) == 'K')).findFirst().orElse(null);
        System.out.println(name);
    }
}
