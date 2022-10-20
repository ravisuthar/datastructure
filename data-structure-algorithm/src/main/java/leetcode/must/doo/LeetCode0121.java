package leetcode.must.doo;

public class LeetCode0121 {
    public static void main(String[] args) {
        System.out.println(new LeetCode0121().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(new LeetCode0121().maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    //this is efficient solution
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxProfit = 0;
        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
                right++;
            } else {
                left = right;
                right++;
            }
        }
        return maxProfit;

    }

    public int maxProfitMoreTimeTaking(int[] prices) {

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
