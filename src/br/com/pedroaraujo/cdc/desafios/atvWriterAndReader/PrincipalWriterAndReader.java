package br.com.pedroaraujo.cdc.desafios.atvWriterAndReader;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class PrincipalWriterAndReader {
    public static void main(String[] args) throws IOException {

        //1- Crie um programa em Java que escreva a seguinte mensagem em um arquivo chamado "arquivo.txt": "Conteúdo a
        //ser gravado no arquivo." Utilize as classes do pacote java.io.

        FileWriter writer = new FileWriter("arquivo.txt");
        writer.write("Conteúdo a ser gravado no arquivo.");

        //2- Defina uma classe chamada Titulo com os atributos necessários. Em seguida, crie um programa que instancia
        //um objeto Titulo, serializa esse objeto para JSON usando a biblioteca Gson e imprime o resultado.

        Titulo titulo = new Titulo();
        titulo.setName("Frozen");
        titulo.setDuration(105);
        titulo.setCategory("Animation");

        Gson gson = new Gson();
        String json = gson.toJson(titulo);

        System.out.println(json);

        //3- Modifique o programa anterior para que o JSON gerado seja formatado de maneira mais elegante. Utilize o méto
        //do setPrettyPrinting para alcançar esse resultado.

        Titulo titulo2 = new Titulo();
        titulo2.setName("Matrix");
        titulo2.setDuration(120);
        titulo2.setCategory("Action");

        Gson gson2 = new GsonBuilder().setPrettyPrinting().create();
        String json2 = gson2.toJson(titulo2);

        System.out.println(json2);

        //4- Defina uma classe chamada Veiculo com os atributos necessários. Em seguida, crie um programa que instancia
        //um objeto Veiculo, serializa esse objeto para JSON usando a biblioteca Gson e imprime o resultado.

        Veiculo car = new Veiculo();
        car.setMarca("Toyota");
        car.setModelo("Yaris");
        car.setAnoFabricacao(2018);
        car.setPreco(85000.00);

        Gson gson3 = new Gson();
        String jsonVeiculo = gson3.toJson(car);

        System.out.println("Objeto serializado para Json: ");
        System.out.println(jsonVeiculo);

    }
}
