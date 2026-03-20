package br.com.pedroaraujo.cdc.praticandojava.librarymanager;

import br.com.pedroaraujo.cdc.praticandojava.librarymanager.model.Book;
import br.com.pedroaraujo.cdc.praticandojava.librarymanager.model.Ebook;
import br.com.pedroaraujo.cdc.praticandojava.librarymanager.model.Magazine;
import br.com.pedroaraujo.cdc.praticandojava.librarymanager.model.Midia;

public class Main {

    public static void main(String[] args) {

        Book book = new Book("Ghostbumpers" , 1999, "Densel Washington");
        Magazine magazine = new Magazine("Revista Veja", 2010, "26");
        Ebook ebook = new Ebook("Conceitos de Java", 2016, "PDF");

        book.exibirInfo();
        magazine.exibirInfo();
        ebook.exibirInfo();
    }
}
