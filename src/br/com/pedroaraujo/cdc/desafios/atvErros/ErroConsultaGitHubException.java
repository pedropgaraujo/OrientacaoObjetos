package br.com.pedroaraujo.cdc.desafios.atvErros;

public class ErroConsultaGitHubException extends RuntimeException {

    public ErroConsultaGitHubException(String mensagem) {
        super(mensagem);
    }
}