package br.com.pedroaraujo.cdc.desafios.atv03;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // 1 - Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista.
        ArrayList<String> listaString = new ArrayList<>();
        listaString.add("Java");
        listaString.add("C++");
        listaString.add("Python");

        for (String elemento : listaString) {
            System.out.println(elemento);
        }
// 2 - Crie uma classe br.com.pedroaraujo.cdc.classesbase.Animal e uma classe br.com.pedroaraujo.cdc.classesbase.Cachorro que herda de br.com.pedroaraujo.cdc.classesbase.Animal. Em seguida, crie um objeto da classe br.com.pedroaraujo.cdc.classesbase.Cachorro e faça o casting para a classe br.com.pedroaraujo.cdc.classesbase.Animal
        //br.com.pedroaraujo.cdc.classesbase.Cachorro cachorro = new br.com.pedroaraujo.cdc.classesbase.Cachorro();
        //br.com.pedroaraujo.cdc.classesbase.Animal animal = (br.com.pedroaraujo.cdc.classesbase.Animal) cachorro;

        Animal animal = new Cachorro();
// 3 - Modifique o Exercício 2 para incluir uma verificação usando instanceof para garantir que o objeto seja do tipo correto antes de fazer o casting.

        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            // Agora você pode usar o objeto 'cachorro' como um br.com.pedroaraujo.cdc.classesbase.Cachorro.
        } else {
            System.out.println("O objeto não é um br.com.pedroaraujo.cdc.classesbase.Cachorro.");
        }
//4 - Crie uma classe Produto com propriedades como nome e preço. Em seguida, crie uma lista de produtos e utilize um loop para calcular e imprimir o preço médio dos produtos.
        Produto produto1 = new Produto("Ar condicionado", 2000.0);
        Produto produto2 = new Produto("Aquecedor", 800.0);
        Produto produto3 = new Produto("Ventilador", 150.0);

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        double somaPrecos = 0;
        for (Produto produto : listaProdutos) {
            somaPrecos += produto.getPreco();
        }

        double precoMedio = somaPrecos / listaProdutos.size();
        System.out.println("Preço médio dos produtos: " + precoMedio);
// 5 - Crie uma interface Forma com um méto do calcularArea(). Implemente a interface em duas classes, por exemplo, Circulo e Quadrado. Em seguida, crie uma lista de formas (objetos da interface Forma) e utilize um loop para calcular e imprimir a área de cada forma.
        Circulo circulo = new Circulo();
        circulo.raio = 5;

        Quadrado quadrado = new Quadrado();
        quadrado.lado = 4;

        // Lista de formas
        ArrayList<Forma> listaFormas = new ArrayList<>();
        listaFormas.add(circulo);
        listaFormas.add(quadrado);

        // Calcular e imprimir a área de cada forma
        for (Forma forma : listaFormas) {
            System.out.println("Área: " + forma.calcularArea());
        }
// 6 - Crie uma classe br.com.pedroaraujo.cdc.classesbase.ContaBancaria com propriedades como número da conta e saldo. Em seguida, crie uma lista de contas bancárias com diferentes saldos. Utilize um loop para encontrar e imprimir a conta com o maior saldo.

        ContaBancaria conta1 = new ContaBancaria(101, 1500.0);
        ContaBancaria conta2 = new ContaBancaria(102, 2500.0);
        ContaBancaria conta3 = new ContaBancaria(103, 1800.0);

        ArrayList<ContaBancaria> listaContas = new ArrayList<>();
        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);

        ContaBancaria contaMaiorSaldo = listaContas.get(0);
        for (ContaBancaria conta : listaContas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }

        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumeroConta() +
                ", Saldo: " + contaMaiorSaldo.getSaldo());
    }
}

