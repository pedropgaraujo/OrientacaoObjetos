package br.com.pedroaraujo.cdc.desafios.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


record PessoaJson2(String nome, int idade, String cidade) {}

public class ConversaoJsonParaObjetoFlexivel {
    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Gustavo\",\"cidade\":\"Porto\"}";

        Gson gson = new GsonBuilder().setLenient().create();
        PessoaJson2 pessoa = gson.fromJson(jsonPessoa, PessoaJson2.class);

        System.out.println("Objeto br.com.pedroaraujo.cdc.classesbase.Pessoa: " + pessoa);
    }
}
