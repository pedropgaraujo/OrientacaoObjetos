package br.com.pedroaraujo.cdc.praticandojava.paymentsystem.model;

public class Payment {
    protected double value;

    public Payment(double value) {
        this.value = value;
    }

    public void confirmPayment(){
        System.out.printf("Pagamento de R$%.2f confirmado\n", value, interestRate());
    }

    public double interestRate(){
        return value * 0.0;
    }
}
