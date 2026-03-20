package br.com.pedroaraujo.cdc.desafios.finalchallenge;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiConnection {
    Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .setPrettyPrinting()
            .create();

    public EnderecoCompleto pesquisaCep (String cep){

        URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), EnderecoCompleto.class);

        } catch (Exception e) {
            throw new RuntimeException("Não consegui obter o CEP");
        }

        /*try {

            String json = response.body();
            System.out.println(json);

            EnderecoCompleto enderecoPesquisa = gson.fromJson(json, EnderecoCompleto.class);
            System.out.println(enderecoPesquisa);


        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
    }

}
