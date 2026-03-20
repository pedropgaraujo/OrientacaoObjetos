package br.com.pedroaraujo.cdc.classesbase;

//3 - Crie uma classe br.com.pedroaraujo.cdc.classesbase.Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para
// exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
public class Musica {
    private String titulo;
    private String artista;
    int anoLancamento;
    double somaAvaliacoes;
    int numAvaliacoes;
    double mediaAvaliacao;

    void exibirFichaTecnica(){
        System.out.println("Nome: " + titulo);
        System.out.println("Cantor: " + artista);
        System.out.println("Lancamento:" + anoLancamento);
        System.out.println("Avaliacao: " + mediaAvaliacao);
        System.out.println("Total de Avaliacoes: " + numAvaliacoes);
    }

    double avaliarMusica(double avaliacao){
        somaAvaliacoes += avaliacao;
        numAvaliacoes++;
        return avaliacao;
    }

    double calcularMediaAvaliacoes (){
        mediaAvaliacao = somaAvaliacoes / numAvaliacoes;
        return mediaAvaliacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void exibirDetalhes(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Artista: " + this.artista);
    }
}
