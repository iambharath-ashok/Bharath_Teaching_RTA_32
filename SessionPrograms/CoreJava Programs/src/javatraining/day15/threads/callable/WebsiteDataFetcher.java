package javatraining.day15.threads.callable;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class WebsiteDataFetcher {
    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Callable<Integer>> tasks = new ArrayList<>();
        tasks.add(new WebsiteDataReader("https://www.instagram.com"));
        tasks.add(new WebsiteDataReader("https://www.google.com"));
        tasks.add(new WebsiteDataReader("https://www.linkedin.com/"));
        tasks.add(new WebsiteDataReader("https://www.youtube.com/"));

        List<Future<Integer>> futures = executor.invokeAll(tasks);

        int totalLength = 0;
        for (Future<Integer> future : futures) {
            totalLength += future.get();
        }



        //-----------------

        System.out.println("Total length of fetched data: " + totalLength + " characters");

        executor.shutdown();
    }

    static class WebsiteDataReader implements Callable<Integer> {
        private String url;

        public WebsiteDataReader(String url) {
            this.url = url;
        }

        @Override
        public Integer call() throws Exception {
            System.out.println("Fetching data from " + url + " By Thread:: "+ Thread.currentThread().getName());
            URL website = new URL(url);
            BufferedReader reader = new BufferedReader(new InputStreamReader(website.openStream()));

            int totalLength = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                totalLength += line.length();
            }
            System.out.println("Total length:: "+ totalLength +" read by  Thread:: "+ Thread.currentThread().getName()+ " on url:: "+this.url);
            reader.close();
            return totalLength;
        }
    }
}
