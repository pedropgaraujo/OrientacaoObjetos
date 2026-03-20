package br.com.pedroaraujo.cdc.desafios.desafiocredito;

import java.util.Collections;
import java.util.Scanner;

//Checklist
//Criar aplicacao para lancamento de compras no cartao de credito
//Menu para lancamentos de compras
//Exibicao da lista de compras realizadas e ordenadas por valor

public class Principal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = scan.nextDouble();
        scan.nextLine();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int index = 1;
        while (index != 0){
            System.out.println("Qual o item gostaria de comprar?");
            String nomeItem = scan.nextLine();
            System.out.println("Qual o valor do item?");
            double valorItem = scan.nextDouble();

            Compra compra = new Compra(nomeItem, valorItem);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada){
                System.out.println("Sua compra foi realizada!");
                System.out.println("Deseja realizar mais alguma compra?");
                System.out.println("1 - Sim   |   0 - Não");
                index = scan.nextInt();
                scan.nextLine();
            } else {
                System.out.println("Saldo insuficiente");
                index = 0;
            }
        }

        System.out.println("--------------------FATURA-------------------");
        Collections.sort(cartao.getCompras());
        for (Compra c: cartao.getCompras()){
            System.out.println(c.getNomeItem() + " - " + c.getValorItem());
        }
        System.out.println("----------------FIM DA FATURA----------------");
        System.out.println("Saldo restante do cartão: " + cartao.getSaldo());

    }
}