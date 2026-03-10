package br.com.pedroaraujo.cdc.desafios.atv04;

import java.util.*;

public class Principal {

    public static void main(String[] args) {
        //1 - Crie uma lista de números inteiros e utilize o mét odo Collections.sort para ordená-la em ordem crescente.
        //Em seguida, imprima a lista ordenada.

        List<Integer> numeros = new ArrayList<>();

        numeros.add(50);
        numeros.add(32);
        numeros.add(18);
        numeros.add(7);
        numeros.add(12);
        numeros.add(30);
        numeros.add(39);

        //System.out.println("Antes de ordenar");
        //System.out.println(numeros);
        //Collections.sort(numeros);
        //System.out.println("Depois de ordenar");
        //System.out.println(numeros);

        //2 - Crie uma classe Titulo com um atributo nome do tipo String. Implemente a interface Comparable na classe
        //para que seja possível ordenar uma lista de objetos Titulo.

        Titulo titulo1 = new Titulo("Thiago" , 32);
        Titulo titulo2 = new Titulo("Pedro" , 30);
        Titulo titulo3 = new Titulo("Reinaldo" , 28);


        List<Titulo> arrayTitulos = new ArrayList<>();
        List<Titulo> linkedTitulos = new LinkedList<>();

        arrayTitulos.add(titulo1);
        arrayTitulos.add(titulo2);
        arrayTitulos.add(titulo3);

        linkedTitulos.add(titulo1);
        linkedTitulos.add(titulo2);
        linkedTitulos.add(titulo3);

        System.out.println("Antes de ordenar - Array");
        System.out.println(arrayTitulos);
        Collections.sort(arrayTitulos);
        System.out.println("Depois de ordenar - Array");
        System.out.println(arrayTitulos);


        System.out.println("Antes de ordenar por ano - Array");
        System.out.println(arrayTitulos);
        arrayTitulos.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println("Depois de ordenar por ano - Array");
        System.out.println(arrayTitulos);

        //4 - Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList quanto como LinkedList.
        //Adicione elementos e imprima a lista, mostrando que é possível trocar facilmente a implementação.

        System.out.println("Antes de ordenar - Linked");
        System.out.println(linkedTitulos);
        Collections.sort(arrayTitulos);
        System.out.println("Depois de ordenar - Linked");
        System.out.println(linkedTitulos);

        System.out.println("Antes de ordenar por ano - Linked");
        System.out.println(linkedTitulos);
        arrayTitulos.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println("Depois de ordenar por ano - Linked");
        System.out.println(linkedTitulos);

        //5 - Modifique o Exercício 4 para declarar a variável de lista como a interface List, demonstrando o uso de
        //polimorfismo.

        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);





    }
}
