package dinesh.varyani.math;

public class SumOfNaturalNumber {

    public static void main(String[] args) {

        var now = System.currentTimeMillis();
        long result = sum(Integer.MAX_VALUE);
        System.out.println(result);
        System.out.println("Time Taken: " + ((System.currentTimeMillis()) - now));

    }

    private static long sum(int n) {
        return ((long) n * (n + 1)) / 2;
    }

    private static long sumIterate(int n) {
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }

}
