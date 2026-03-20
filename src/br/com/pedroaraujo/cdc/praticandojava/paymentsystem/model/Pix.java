package br.com.pedroaraujo.cdc.praticandojava.paymentsystem.model;

public class Pix extends Payment{

    public Pix(double value) {
        super(value);
    }

    @Override
    public void confirmPayment() {
        System.out.printf("Pagamento via Pix de R$%.2f confirmado\n",
                value);
    }
}
