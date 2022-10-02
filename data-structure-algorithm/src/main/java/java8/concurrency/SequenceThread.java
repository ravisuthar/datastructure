package java8.concurrency;


class Task1 implements Runnable{
    @Override
    public void run() {
        System.out.println("running task 1 by thread:"+Thread.currentThread().getName());
    }
}

class Task2 implements Runnable{
    @Override
    public void run() {
        System.out.println("running task 2 by thread:"+Thread.currentThread().getName());
    }
}

class Task3 implements Runnable{
    @Override
    public void run() {
        System.out.println("running task 3 by thread:"+Thread.currentThread().getName());
    }
}

class Task4 implements Runnable{
    @Override
    public void run() {
        System.out.println("running task 4 by thread:"+Thread.currentThread().getName());
    }
}
public class SequenceThread {
    public static void main(String[] args) throws InterruptedException {


        Thread thread1 = new Thread(new Task1());
        Thread thread2 = new Thread(new Task2());
        Thread thread3 = new Thread(new Task3());
        Thread thread4 = new Thread(new Task4());

        thread1.start();
        thread1.join();

        thread2.start();
        thread2.join();

        thread3.start();
        thread3.join();

        thread4.start();
        thread4.join();


    }
}
