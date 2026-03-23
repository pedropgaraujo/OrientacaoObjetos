package br.com.pedroaraujo.cdc.praticandojava.collectionsandstream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SquareOfNumbers {
    public static void main(String[] args) {

        List<Integer> numeros = List.of(2, 3, 5, 7, 11);

        List<Integer> numerosAoQuadrado = numeros.stream()
                .map(numero -> numero * numero)
                .collect(Collectors.toList());

        System.out.println("A lista de números ao quadrado é: ");
        System.out.println("Originais: " + numeros);
        System.out.println("Ao quadrado: " + numerosAoQuadrado);
    }
}
