package br.com.screenmatch.principal;

import br.com.screenmatch.modelos.Titulo;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual filme você deseja pesquisar?");
        var filme = scanner.nextLine();

        String url = "https://www.omdbapi.com/?t=" + filme + "&apikey=43a88045";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        System.out.println(json);

        Gson gson = new Gson();

        Titulo meuTitulo = gson.fromJson(json, Titulo.class);
        System.out.println("Título do filme: " + meuTitulo.getNome());

        System.out.println("Ano de lançamento do filme: " + meuTitulo.getAnoDeLancamento());
    }
}

