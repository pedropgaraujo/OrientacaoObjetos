package br.com.pedroaraujo.cdc.desafios.atv02;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        Produto produto1 = new Produto("Detergente",2.90);
        Produto produto2 = new Produto("Amaciante",10.90);
        Produto produto3 = new Produto("Limpa Vidros", 3.90);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        System.out.println("Tamanho da Lista: " + produtos.size());
        System.out.println("O segundo produto da lista e: " + produtos.get(1).toString());

        ProdutoPerecivel prodPer = new ProdutoPerecivel("Leite", 2.75, "25/11/2025");
        prodPer.setQuantidade(56);
        System.out.println("O produto e o: " + prodPer.toString());

    }
}
