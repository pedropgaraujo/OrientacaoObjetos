package br.com.pedroaraujo.cdc.praticandojava.collectionsandstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SelectingShortsNames {
    public static void main(String[] args) {

        List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda", "Alice", "Daniel", "Caroline");
        List<String> funcionariosNomeCurto = funcionarios.stream()
                .filter(nome->nome.length() <= 5)
                .collect(Collectors.toList());

        System.out.println(funcionariosNomeCurto);
    }
}
