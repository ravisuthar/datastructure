package java8;

import java.util.concurrent.*;

public class SingleThread {
    public static void main(String[] args) {

        ExecutorService ex = Executors.newSingleThreadExecutor();

        try {
            Future<Integer> one= ex.submit(() -> {System.out.println("1"); return 1;});
            System.out.println(one.get());
            ex.execute(() -> System.out.println("2"));
            ex.shutdownNow();
            ex.execute(() -> System.out.println("3"));
            ex.execute(() -> System.out.println("4"));
            ex.execute(() -> System.out.println("5"));
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {

        }
    }
}
