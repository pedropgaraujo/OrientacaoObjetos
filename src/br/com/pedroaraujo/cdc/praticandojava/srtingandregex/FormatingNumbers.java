package br.com.pedroaraujo.cdc.praticandojava.srtingandregex;

import java.util.Scanner;

public class FormatingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor decimal: ");
        double value = scan.nextDouble();
        System.out.printf("O valor digitado foi %f e esse mesmo valor formatado é %.2f", value, value);
    }
}
