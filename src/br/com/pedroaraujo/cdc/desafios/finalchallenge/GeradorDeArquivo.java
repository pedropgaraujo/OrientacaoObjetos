package br.com.pedroaraujo.cdc.desafios.finalchallenge;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {

    public void salvaJson(EnderecoCompleto enderecoCompleto) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter writer = new FileWriter(enderecoCompleto.cep()+ ".json");
        writer.write(gson.toJson(enderecoCompleto));
        writer.close();
    }
}
