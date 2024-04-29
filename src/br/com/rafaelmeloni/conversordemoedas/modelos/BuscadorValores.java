package br.com.rafaelmeloni.conversordemoedas.modelos;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscadorValores {

    public ValorMoedasAtualizado buscaValores(String moeda1 , String moeda2, double valorAConverter ){


        URI valor = URI.create("https://v6.exchangerate-api.com/v6/e6e1f4c2450a351458c84251/pair/"+moeda1+"/"+moeda2+"/"+valorAConverter);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(valor)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(),ValorMoedasAtualizado.class);


        } catch (IOException |InterruptedException e) {
            throw new RuntimeException("Moeda não encontrada");

        }
    }
}
