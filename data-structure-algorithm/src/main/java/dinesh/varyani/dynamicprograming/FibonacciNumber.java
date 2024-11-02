package dinesh.varyani.dynamicprograming;


import java.util.HashMap;
import java.util.Map;

//0 1 1 2 3 5 7
//fib(0) =0
//fib(1)=1
//fib(2) = 0+1 -> fib(1)+fib(0)
// which means fib(n)= fib(n-1)+fib(n-2)
public class FibonacciNumber {


    //https://www.youtube.com/watch?v=I6AJxmyQ9dA&list=PL6Zs6LgrJj3tDXv8a_elC6eT_4R5gfX4d&index=187&ab_channel=DineshVaryani
    public static int bottomUPapprovachFibonacciSeries(int n){
        int[] table = new int[n+1];
        table[0]=0;
        table[1]=1;
        for (int i = 2; i <= n; i++) {
            table[i]=table[i-1]+table[i-2];
        }
        return table[n];
    }

    public static void main(String[] args) {

        System.out.print(bottomUPapprovachFibonacciSeries(6)+" ");
    }

    private static final Map<Integer, Integer> map = new HashMap<>();
    private static int fibonacciSeries(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(map.containsKey(n-1) && map.containsKey(n-2)) return map.get(n-1) + map.get(n-2);
        int result= fibonacciSeries(n-1)+fibonacciSeries(n-2);
        map.put(n, result);
        return result;
    }
}
