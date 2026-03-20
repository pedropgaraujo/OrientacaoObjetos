package br.com.pedroaraujo.cdc.praticandojava.paymentsystem.model;

public class Slip extends Payment{
    private double rateSlip;
    public Slip(double value) {
        super(value);
    }

    @Override
    public void confirmPayment() {
        System.out.printf("Boleto de R$%.2f gerado com sucesso (Taxa: R$%.2f)\n",
                value, interestRate());
    }

    @Override
    public double interestRate() {
        return value * 0.01;
    }
}
