package br.com.alura.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBuscas {
    public static void main(String[] args) throws IOException, InterruptedException {
        try (Scanner leitura = new Scanner(System.in)) {
            System.out.println("Digite um filme para busca: ");
            var busca = leitura.nextLine();

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.omdbapi.com/?t=" + busca + "&apikey=c03ec587"))
                .build();

            HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println(response.body());
        }
    }
}
