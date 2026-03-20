package br.com.pedroaraujo.cdc.praticandojava.banksystem.model;

public abstract class BankOperation implements BankAction{
    protected double value;

    public BankOperation(double value) {
        this.value = value;
    }

    @Override
    public void execute() {

    }
}
