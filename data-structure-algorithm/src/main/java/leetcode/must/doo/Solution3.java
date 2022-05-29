package leetcode.must.doo;

//https://leetcode.com/problems/maximum-subarray/
public class Solution3 {

    public static void main(String[] args) {
        System.out.println(new Solution3().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    public int maxSubArray(int[] nums) {
        int tempSum = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            tempSum = tempSum + nums[i];
            if (tempSum > max) {
                max=tempSum;
            }
            if(tempSum <0){
                tempSum=0;
            }
        }

        return max;
    }
}
