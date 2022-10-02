package java8.concurrency;

public class ThreadLocalTest {

    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();

        new Thread(()->{
            threadLocal.set(Thread.currentThread().getName());
            System.out.println(threadLocal.get());
        }).start();

        new Thread(()->{
            threadLocal.set(Thread.currentThread().getName());
            System.out.println(threadLocal.get());
        }).start();

    }
}
