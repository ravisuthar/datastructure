package leetcode.must.doo;

//https://leetcode.com/problems/maximum-subarray/

/**
 * 53. Maximum Subarray
 *
 * Given an integer array nums, find the subarray which has the largest sum and return its sum.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Example 2:
 *
 * Input: nums = [1]
 * Output: 1
 * Example 3:
 *
 * Input: nums = [5,4,-1,7,8]
 * Output: 23
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * -104 <= nums[i] <= 104
 *
 *
 * Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */
public class LeetCode0053 {

    public static void main(String[] args) {
        System.out.println(new LeetCode0053().bruteForce(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    public int kadanesAlgorith(int[] nums) {

        int maxSum = 0;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum = currentSum + nums[i];
            if (currentSum < 0) {
                currentSum =0;
            }
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
        }
        return maxSum;
    }

    //todo brute force solution
    public int bruteForce(int[] nums) {
        int max = 0;
        outer:
        for (int i = 0; i < nums.length; i++) {
            int tempSum = 0;
            for (int j = i + 1; j < nums.length; j++) {
                tempSum = nums[i] + nums[j];
                if (tempSum < 0) continue outer;
                max = Math.max(max, tempSum);
            }
            max = Math.max(max, tempSum);
        }
        return max;
    }


    //https://www.youtube.com/watch?v=HCL4_bOd3-4&t=453s&ab_channel=AnujBhaiya
    public int maxSubArray(int[] nums) {
        int tempSum = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            tempSum = tempSum + nums[i];
            if (tempSum > max) {
                max = tempSum;
            }
            if (tempSum < 0) {
                tempSum = 0;
            }
        }

        return max;
    }

    public static class Solution6 {
    }
}
