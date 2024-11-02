package leetcode.must.doo;

//https://leetcode.com/problems/sum-of-two-integers/
public class LeetCode0371 {

    public static void main(String[] args) {
        System.out.println(new LeetCode0371().getSum(9,11));
        System.out.println(new LeetCode0371().getSum(2,3));
    }


    public int getSum(int a, int b) {

        while (b != 0) {
            int temp = (a & b) << 1;
            a = (a ^ b);
            b = temp;
        }

        return a;
    }
}
