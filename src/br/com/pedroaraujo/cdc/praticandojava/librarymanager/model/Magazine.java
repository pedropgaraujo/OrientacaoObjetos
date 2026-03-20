package br.com.pedroaraujo.cdc.praticandojava.librarymanager.model;

public class Magazine extends Midia{
    private String edition;

    public Magazine(String title, int publisherYear, String edition) {
        super(title, publisherYear);
        this.edition = edition;
    }


    public void exibirInfo() {
        System.out.println("Código: " + generateCode() + " | Revista: \"" + getTitle() + "\" - Edição: " + edition);
    }
}
