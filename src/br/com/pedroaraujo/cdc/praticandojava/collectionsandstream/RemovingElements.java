package br.com.pedroaraujo.cdc.praticandojava.collectionsandstream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemovingElements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> estudantes = new ArrayList<>();
        String index = "";

        while(index.isEmpty()) {
            System.out.println("Digite a lista de estudantes:");
            estudantes.add(scan.nextLine());
            System.out.println("Estudante adicionado!");
            System.out.print("Deseja adicionar outro estudante? (S/N)");
            index = scan.nextLine();
            if (index.equals("S")){
                index = "";
                System.out.println(index);
            }

        }
        System.out.println("Lista de estudantes: ");
        System.out.println(estudantes);
        System.out.println("Deseja remover alguem da lista?");
        index = scan.nextLine();;
        if (index.equals("S")){
            System.out.println("Digite quem gostaria de remover: ");
            estudantes.remove(scan.nextLine());
            System.out.println("Estudante removido!");
            System.out.println(estudantes);
        }
    }
}
