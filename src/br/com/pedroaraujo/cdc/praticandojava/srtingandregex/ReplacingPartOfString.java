package br.com.pedroaraujo.cdc.praticandojava.srtingandregex;

import java.util.Scanner;

public class ReplacingPartOfString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o texto normal");
        String text = scan.nextLine();

        System.out.println("Digite a palavra do texto anterior que será substituída: ");
        String oldWord = scan.nextLine();

        System.out.println("Digite a nova palavra que será utilizada para substituir: ");
        String newWord = scan.nextLine();
        scan.close();
        System.out.println(text.replace(oldWord,newWord));

    }
}
