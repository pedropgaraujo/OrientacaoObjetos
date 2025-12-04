package br.com.pedroaraujo.cdc.desafios.appmusica.principal;

import br.com.pedroaraujo.cdc.desafios.appmusica.modelos.MinhasPreferidas;
import br.com.pedroaraujo.cdc.desafios.appmusica.modelos.Musica;
import br.com.pedroaraujo.cdc.desafios.appmusica.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("Sweet Child O Mine");
        musica.setCantor("Guns N Roses");

        for (int i = 0; i < 1000; i++) {
            musica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            musica.curte();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("Milkshake Wanda");
        podcast.setApresentador("Nao lembro");

        for (int i = 0; i < 3200; i++) {
            podcast.reproduz();
        }
        for (int i = 0; i < 500; i++) {
            podcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podcast);
        preferidas.inclui(musica);
    }
}
