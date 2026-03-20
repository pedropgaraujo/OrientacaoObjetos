package br.com.pedroaraujo.cdc.praticandojava.banksystem.model;

public class Withdraw extends BankOperation{
    public Withdraw(double value) {
        super(value);
    }
    @Override
    public void execute(){
        System.out.printf("Saque de R$%.2f realizado%n", value);
    }
}
