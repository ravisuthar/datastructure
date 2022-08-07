package oops;

public class Permutation {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(new Permutation().permutation(-Integer.MAX_VALUE));
    }

    //1234
    //4
    //
    long permutation(int x) {
        boolean isNegative = x < 0;
        if (isNegative) {
            x = x * -1;
        }

        long result = 0;
        while (x > 0) {
            long reminder = x % 10;
            x = x / 10;
            result = result * 10 + reminder;
        }
        return isNegative ? result * 1 : result;
    }
}
