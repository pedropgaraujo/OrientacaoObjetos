package br.com.pedroaraujo.cdc.praticandojava.srtingandregex;

public class LowerAndUpperCase {
    public static void main(String[] args) {
        String name = "Pedro Araujo";
        System.out.println("Antes da formatação: ");
        System.out.println(name);
        System.out.println("Depois da formatação Upper: ");
        System.out.println(name.toUpperCase());
        System.out.println("Depois da formatação Lower: ");
        System.out.println(name.toLowerCase());
    }
}
