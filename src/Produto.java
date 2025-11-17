/*
Desenvolva uma classe Produto com os atributos privados nome e preco.
Utilize métodos getters e setters para acessar e modificar esses atributos.
Adicione um méto_do aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
 */

public class Produto implements Vendavel{
    private String nome;
    private double preco;
    private double precoUnitarrio;

    public double getPrecoUnitarrio() {
        return precoUnitarrio;
    }

    public void setPrecoUnitarrio(double precoUnitarrio) {
        this.precoUnitarrio = precoUnitarrio;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoUnitarrio*quantidade;
    }

    public void aplicarDesconto(double percentualDesconto){
        precoUnitarrio -= precoUnitarrio*(percentualDesconto/100.0);
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
