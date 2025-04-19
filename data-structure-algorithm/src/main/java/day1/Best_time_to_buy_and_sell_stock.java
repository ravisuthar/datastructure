package day1;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
/*Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
*/
public class Best_time_to_buy_and_sell_stock {
    public static void main(String[] args) {


        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int maxProfit = 0;
        int first = 0;
        int second = 1;

        while (second < prices.length) {

            if (prices[first] < prices[second]) {
                maxProfit = Math.max(maxProfit, prices[second] - prices[first]);
                second++;
            } else {
                first = second;
                second++;
            }


        }


    }
}
