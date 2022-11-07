package leetcode.must.doo;

/**
 * 121. Best Time to Buy and Sell Stock
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 *
 *
 * Example 1:
 *
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * Example 2:
 *
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 *
 *
 * Constraints:
 *
 * 1 <= prices.length <= 105
 * 0 <= prices[i] <= 104
 */
public class LeetCode0121_Easy_BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        System.out.println(new LeetCode0121_Easy_BestTimeToBuyAndSellStock().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(new LeetCode0121_Easy_BestTimeToBuyAndSellStock().maxProfit(new int[]{7, 6, 4, 3, 1}));
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
