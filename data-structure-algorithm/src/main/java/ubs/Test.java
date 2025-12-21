package ubs;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;


public class Test {

    private double calculatePrice(String product){
        delay();
        return new Random().nextDouble() * product.charAt(0) + product.charAt(1);
    }

    public Future<Double> getPrice(String product){
        CompletableFuture<Double> future = new CompletableFuture<>();
        new Thread( () -> {
            double d = calculatePrice(product);
            future.complete(d);
        }).start();
        return future;

    }

    private static void delay(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Test t = new Test();
        Future<Double> hello = t.getPrice("hello");
        System.out.println(hello.get());


        CompletableFuture<String> f1 = CompletableFuture.supplyAsync( ()-> "hello");
        CompletableFuture<String> f2= CompletableFuture.supplyAsync( ()-> " World");

        Object o = f1.thenCombine(f2, (s1,s2) -> s1+s2).get();
        System.out.println(o);


    }

}
