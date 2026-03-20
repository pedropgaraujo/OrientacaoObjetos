package br.com.pedroaraujo.cdc.classesbase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {

        String texto = "Meu email e pedropedropedro@pedro.com.pedro";
        Pattern pattern = Pattern.compile("\\w+@\\w+.\\w+.\\w+");
        Matcher matcher = pattern.matcher(texto);

        if (matcher.find()){
            System.out.println(matcher.group());
        }
        System.out.println(formatCelphone("27900087654"));
    }

    public static String formatCelphone(String celphone){
        String regex = "(\\d{2})(\\d{4,5})(\\d{4})";
        Pattern pattern1 = Pattern.compile(regex);
        Matcher matcher1 = pattern1.matcher(celphone);

        if(matcher1.matches()){
            return String.format("(%s) %s-%s", matcher1.group(1), matcher1.group(2),matcher1.group(3));
        }
        return "Numero de telefone inválido.";
    }
}
