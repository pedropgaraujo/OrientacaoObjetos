package br.com.pedroaraujo.cdc.praticandojava.notificationsystem.model;

public class Push extends Notification{

   private String title;


    public Push(String to, String message, String title) {
        super(to, message);
        this.title = title;
    }

    @Override
    public void send() {
        System.out.printf("\nEnviando Push para: %s\nTítulo: %s\nConteúdo: %s\n", to, title, message);
    }
}
