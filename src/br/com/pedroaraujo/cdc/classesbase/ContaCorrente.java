package br.com.pedroaraujo.cdc.classesbase;

public class ContaCorrente extends ContaBancaria{

    public void cobrarTarifaMensal (double tarifa){
        setSaldoConta((getSaldoConta()-tarifa));
    }
}
