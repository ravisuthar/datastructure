package morgonstanely;

public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {

        Thread th1 =new Task("1");
        Thread th2 =new Task("2");
        Thread th3 =new Task("3");
        Thread th4 =new Task("4");

        th1.start();
        th2.start();
        th3.start();
        th4.start();


        th1.join();
        th2.join();
        th3.join();
        th4.join();

    }
}

class Task extends Thread {
    String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name);
    }
}