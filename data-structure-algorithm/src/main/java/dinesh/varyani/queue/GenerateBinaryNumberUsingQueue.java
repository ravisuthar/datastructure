package dinesh.varyani.queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//n=3 then {"1", "10" "11"}  means 1 2 3
//n=5 then {1 10 11 101 111} in binary means 1 2 3 4 5 in decimal
public class GenerateBinaryNumberUsingQueue {

    public String[] generate(int n){
        String[] result = new String[n];
        Queue<String> queue= new Queue<>();
        queue.enqueue("1");
        for (int i = 0; i < n; i++) {
            result[i]= queue.dequeue();
            queue.enqueue(result[i]+"0");
            queue.enqueue(result[i]+"1");
        }
        return result;
    }

    public List<String> generate1(int n){
        List<String> result = new ArrayList<>();

        Queue<String> queue = new Queue<>();
        queue.enqueue("1");
        for (int i = 0; i < n; i++) {
            String value = queue.dequeue();
            result.add(value);
            queue.enqueue(value+"0");
            queue.enqueue(value+"1");
        }

        return result;
    }

    public static void main(String[] args) {
        GenerateBinaryNumberUsingQueue ex= new GenerateBinaryNumberUsingQueue();
        System.out.println(Arrays.toString(ex.generate(3)));
        System.out.println(ex.generate1(10));
    }
}
