package br.com.pedroaraujo.cdc.praticandojava.collectionsandstream;

import java.util.List;

public class CalculatingTaxes {
    public static void main(String[] args) {

        List<Double> productPrices = List.of(29.99, 49.50, 15.75, 99.99);

        double totalSpent = productPrices.stream()
                .reduce(0.0, Double::sum);

        double taxes = totalSpent * 0.08;
        double totalWithTaxes = totalSpent + taxes;

        System.out.println("Valor total antes do imposto: " + String.format("%.2f", totalSpent));
        System.out.println("Valor total com imposto de 8%: " + String.format("%.2f", totalWithTaxes));
    }
}
