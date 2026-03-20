package br.com.pedroaraujo.cdc.praticandojava.srtingandregex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatingRegex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um código de referência: ");
        String code = scan.nextLine();
        String regex = "^[A-Z]{3}-\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(code);

        if (matcher.matches()) {
            System.out.println("O código de referência está válido.");
        } else {
            System.out.println("Código Inválido!");
        }

    }
}
