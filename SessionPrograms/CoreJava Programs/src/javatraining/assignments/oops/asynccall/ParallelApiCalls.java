package javatraining.assignments.oops.asynccall;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class ParallelApiCalls {

    public static void main(String[] args) {
        List<String> apiEndpoints = Arrays.asList(
                "https://api.example.com/endpoint1",
                "https://api.example.com/endpoint2",
                "https://api.example.com/endpoint3"
                // Add more API endpoints as needed
        );

        List<CompletableFuture<String>> apiCallFutures = apiEndpoints.stream()
                .map(endpoint -> CompletableFuture.supplyAsync(() -> makeApiCall(endpoint)))
                .collect(Collectors.toList());

        CompletableFuture<Void> allOf = CompletableFuture.allOf(apiCallFutures.toArray(new CompletableFuture[0]));

        CompletableFuture<List<String>> combinedResultFuture = allOf.thenApply(
                v -> apiCallFutures.stream()
                        .map(CompletableFuture::join)
                        .collect(Collectors.toList())
        );

        List<String> combinedResults = combinedResultFuture.join();
        combinedResults.forEach(result -> System.out.println("API Result: " + result));
    }

    private static String makeApiCall(String endpoint) {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endpoint))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.noBody())
                .build();

        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            // Assuming the API returns a JSON response, you might want to parse it or process it as needed
            return "Response from " + endpoint + ": " + response.body();
        } catch (Exception e) {
            e.printStackTrace();
            return "Failed to make API call to " + endpoint;
        }
    }
}
