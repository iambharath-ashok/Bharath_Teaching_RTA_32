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

public class AsyncBatchProcessorOld {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Sample list with 100 values
        List<String> stringList = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            stringList.add("Value " + i);
        }

        // Batch size
        int batchSize = 10;

        // Process batches asynchronously
        List<CompletableFuture<List<String>>> futures = new ArrayList<>();

        for (int i = 0; i < stringList.size(); i += batchSize) {
            List<String> batch = getBatch(stringList, i, batchSize);
            CompletableFuture<List<String>> future = processBatchAsync(batch);
            futures.add(future);
        }

        // Combine results of all CompletableFuture
        CompletableFuture<Void> allOf = CompletableFuture.allOf(
                futures.toArray(new CompletableFuture[0])
        );

        // Wait for all CompletableFuture to complete
        allOf.get();

        // Extract results from CompletableFuture
        List<List<String>> results = futures.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());

        // Print the results
        for (int i = 0; i < results.size(); i++) {
            System.out.println("Batch " + (i + 1) + ": " + results.get(i));
        }
    }

    private static CompletableFuture<List<String>> processBatchAsync(List<String> batch) {
        // Simulate an asynchronous operation, such as making a remote REST API call
        return CompletableFuture.supplyAsync(() -> {
            List<String> processedBatch = new ArrayList<>();
            for (String value : batch) {
                // Simulate a remote REST API call using a simple HTTP request
                String result = makeRestApiCall(value);
                processedBatch.add(result);
            }
            return processedBatch;
        });
    }

    private static List<String> getBatch(List<String> list, int start, int batchSize) {
        int end = Math.min(start + batchSize, list.size());
        return list.subList(start, end);
    }

    private static String makeRestApiCall(String value) {
        // Simulate a simple HTTP GET request to a remote REST API
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
                .GET()
                .build();

        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            return value + " - API Response: " + response.body();
        } catch (Exception e) {
            return value + " - Error during API call";
        }
    }
}
