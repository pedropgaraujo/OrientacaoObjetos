package br.com.pedroaraujo.cdc.praticandojava.sendingmessages;

public class Main {
    public static void main(String[] args) {
        Notificator notification = new Notificator();

        notification.sendMessage("Olá!");
        notification.sendMessage("João", "Bom dia!");
        notification.sendMessage("Maria", "Atenção!", 2);
    }
}
