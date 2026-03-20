package br.com.pedroaraujo.cdc.desafios.gson;

import com.google.gson.Gson;


record PessoaJson1(String nome, int idade, String cidade) {}

public class ConversaoJsonParaObjeto {

    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Kleber\",\"idade\":36,\"cidade\":\"Aveiro\"}";

        Gson gson = new Gson();
        PessoaJson1 pessoa = gson.fromJson(jsonPessoa, PessoaJson1.class);

        System.out.println("Objeto br.com.pedroaraujo.cdc.classesbase.Pessoa: " + pessoa);
    }
}
