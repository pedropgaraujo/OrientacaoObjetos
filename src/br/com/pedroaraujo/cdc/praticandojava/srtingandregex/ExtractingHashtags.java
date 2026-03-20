package br.com.pedroaraujo.cdc.praticandojava.srtingandregex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractingHashtags {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma legenda de foto com #'s: ");
        String text = scan.nextLine();

        Pattern pattern = Pattern.compile("#\\w+");
        Matcher matcher = pattern.matcher(text);

        ArrayList<String> hashtags = new ArrayList<>();

        while (matcher.find()) {
            hashtags.add(matcher.group());
        }

        if (hashtags.isEmpty()) {
            System.out.println("Nenhuma hashtag encontrada.");
        } else {
            System.out.println("Hashtags encontradas:\n" + String.join("\n", hashtags));
        }
        scan.close();
    }
}
