package reactive.stream;

import java.util.List;
import java.util.stream.Collectors;

class Run implements Runnable{
    @Override
    public void run() {
        List<Integer> list= List.of(1,2,3,4,5,6,7,8,9,10,5);

        List<Integer> integer = list.stream()
                .filter(i -> {
                    System.out.println(" in filter " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return i.equals(5);
                })
                .map(i -> {
                    System.out.println(" in map " + i);
                    return i * 5;
                })
                .collect(Collectors.toList());

        System.out.println(integer);
    }
}
public class StreamTest {
    public static void main(String[] args) {

       Thread th1= new Thread(new Run());
       th1.start();

        Thread th2= new Thread(new Run());
        th2.start();

    }



}
