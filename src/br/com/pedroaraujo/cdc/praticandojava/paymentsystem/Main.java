package br.com.pedroaraujo.cdc.praticandojava.paymentsystem;

import br.com.pedroaraujo.cdc.praticandojava.paymentsystem.model.Credit;
import br.com.pedroaraujo.cdc.praticandojava.paymentsystem.model.Payment;
import br.com.pedroaraujo.cdc.praticandojava.paymentsystem.model.Pix;
import br.com.pedroaraujo.cdc.praticandojava.paymentsystem.model.Slip;

public class Main {
    public static void main(String[] args) {
        Payment credit = new Credit(250.00);
        Payment slip = new Slip(500.00);
        Payment pix = new Pix(300.00);

        credit.confirmPayment();
        slip.confirmPayment();
        pix.confirmPayment();
    }
}
