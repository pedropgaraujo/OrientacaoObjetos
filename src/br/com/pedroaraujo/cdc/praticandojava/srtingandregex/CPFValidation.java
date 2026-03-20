package br.com.pedroaraujo.cdc.praticandojava.srtingandregex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CPFValidation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero de CPF: ");
        String cPF = scan.nextLine();
        Pattern pattern = Pattern.compile("\\d{3}+.\\d{3}+.\\d{3}+-\\d{2}");
        Matcher matcher = pattern.matcher(cPF);

        if(matcher.matches()){
            System.out.printf("O número de CPF é válido: %s", cPF);
        } else {
            System.out.println("Número de CPF inválido.");
        }



    }
}
