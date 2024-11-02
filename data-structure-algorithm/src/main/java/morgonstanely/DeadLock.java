package morgonstanely;

//command line
//jps -l -m
// will display all process id
//jstack id
//display dead lock
public class DeadLock {
    public static void main(String[] args) {

        String object1 = "Task-1";
        String object2 = "Task-2";

      new Thread() {
            @Override
            public void run() {
                synchronized (object1) {

                    try {
                        System.out.println(Thread.currentThread().getName() + " acquired object1 lock");
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (object2) {
                        System.out.println(Thread.currentThread().getName() + " acquired object2 lock");
                    }

                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {

                synchronized (object2) {

                    try {
                        System.out.println(Thread.currentThread().getName() + " acquired object2 lock");
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (object1) {
                        System.out.println(Thread.currentThread().getName() + " acquired object1 lock");
                    }

                }
            }
        }.start();


    }
}
