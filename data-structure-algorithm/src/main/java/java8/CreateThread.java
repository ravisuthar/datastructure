package java8;

class MyThread extends  Thread{
    public void run(){
        System.out.println("myThread");
    }
}

class MyRunnableThread implements  Runnable{

    @Override
    public void run() {
        System.out.println("MyRunnableThread");
    }
}
public class CreateThread {
    public static void main(String[] args) {
        Thread th= new MyThread();
        th.start();

        Thread th2= new Thread(new MyRunnableThread());
        th2.start();

        Thread th3 = new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("Annonymous Thread");
            }
        });
        th3.start();


        Thread th4= new Thread(()-> System.out.println("Lambda Thread"));
        th4.start();
    }
}
