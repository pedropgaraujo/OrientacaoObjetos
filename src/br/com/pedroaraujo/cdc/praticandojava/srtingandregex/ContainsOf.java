package br.com.pedroaraujo.cdc.praticandojava.srtingandregex;

import java.util.Scanner;

public class ContainsOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um texto qualquer: ");
        String text = scan.nextLine();
        System.out.println("Agora digite uma palavra qualquer: ");
        String word = scan.nextLine();

        if(text.contains(word)){
            System.out.println("A palavra '"+ word + "' está dentro do texto '" + text + "'");
        } else {
            System.out.println("O texto '" + text + "' não tem a palavra '" + word + "'");
        }
    }
}
