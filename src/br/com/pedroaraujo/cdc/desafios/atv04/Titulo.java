package br.com.pedroaraujo.cdc.desafios.atv04;

public class Titulo implements Comparable<Titulo>{

    private String nome;
    private int anoLancamento;

    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int idade) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return nome + "(" + anoLancamento +
                ')';
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
