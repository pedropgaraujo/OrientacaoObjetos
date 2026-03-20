package br.com.pedroaraujo.cdc.praticandojava.devicescontrol;

import br.com.pedroaraujo.cdc.praticandojava.devicescontrol.model.AirConditioner;
import br.com.pedroaraujo.cdc.praticandojava.devicescontrol.model.Light;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        AirConditioner air = new AirConditioner();

        light.turnOn();
        light.turnOn();
        light.turnOff();

        air.turnOff();
    }
}
