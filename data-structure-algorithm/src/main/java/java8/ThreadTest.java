package java8;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest {
    public static void main(String[] args) {


        ExecutorService ex = Executors.newFixedThreadPool(2);

        ex.execute(()-> System.out.println("one"));
        ex.execute(()-> System.out.println("two"));
        ex.execute(()-> System.out.println("three"));
        ex.execute(()-> System.out.println("four"));
        ex.execute(()-> System.out.println("five"));

        ex.shutdown();

    }
}

