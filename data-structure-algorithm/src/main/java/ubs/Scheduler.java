package ubs;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;

import java.util.*;
import java.util.concurrent.*;

interface Task {
    void execute();
}

class ScheduledTask implements Comparable<ScheduledTask> {
    private final Task task;
    private final long scheduledTimeMillis;

    public ScheduledTask(Task task, long scheduledTimeMillis) {
        this.task = task;
        this.scheduledTimeMillis = scheduledTimeMillis;
    }

    public void run() { task.execute(); }
    public long getTime() { return scheduledTimeMillis; }

    // For priority queue (earliest task runs first)
    public int compareTo(ScheduledTask other) {
        return Long.compare(this.scheduledTimeMillis, other.scheduledTimeMillis);
    }
}

class Scheduler {
    private final PriorityBlockingQueue<ScheduledTask> queue = new PriorityBlockingQueue<>();
    private final ExecutorService executor = Executors.newSingleThreadExecutor();
    private volatile boolean running = true;

    public Scheduler() {
        executor.submit(() -> dispatchLoop());
    }

    public void schedule(Task task, long delayMillis) {
        queue.offer(new ScheduledTask(task, System.currentTimeMillis() + delayMillis));
    }

    public void shutdown() { running = false; executor.shutdown(); }

    private void dispatchLoop() {
        while (running) {
            try {
                ScheduledTask task = queue.take();
                long now = System.currentTimeMillis();
                if (task.getTime() > now) {
                    queue.offer(task);
                    Thread.sleep(task.getTime() - now);
                } else {
                    task.run();
                }
            } catch (InterruptedException ignored) {}
        }
    }

    public static void main(String[] args) {
        Scheduler scheduler= new Scheduler();
        scheduler.schedule(() -> System.out.println("Task 1 executed at: " + System.currentTimeMillis()), 20000);
        scheduler.shutdown();
    }
}