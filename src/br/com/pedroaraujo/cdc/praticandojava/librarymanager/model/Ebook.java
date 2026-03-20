package br.com.pedroaraujo.cdc.praticandojava.librarymanager.model;

public class Ebook extends Midia{
    private String format;

    public Ebook(String title, int publisherYear, String format) {
        super(title, publisherYear);
        this.format = format;
    }


    public void exibirInfo() {
        System.out.println("Código: " + generateCode() + " | Ebook: \"" + getTitle() + "\" - Formato: " + format);
    }
}
