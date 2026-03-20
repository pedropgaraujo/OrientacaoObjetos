package br.com.pedroaraujo.cdc.praticandojava.bookedcontrol.model;

public class BookedVip extends Booked{

    @Override
    public void booked(){
        System.out.println("Reserva VIP confirmada com atendimento exclusivo.");
    }
}
