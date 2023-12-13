package demo;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class AsyncHttpClientExample {
    public static void main(String[] args) {
        // Create an HttpClient
        HttpClient httpClient = HttpClient.newHttpClient();

        // Create an HttpRequest
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8080"))
                .GET()
                .build();

        // Send the request asynchronously and receive the response
        CompletableFuture<HttpResponse<String>> responseFuture =
                httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString());

        // Perform additional operations asynchronously when the response is complete
        responseFuture.thenApplyAsync(response -> {
            // Print the response status code and body
            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Response Body: " + response.body());

            // Perform more operations asynchronously if needed

            return response; // Return the response for further processing if necessary
        }).exceptionally(ex -> {
            // Handle exceptions that may occur during the asynchronous processing
            System.err.println("Error: " + ex.getMessage());
            return null; // or handle the error in a different way
        });

        // Continue with other operations while waiting for the asynchronous request to complete
        System.out.println("Main thread continues...");

        // Sleep for a while to allow the asynchronous request to complete
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
