package br.com.pedroaraujo.cdc.praticandojava.banksystem;

import br.com.pedroaraujo.cdc.praticandojava.banksystem.model.BankOperation;
import br.com.pedroaraujo.cdc.praticandojava.banksystem.model.Deposit;
import br.com.pedroaraujo.cdc.praticandojava.banksystem.model.Withdraw;

public class Main {
    public static void main(String[] args) {

        BankOperation deposit = new Deposit(200.0);
        BankOperation withdraw = new Withdraw(50.5);

        deposit.execute();
        withdraw.execute();
    }
}
