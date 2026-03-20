package br.com.pedroaraujo.cdc.praticandojava.notificationsystem.model;

public class Email extends Notification{

    protected String subject;

    public Email(String to, String message, String subject) {
        super(to, message);
        this.subject = subject;

    }
    @Override
    public void send() {
        System.out.printf("\nEnviando Email para: %s\nAssunto: %s\nCorpo: %s\n", to, subject, message);
    }
}
