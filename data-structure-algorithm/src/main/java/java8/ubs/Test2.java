package java8.ubs;



import org.apache.commons.math3.util.Pair;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class Test2 {

    // Stub for the async REST call (replace with actual HTTP call)
    CompletableFuture<Double> getPrice(Product product) {
        return CompletableFuture.supplyAsync(() -> {
            // Simulate REST call latency and result
            try { Thread.sleep(100); } catch (Exception ignored) {}
            return Math.random() * 100; // Random price
        });
    }

    public void fetchAndPrintPrices(List<Product> products) {
        List<CompletableFuture<Pair<Product, Double>>> futures = products.stream()
                .map(product -> getPrice(product).thenApply(price -> new Pair<>(product, price)))
                .collect(Collectors.toList());

        // Combine all futures
        CompletableFuture<Void> allDone = CompletableFuture
                .allOf(futures.toArray(new CompletableFuture[0]));

        // When all prices are available, print them
        allDone.thenRun(() -> {
            futures.forEach(cf -> {
                Pair<Product, Double> pair = cf.join(); // Safe to call .join after allOf is done
                System.out.println("Product: " + pair.getKey().getName() + ", Price: " + pair.getValue());
            });
        });
    }

}

// Sample Product class
class Product {
    String name;
    public Product(String name) { this.name = name; }
    public String getName() { return name; }
}
