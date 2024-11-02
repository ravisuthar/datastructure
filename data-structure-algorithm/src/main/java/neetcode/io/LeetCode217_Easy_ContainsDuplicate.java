package neetcode.io;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/contains-duplicate/

/**
 * 217. Contains Duplicate
 * Easy
 *
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1]
 * Output: true
 * Example 2:
 *
 * Input: nums = [1,2,3,4]
 * Output: false
 * Example 3:
 *
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 */
public class LeetCode217_Easy_ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        LeetCode217_Easy_ContainsDuplicate test = new LeetCode217_Easy_ContainsDuplicate();
        var result = test.containsDuplicate(new int[]{1,2,2,1});
        System.out.println(result);
    }

    public boolean containsDuplicateJava8(int[] nums) {
        Set<Integer> set = new HashSet<>();
        return Arrays.stream(nums).anyMatch(i -> !set.add(i));
    }

    //Java 8 one liner, not so fast though:
    public boolean containsDuplicateJavaUnique(int[] nums) {
        return nums.length != Arrays.stream(nums).distinct().count();
    }
}
