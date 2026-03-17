package br.com.pedroaraujo.cdc.desafios.atvErros;

public class SenhaInvalidaException extends RuntimeException {
    private  String mensagem;

    public SenhaInvalidaException(String message) {
        this.mensagem = message;
    }

    @Override
    public String getMessage(){
        return this.mensagem;
    }
}
