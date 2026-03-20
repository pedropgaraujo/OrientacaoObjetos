package br.com.pedroaraujo.cdc.praticandojava.srtingandregex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidating {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma senha: ");
        System.out.println("Ela deve conter:");
        System.out.println("""
                - 8 caracteres
                - 1 letra maiuscula
                - 1 letra minuscula
                - 1 numero
                - 1 caracter especial""");
        String pass = scan.nextLine();

        String regexPassValidation = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        Pattern pattern = Pattern.compile(regexPassValidation);
        Matcher matcher = pattern.matcher(pass);

        if (matcher.matches()){
            System.out.printf("Senha Forte! : %s", pass);
        } else {
            System.out.printf("Senha fraca, tente novamente: %s", pass);
        }
    }
}
