package leetcode.must.doo;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/contains-duplicate/

/**
 * 217. Contains Duplicate
 * <p>
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,1]
 * Output: true
 * Example 2:
 * <p>
 * Input: nums = [1,2,3,4]
 * Output: false
 * Example 3:
 * <p>
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 */
public class LeetCode0217_Easy_ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> unique = new HashSet<>();
        /*for (int i = 0; i < nums.length; i++) {

            if (unique.contains(nums[i])) {
                return true;
            }
            unique.add(nums[i]);
        }*/

        for(int n: nums){
            if(!unique.add(n)){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4}));
        System.out.println(containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}
