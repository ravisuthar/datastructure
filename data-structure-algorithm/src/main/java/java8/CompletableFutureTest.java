package java8;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

/**
 * CompletableFuture and the ForkJoinPool framework in Java power asynchronous and parallel execution.
 * CompletableFuture simplifies working with concurrent tasks without explicitly managing threads,
 * and uses the ForkJoinPool.commonPool() by default for non-blocking execution.
 */
public class CompletableFutureTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        example3();
    }


    private static void example1() throws ExecutionException, InterruptedException {
        System.out.println("Main Thread: " + Thread.currentThread().getName());

        CompletableFuture<Void> cf = CompletableFuture.runAsync(() -> {
            System.out.println("Running async task in: " + Thread.currentThread().getName());
        });

        cf.get(); // blocks until completion
        System.out.println("Task completed!");
    }

    private static void example2()  throws ExecutionException, InterruptedException{
            CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 10);
            CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 20);

            CompletableFuture<Integer> combined = future1.thenCombine(future2, Integer::sum);

            System.out.println("Combined Result: " + combined.get());

    }

    public static void example3() throws ExecutionException, InterruptedException{
        ForkJoinPool pool = new ForkJoinPool(4);

        CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> {
            System.out.println("Running in: " + Thread.currentThread().getName());
            return "Task Done!";
        }, pool);

        System.out.println(cf.get());
        pool.shutdown();

    }

}
