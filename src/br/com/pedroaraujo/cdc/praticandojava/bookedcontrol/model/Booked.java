package br.com.pedroaraujo.cdc.praticandojava.bookedcontrol.model;

import java.util.Date;

public class Booked {

    public void booked(){
        System.out.println("Reserva realizada!");
    }

    public void booked(String date){
        System.out.println("Reserva feita para o dia "+ date);
    }

    public void booked (String date, int quantity){
        System.out.println("Reserva feita para o dia " + date + " para " + quantity + " pessoas.");
    }
}
