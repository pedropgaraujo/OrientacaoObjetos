package br.com.pedroaraujo.cdc.praticandojava.notificationsystem.model;

public class Notification {

    protected String to;
    protected String message;

    public Notification(String to, String message) {
        this.to = to;
        this.message = message;
    }

    public void send() {}
}
