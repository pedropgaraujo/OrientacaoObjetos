package br.com.pedroaraujo.cdc.classesbase;

//5 - Crie uma classe br.com.pedroaraujo.cdc.classesbase.Aluno com atributos nome, idade, e um método para exibir informações. Crie uma instância da classe
// br.com.pedroaraujo.cdc.classesbase.Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.
public class Aluno {
    private String nome;
    int idade;
    private int notas1, notas2, notas3;

    void exibeInformacoes (){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotas1(int notas1) {
        this.notas1 = notas1;
    }

    public void setNotas2(int notas2) {
        this.notas2 = notas2;
    }

    public void setNotas3(int notas3) {
        this.notas3 = notas3;
    }

    public int getNotas1() {
        return notas1;
    }

    public int getNotas2() {
        return notas2;
    }

    public int getNotas3() {
        return notas3;
    }

    public double calcularMedia (){
        double media = (notas1 + notas2 + notas3 ) / 3;
        return media;
    }
}
