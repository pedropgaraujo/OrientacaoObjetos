package br.com.pedroaraujo.cdc.praticandojava.sendingmessages;

public class Notificator {
    public void sendMessage(String message) {
        System.out.println("Mensagem enviada para todos: " + message);
    }

    public void sendMessage(String name, String message) {
        System.out.println("Mensagem para " + name + ": " + message);
    }

    public void sendMessage(String name, String message, int quantity) {
        for (int i = 0; i < quantity; i++) {
            System.out.println("Mensagem para " + name + ": " + message);
        }
    }
}