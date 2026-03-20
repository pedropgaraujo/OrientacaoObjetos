package br.com.pedroaraujo.cdc.praticandojava.librarymanager.model;

public class Midia {
    private String title;
    private int publisherYear;

    public Midia(String title, int publisherYear) {
        this.title = title;
        this.publisherYear = publisherYear;
    }

    public String getTitle() {
        return title;
    }

    public int getPublisherYear() {
        return publisherYear;
    }

    public String generateCode (){
        return("Código: LIB-" + title.substring(0,3) + publisherYear);
    }
}
