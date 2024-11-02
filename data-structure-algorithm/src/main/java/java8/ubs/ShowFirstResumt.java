package java8.ubs;

import java.util.concurrent.*;

public class ShowFirstResumt {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Create a thread pool with 2 threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Create a completion service that wraps the thread pool
        CompletionService<Boolean> service = new ExecutorCompletionService<>(executor);

        // Create 2 tasks and submit them to the completion service
        Callable<Boolean> task1 = () -> {
            // Do some work here
            // Return true or false
            Thread.sleep(3000);
            return true;
        };
        Callable<Boolean> task2 = () -> {
            // Do some work here
            // Return true or false
            Thread.sleep(2000);
            return true;
        };
        Callable<Boolean> task3 = () -> {
            // Do some work here
            // Return true or false
            Thread.sleep(1000);
            return true;
        };
        Callable<Boolean> task4 = () -> {
            // Do some work here
            // Return true or false
            Thread.sleep(1000);
            return false;
        };
        Future<Boolean> future1 = executor.submit(task1);
        Future<Boolean> future2 = executor.submit(task2);
        Future<Boolean> future3 = executor.submit(task3);
        Future<Boolean> future4 = executor.submit(task4);

        // Check the result of the tasks
        if (!future1.get() || !future2.get() || !future3.get() || !future4.get()) {
            // If any task returned false, print the result
            System.out.println("Result: false");
        } else {
            // If all tasks returned true, print the result
            System.out.println("Result: true");
        }

        // Shut down the thread pool
        executor.shutdown();
    }

}
