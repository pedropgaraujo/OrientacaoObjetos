package br.com.pedroaraujo.cdc.praticandojava.srtingandregex;

public class RemovingWhiteSpaces {
    public static void main(String[] args) {
        String name = "                   Pedro Araujo";
        System.out.println("Antes da formatação: ");
        System.out.println(name);
        System.out.println("Depois da formatação: ");
        System.out.println(name.trim());
    }

}
