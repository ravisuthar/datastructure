package leetcode.must.doo;

public class LeetCode0121 {
    public static void main(String[] args) {
        System.out.println(new LeetCode0121().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(new LeetCode0121().maxProfit(new int[]{7, 6, 4, 3, 1}));
    }


    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        for (int i = 0; i < prices.length-1; i++) {
            int leftPointer = i;
            int rightPointer = i + 1;
            while (rightPointer < prices.length) {
                int temp = prices[rightPointer] - prices[leftPointer];
                if (temp > maxProfit) {
                    maxProfit = temp;
                }
                rightPointer++;
            }
        }
        return maxProfit;
    }
}
