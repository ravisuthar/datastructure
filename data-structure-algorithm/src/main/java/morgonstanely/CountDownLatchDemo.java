package morgonstanely;

import java.util.concurrent.CountDownLatch;

//https://www.geeksforgeeks.org/countdownlatch-in-java/
public class CountDownLatchDemo {

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch latch  = new CountDownLatch(4);

        Worker th1=  new Worker(1000, "one", latch);
        th1.start();

        Worker th2=  new Worker(2000,"two", latch);
        th2.start();


        Worker th3=  new Worker(2000,"three", latch);
        th3.start();

        Worker th4=  new Worker(2000,"four", latch);
        th4.start();

        latch.await();
        System.out.println("main finished");
    }


}

class Worker extends  Thread {
   private int delay;
    private String name;
    private CountDownLatch latch;

    public Worker(int delay, String name, CountDownLatch latch) {
        this.delay=delay;
        this.name = name;
        this.latch = latch;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(this.delay);
            this.latch.countDown();
            System.out.println(this.name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}