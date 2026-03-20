package br.com.pedroaraujo.cdc.desafios.finalchallenge;

import java.io.IOException;
import java.util.Scanner;

public class PrincipalFinalChallenge {
    public static void main(String[] args) {

        ApiConnection api = new ApiConnection();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o CEP que gostaria de consultar: ");
        String cep = scanner.nextLine();


        try {
            EnderecoCompleto novoEndereco = api.pesquisaCep(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);
        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicacao");
        }

    }
}
