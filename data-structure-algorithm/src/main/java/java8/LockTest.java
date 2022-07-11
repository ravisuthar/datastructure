package java8;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    public static void main(String[] args) throws InterruptedException{
        Lock lock = new ReentrantLock();
        new Thread(() -> printHello(lock)).start();
        new Thread(() -> {
            try {
                second(lock);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    private static void second(Lock lock) throws InterruptedException {
        if (lock.tryLock(1, TimeUnit.SECONDS)) {
            try {
                System.out.println("Lock obtained, entering protected code");
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("Unable to acquire lock, doing something else");
        }
    }
    private static void printHello(Lock lock) {
        try {
            lock.lock();
            System.out.println("main lock");
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
