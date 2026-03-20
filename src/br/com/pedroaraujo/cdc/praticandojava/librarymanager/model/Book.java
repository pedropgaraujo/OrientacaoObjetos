package br.com.pedroaraujo.cdc.praticandojava.librarymanager.model;

public class Book extends Midia{
    private String author;

    public Book(String title, int publisherYear,String author) {
        super(title, publisherYear);
        this.author = author;
    }

    public void exibirInfo() {
        System.out.println("Código: " + generateCode() + " | Livro: \"" + getTitle() + "\" - Autor: " + author);
    }
}
