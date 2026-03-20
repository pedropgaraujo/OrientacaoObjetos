package br.com.pedroaraujo.cdc.praticandojava.notificationsystem;

import br.com.pedroaraujo.cdc.praticandojava.notificationsystem.model.Email;
import br.com.pedroaraujo.cdc.praticandojava.notificationsystem.model.Notification;
import br.com.pedroaraujo.cdc.praticandojava.notificationsystem.model.Push;
import br.com.pedroaraujo.cdc.praticandojava.notificationsystem.model.SMS;

public class Main {
    public static void main(String[] args) {
        Notification email = new Email(
                "teste@gmail.com",
                "Esta é uma mensagem teste de email",
                "Assunto aleatório"
        );
        Notification sms =  new SMS(
                "27 99987-9064",
                "Mensagem teste aleatória de SMS"
        );
        Notification push = new Push(
                "user_7865",
                "Mensagem aleatória de notificação de push",
                "Titulo do push"
        );

        email.send();
        sms.send();
        push.send();
    }
}
