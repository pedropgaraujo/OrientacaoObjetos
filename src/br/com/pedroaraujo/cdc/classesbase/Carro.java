package br.com.pedroaraujo.cdc.classesbase;

//4 - Crie uma classe br.com.pedroaraujo.cdc.classesbase.Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade
// do carro.
public class Carro {
    private String modelo;
    private int ano;
    private String cor;
    private int idade;
    private double preco1, preco2, preco3;

    public void definirModelo(String modelo){
        this.modelo=modelo;
    }

    public void definirPrecos (double preco1, double preco2, double preco3){
        this.preco1=preco1;
        this.preco2=preco2;
        this.preco3=preco3;
    }

    public void exibirInfo(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Preco Ano1: " + preco1);
        System.out.println("Preco Ano2: " + preco2);
        System.out.println("Preco Ano3: " + preco3);
    }

    void exibirFichaCarro(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Idade: " + idade);
    }
    public int calcularIdade(){
        idade = 2025 - ano;
        return idade;
    }
}
