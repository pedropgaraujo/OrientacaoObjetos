package br.com.pedroaraujo.cdc.praticandojava.bookedcontrol;

import br.com.pedroaraujo.cdc.praticandojava.bookedcontrol.model.Booked;
import br.com.pedroaraujo.cdc.praticandojava.bookedcontrol.model.BookedVip;

public class Main {
    public static void main(String[] args) {
        Booked b = new Booked();
        b.booked();
        b.booked("10-04-2026");
        b.booked("10-04-2026",7);

        Booked vip = new BookedVip();
        vip.booked();
    }
}
