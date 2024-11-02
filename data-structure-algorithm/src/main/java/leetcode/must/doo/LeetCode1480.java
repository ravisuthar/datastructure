package leetcode.must.doo;

//https://leetcode.com/explore/featured/card/the-leetcode-beginners-guide/692/challenge-problems/4422/
//https://leetcode.com/problems/running-sum-of-1d-array/

/*Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4]*/
public class LeetCode1480 {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            result[i] = sum;
        }
        return result;
    }

}