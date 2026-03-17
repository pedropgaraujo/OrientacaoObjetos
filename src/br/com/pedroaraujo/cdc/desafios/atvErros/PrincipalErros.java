package br.com.pedroaraujo.cdc.desafios.atvErros;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalErros {
    public static void main(String[] args) {
        //1- Crie um programa simples que solicita dois números ao usuário e realiza a divisão do primeiro pelo segundo.
        // Utilize o bloco try/catch para tratar a exceção que pode ocorrer caso o usuário informe 0 como divisor.
        int num1, num2, res;
        Scanner scan = new Scanner(System.in);

        System.out.println("Vamos fazer a divisão de dois números:");
        System.out.println("Digite o primeiro número: ");
        num1 = scan.nextInt();
        System.out.println("Digite o segundo número:");
        num2 = scan.nextInt();

        try{
            res = num1 / num2;
            System.out.println("O primeiro número dividido pelo segundo número é igual a: " + res);
        } catch (ArithmeticException e){
            System.out.println(num1 + " não pode ser dividido por " + num2);
        }

        //2- Crie um programa que lê uma senha do usuário. Utilize o bloco try/catch para capturar a exceção
        //SenhaInvalidaException, uma classe de exceção personalizada que deve ser lançada caso a senha não atenda a
        //critérios específicos (por exemplo, ter pelo menos 8 caracteres).

        String senhaDigitada;
        System.out.println("Digite uma senha ");
        System.out.println("Ela deve conter no mínimo 8 caracteres: ");
        scan.nextLine();
        senhaDigitada= scan.nextLine();

        try{
            validarSenha(senhaDigitada);
            System.out.println("Sua senha esta dentro dos parametros.");

        } catch (SenhaInvalidaException e){
            System.out.println(e.getMessage());
        }

        //3- Desenvolva um programa em Java que permite aos usuários consultar informações sobre um usuário do GitHub
        //(utilize a API pública do GitHub para obter os dados). Crie uma classe de exceção personalizada,
        //ErroConsultaGitHubException, que estende RuntimeException. Lance essa exceção quando o nome de usuário não for
        //encontrado. No bloco catch, trate de forma específica essa exceção, exibindo uma mensagem amigável.


        System.out.println("Digite o nome de usuário do GitHub para consultar informações: ");
        String username = scan.nextLine();
        String endereco = "https://api.github.com/users/" + username;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .header("Accept", "application/vnd.github.v3+json")
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("Usuário não encontrado no GitHub.");
            }

            String json = response.body();
            System.out.println(json);
        } catch (IOException | InterruptedException e) {
            System.out.println("Opss… Houve um erro durante a consulta à API do GitHub.");
            e.printStackTrace();
        } catch (ErroConsultaGitHubException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void validarSenha(String senha){
        if (senha.length() < 8) {
            throw new SenhaInvalidaException("A senha deve conter pelo menos 8 caracteres.");
        }
    }
}
