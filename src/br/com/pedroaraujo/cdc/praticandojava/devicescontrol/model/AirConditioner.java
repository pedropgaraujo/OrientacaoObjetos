package br.com.pedroaraujo.cdc.praticandojava.devicescontrol.model;

import br.com.pedroaraujo.cdc.praticandojava.devicescontrol.Controller;

public class AirConditioner implements Controller {

    private boolean turnedOn=false;

    public void turnOn() {
        if(turnedOn){
            System.out.println("O ar-condicionado já está ligado!");
        } else {
            turnedOn = true;
            System.out.println("Ar-condicionado ligado com sucesso.");
        }
    }

    public void turnOff() {
        if(turnedOn){
        turnedOn=false;
        System.out.println("Ar-condicionado desligada com sucesso.");
    } else {
        System.out.println("O ar-condiconado já está desligado!");
    }
    }
}
