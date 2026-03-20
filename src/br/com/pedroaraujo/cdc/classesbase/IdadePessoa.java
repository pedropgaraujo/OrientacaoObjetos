package br.com.pedroaraujo.cdc.classesbase;/*
    2 - Crie uma classe br.com.pedroaraujo.cdc.classesbase.IdadePessoa com os atributos privados nome e idade. Utilize métodos getters
    e setters para acessar e modificar esses atributos. Adicione um méto_do verificarIdade que imprime
    se a pessoa é maior de idade ou não.
 */

public class IdadePessoa {
    private String nome;
    private int idade;

    public String verificarIdade(){
        String mensagem;
        if (idade >= 18){
            mensagem = "Maior de Idade";

        } else {
            mensagem = "Menor de Idade";
        }
        return mensagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
