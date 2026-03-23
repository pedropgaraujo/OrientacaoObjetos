package br.com.pedroaraujo.cdc.praticandojava.collectionsandstream;

import java.util.List;

public class StudentStatistics {
    public static void main(String[] args) {

        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);

        double totalNotas = notas.stream().reduce(0.0, Double::sum);
        double media = totalNotas / notas.size();
        double maiorNota = notas.stream().max(Double::compare).get();
        double menorNota = notas.stream().min(Double::compare).get();

        System.out.println("A média das notas é: "+media);
        System.out.println("A menor nota foi de: " + menorNota);
        System.out.println("A maior nota foi de: "+maiorNota);
    }
}
