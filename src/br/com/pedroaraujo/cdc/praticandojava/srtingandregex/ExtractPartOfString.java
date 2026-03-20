package br.com.pedroaraujo.cdc.praticandojava.srtingandregex;

import java.util.Scanner;

public class ExtractPartOfString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo a ser selecionado: ");
        String file = scan.nextLine();

        int posicaoPonto = file.lastIndexOf(".");
        if (posicaoPonto != -1) {
            String nameWithoutExtension = file.substring(0, posicaoPonto);
            System.out.println("Nome do arquivo sem extensão: " + nameWithoutExtension);
        } else {
            System.out.println("O arquivo não possui extensão.");
        }
        scan.close();
    }
}
