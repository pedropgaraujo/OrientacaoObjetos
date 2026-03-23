package br.com.pedroaraujo.cdc.praticandojava.collectionsandstream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployesList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> funcionarios = new ArrayList<>();
        String index = "";

        while(index.isEmpty()) {
            System.out.println("Digite o nome do funcionário a ser adicionado a lista: ");
            funcionarios.add(scan.nextLine());
            System.out.println("Funcionário adicionado!");
            System.out.print("Deseja adicionar outro funcionário? (S/N)");
            index = scan.nextLine();
            if (index.equals("S")){
                index = "";
                System.out.println(index);
            }

        }
        System.out.println("Lista de funcionarios: ");
        System.out.println(funcionarios);


    }
}
