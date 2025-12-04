package br.com.pedroaraujo.cdc.polimorfismo;

public interface Vendavel {
    double calcularPrecoTotal(int quantidade);
    void aplicarDesconto(double percentualDesconto);
}
