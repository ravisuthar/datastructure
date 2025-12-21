package ubs;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;

interface Task2{
    void execute();
}
class ScheduleTask2 implements Comparable<ScheduleTask2> {
    Task2 task;
    long delay;

    public ScheduleTask2(Task2 task, long delay){
        this.task=task;
        this.delay=delay;
    }

    public void run(){
        this.task.execute();
    }

    @Override
    public int compareTo(ScheduleTask2 o) {
        return Long.compare(this.delay, o.delay);
    }
}

public class SchedulerClass2 {

    private final PriorityBlockingQueue<ScheduleTask2> queue = new PriorityBlockingQueue<>();
    private final  ExecutorService service = Executors.newSingleThreadExecutor();

    public SchedulerClass2(){
        service.submit(()-> {
            try {
                loop();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public void submit(ScheduleTask2 task){
        queue.offer(task);
    }

    private void shutDown(){
        service.shutdown();
    }

    private void loop() throws InterruptedException {
        while(true){
            ScheduleTask2 take = queue.take();
            take.run();
        }
    }

    public static void main(String[] args) {
        SchedulerClass2 scheduler = new SchedulerClass2();
        scheduler.submit( new ScheduleTask2(()-> System.out.println("Hello"), 1000));
        scheduler.shutDown();
    }
}
