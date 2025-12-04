package br.com.pedroaraujo.cdc.desafios.atv02;

public class ProdutoPerecivel extends Produto {
    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, String dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }
    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + getNome() + '\'' +
                ", preco=" + getPreco() +
                ", quantidade=" + getQuantidade() +
                ", dataValidade='" + dataValidade + '\'' +
                '}';
    }
}
