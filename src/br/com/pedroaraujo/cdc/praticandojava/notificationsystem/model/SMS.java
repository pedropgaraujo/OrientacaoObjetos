package br.com.pedroaraujo.cdc.praticandojava.notificationsystem.model;

public class SMS extends Notification{


    public SMS(String to, String message) {
        super(to, message);
    }

    @Override
    public void send() {
        System.out.printf("\nEnviando SMS para: %s\nMensagem: %s\n", to, message);
    }
}
