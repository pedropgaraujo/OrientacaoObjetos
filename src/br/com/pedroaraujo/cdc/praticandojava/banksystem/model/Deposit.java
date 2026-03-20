package br.com.pedroaraujo.cdc.praticandojava.banksystem.model;

public class Deposit extends BankOperation{
    public Deposit(double value) {
        super(value);
    }
    @Override
    public void execute(){
        System.out.printf("Depósito de R$%.2f realizado%n", value);
    }
}
