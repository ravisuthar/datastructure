package java8.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTest {

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(10);

        for(int i=0; i<10;i++){
            service.execute(()-> System.out.println("Task 1 "+Thread.currentThread().getName()));
            service.execute(()-> System.out.println("Task 2 "+Thread.currentThread().getName()));
            service.execute(()-> System.out.println("Task 3 "+Thread.currentThread().getName()));
        }

        service.shutdown();
    }


}
