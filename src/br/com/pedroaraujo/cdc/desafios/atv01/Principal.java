package br.com.pedroaraujo.cdc.desafios.atv01;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Pedro", 27);
        Pessoa pessoa2 = new Pessoa("Wilds", 32);
        Pessoa pessoa3 = new Pessoa("Redliw", 23);
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("O tamanho da lista e de: " + listaDePessoas.size());
        System.out.println("A primeira pessoa da fila e: " + listaDePessoas.get(0).toString());
        System.out.println("A lista completa: " + listaDePessoas.toString());


    }
}

