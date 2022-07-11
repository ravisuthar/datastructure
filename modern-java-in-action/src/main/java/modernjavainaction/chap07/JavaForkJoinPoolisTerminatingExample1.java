package modernjavainaction.chap07;

import java.util.concurrent.ForkJoinPool;
import static java.util.concurrent.ForkJoinTask.invokeAll;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.TimeUnit;
public class JavaForkJoinPoolisTerminatingExample1   {
    public static void main(final String[] arguments) throws InterruptedException
    {

        int proc = Runtime.getRuntime().availableProcessors();
        System.out.println("numbers of core available in your processor:"  +proc);
        int[] n = {20 , 23 , 5 ,6 ,7,8,23,12,56,1};
        ForkJoinPool Pool = new ForkJoinPool(proc);
        Testl1 t=new Testl1(n,0,n.length);
        System.out.println("   Before awaitTermination (is terminating):" +Pool.isTerminating() );
        System.out.println("  is awaitQuiescent :" + Pool.awaitQuiescence(2, TimeUnit.SECONDS) );
        Pool.awaitTermination(3, TimeUnit.SECONDS);
        System.out.println("   After awaitTermination (is terminating):" +Pool.isTerminating() );
        Integer r = Pool.invoke(t);
        System.out.println("Pool.invoke :" +r);
    }
}

class Testl1 extends RecursiveTask<Integer> {
    int st;
    int end;
    int[] arr;
    Testl1(int[] arr, int st, int end) {
        this.arr = arr;
        this.st  = st;
        this.end  = end;
    }

    protected Integer compute() {
        if(st - end <= 10) {
            int sum = 0;
            for(int i = st; i < end; ++i)
                sum += arr[i];
            return sum;
        } else {
            int mid = st + (end - st) / 2;
            Testl1 t1 = new Testl1(arr, st, mid);
            Testl1 t2 = new Testl1(arr, st, mid);
            invokeAll(t1 , t2);
            return (t1.join() + t2.join());
        }
    }
}