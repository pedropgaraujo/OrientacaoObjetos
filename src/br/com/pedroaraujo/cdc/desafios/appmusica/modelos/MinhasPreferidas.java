package br.com.pedroaraujo.cdc.desafios.appmusica.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao()>= 8){
            System.out.println(audio.getTitulo() + " e considerado muito bom.");
        } else {
            System.out.println(audio.getTitulo() + " e bomzinho ate.");
        }
    }
}
