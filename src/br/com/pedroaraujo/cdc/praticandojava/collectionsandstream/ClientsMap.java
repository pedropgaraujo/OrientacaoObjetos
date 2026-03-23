package br.com.pedroaraujo.cdc.praticandojava.collectionsandstream;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClientsMap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<Integer, String> clientes = new HashMap<>();
        clientes.put(1, "Maria");
        clientes.put(2, "Marcos");
        clientes.put(3, "Joelson");

        System.out.println("Digite uma chave para procurar o cliente: ");
        int search = scan.nextInt();
        if (clientes.get(search) == null){
            System.out.println("Não existe um cliente com essa chave!");
        } else {
            System.out.println("O nome do cliente com ID "+search+" é: " + clientes.get(search));
        }


    }
}
