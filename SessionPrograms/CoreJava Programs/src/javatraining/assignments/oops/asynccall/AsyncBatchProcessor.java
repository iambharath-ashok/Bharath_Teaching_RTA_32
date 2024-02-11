package javatraining.assignments.oops.asynccall;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class AsyncBatchProcessor {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Sample list with 100 values
        List<String> stringList = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            stringList.add("Value " + i);
        }

        // Batch size
        int batchSize = 10;

        // Process batches asynchronously
        List<CompletableFuture<String>> futures = new ArrayList<>();

        for (int i = 0; i < stringList.size(); i += batchSize) {
            List<String> batch = getBatch(stringList, i, batchSize);
            CompletableFuture<String> future = processBatchAsync(batch);
            futures.add(future);
        }

        // Combine results of all CompletableFuture
        CompletableFuture<Void> allOf = CompletableFuture.allOf(
                futures.toArray(new CompletableFuture[0])
        );

        // Wait for all CompletableFuture to complete
        allOf.get();

        // Extract results from CompletableFuture
        List<String> results = futures.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());

        // Print the results
        for (int i = 0; i < results.size(); i++) {
            System.out.println("Batch " + (i + 1) + ": " + results.get(i));
        }
    }

    private static CompletableFuture<String> processBatchAsync(List<String> batch) {
        // Simulate an asynchronous operation, such as making a remote REST API call
        return CompletableFuture.supplyAsync(() -> {
            // Simulate a single API call for the entire batch
            String apiEndpoint = "https://jsonplaceholder.typicode.com/posts";
            HttpClient httpClient = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(apiEndpoint))
                    .POST(HttpRequest.BodyPublishers.ofString(batch.toString()))
                    .header("Content-Type", "application/json")
                    .build();

            try {
                HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
                return "API Response for Batch " + batch + ": " + response.body();
            } catch (Exception e) {
                return "Error during API call for Batch " + batch;
            }
        });
    }

    private static List<String> getBatch(List<String> list, int start, int batchSize) {
        int end = Math.min(start + batchSize, list.size());
        return list.subList(start, end);
    }
}
