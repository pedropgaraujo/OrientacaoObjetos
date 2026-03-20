package br.com.pedroaraujo.cdc.praticandojava.paymentsystem.model;

public class Credit extends Payment{

    public Credit(double value) {
        super(value);
    }

    @Override
    public void confirmPayment(){
        System.out.printf("Pagamento de R$%.2f confirmado no Cartão de Crédito (Taxa: R$%.2f)\n",
                value, interestRate());
    }


    @Override
    public double interestRate() {
        return value * 0.03;
    }
}
