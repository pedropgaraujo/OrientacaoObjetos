package br.com.pedroaraujo.cdc.praticandojava.collectionsandstream;

import java.util.ArrayList;
import java.util.List;

public class AcessingElements {
    public static void main(String[] args) {

        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("João");
        funcionarios.add("Maria");
        funcionarios.add("Ana");
        funcionarios.add("Pedro");
        funcionarios.add("Antonio");

        System.out.println("A segunda pessoa da lista é a: " + funcionarios.get(1));
        System.out.println("O total de funcionários é de: " + funcionarios.size());
    }
}
