package br.com.pedroaraujo.cdc.praticandojava.devicescontrol.model;

import br.com.pedroaraujo.cdc.praticandojava.devicescontrol.Controller;

public class Light implements Controller {

    private boolean turnedOn=false;

    public void turnOn() {
        if(turnedOn){
            System.out.println("A luz já está ligada!");
        } else {
            turnedOn = true;
            System.out.println("Luz ligada com sucesso.");
        }
    }

    public void turnOff() {
        if(turnedOn){
            turnedOn=false;
            System.out.println("Luz desligada com sucesso.");
        } else {
            System.out.println("A luz já está desligada!");
        }
    }
}
