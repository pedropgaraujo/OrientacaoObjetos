package br.com.pedroaraujo.cdc.desafios.desafioCredito;

public class Compra implements Comparable<Compra>{
    private String nomeItem;
    private double valorItem;

    public Compra(String nomeItem, double valorItem) {
        this.nomeItem = nomeItem;
        this.valorItem = valorItem;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public double getValorItem() {
        return valorItem;
    }

    @Override
    public String toString() {
        return "Compra: " + nomeItem + "R$" + valorItem%.2f ;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valorItem).compareTo(Double.valueOf(outraCompra.valorItem));
    }
}
