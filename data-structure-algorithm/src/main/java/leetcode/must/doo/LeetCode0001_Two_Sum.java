package leetcode.must.doo;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/discuss/3/Accepted-Java-O(n)-Solution

/**
 * 1. Two Sum
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class LeetCode0001_Two_Sum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new LeetCode0001_Two_Sum().twoSum(new int[]{3, 2, 4}, 6)));
    }


    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        Map<Integer, Integer> valueToIndexMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(valueToIndexMap.containsKey(target - nums[i])){
                result[0] = valueToIndexMap.get(target - nums[i]);
                result[1] = i;
                return result;
            }else{
                valueToIndexMap.put(nums[i], i);
            }

        }


        return result;
    }

    /**
     * Brute force
     */
    public int[] twoSum_solution_1(int[] nums, int target) {

        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return  result;
    }


    /**
     * [3,2,4] target=6
     * fail
     */
    public int[] twoSum_solution_2(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
        }

        return new int[2];
    }


    /**
     * best
     *  O(n)
     *  O(n)
     */
    public int[] twoSum_solution_3(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                    result[0]=map.get(target-nums[i]);
                    result[1]=i;
                    return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }

}