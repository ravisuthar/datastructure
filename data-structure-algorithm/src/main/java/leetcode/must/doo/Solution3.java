package leetcode.must.doo;

//https://leetcode.com/problems/maximum-subarray/
public class Solution3 {

    public static void main(String[] args) {
        System.out.println(new Solution3().bruteForce(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
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
