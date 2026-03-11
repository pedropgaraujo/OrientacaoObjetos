package br.com.pedroaraujo.cdc.desafios.cursoapis.atv01;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        //1 - Crie um programa em Java que utilize as classes HttpClient, HttpRequest e HttpResponse para fazer uma consulta
        //à API do Google Books. Solicite ao usuário que insira o título de um livro, e exiba as informações disponíveis
        //sobre o livro retornado pela API.

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um livro para buscar: ");
        var busca = scan.nextLine();
        var chaveBooks = "AIzaSyB4TXNpeofj3yNSW8i8mI-vsJAHBBua4jI";

        String enderecoBooks = "https://www.googleapis.com/books/v1/volumes?q=" + busca + "&key=" + chaveBooks;
        System.out.println(enderecoBooks);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest requestBooks = HttpRequest.newBuilder()
                .uri(URI.create(enderecoBooks))
                .build();

        HttpResponse<String> responseBooks = client
                .send(requestBooks, HttpResponse.BodyHandlers.ofString());
        System.out.println(responseBooks.body());

        //2 - Crie um programa Java que utiliza as classes HttpClient, HttpRequest e HttpResponse para fazer uma consulta
        //à API CoinGecko e exiba a cotação atual de uma criptomoeda escolhida pelo usuário.

        System.out.println("Digite uma criptomoeda para buscar: ");
        busca = scan.nextLine();

        String enderecoCoinGecko = "https://api.coingecko.com/api/v3/simple/price?ids=" + busca + "&vs_currencies=usd";
        System.out.println(enderecoCoinGecko);
        HttpRequest requestCripto = HttpRequest.newBuilder()
                .uri(URI.create(enderecoCoinGecko))
                .build();

        HttpResponse<String> responseCripto = client
                .send(requestCripto, HttpResponse.BodyHandlers.ofString());
        System.out.println(responseCripto.body());

        //3 - Crie um programa Java que faça uma consulta à API do TheMealDB utilizando as classes HttpClient, HttpRequest
        //e HttpResponse. Solicite ao usuário que insira o nome de uma receita e exiba as informações disponíveis sobre essa receita.

        System.out.println("Digite uma Receita para buscar: ");
        busca = scan.nextLine();

        String enderecoReceita = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + busca;
        System.out.println(enderecoReceita);
        HttpRequest Receita = HttpRequest.newBuilder()
                .uri(URI.create(enderecoReceita))
                .build();

        HttpResponse<String> responseReceita = client
                .send(Receita, HttpResponse.BodyHandlers.ofString());
        System.out.println(responseReceita.body());

    }
}
