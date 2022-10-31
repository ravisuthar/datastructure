package neetcode.io;

import java.util.Arrays;

/**
 * 238. Product of Array Except Self
 * <p>
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 * <p>
 * Example 1:
 * Input: nums = [1,2,3,4]
 *                  ^
 * //i=0 left=1 result[1] left=1
 * //i=1 left=1 result[1,1]  left=2
 * //i=2 left=2 result[1,1,2] left=6
 * //i=3 left=6 result[1,1,2,6]
 *
 * //i=3 right=1   result[1,1,2,6] right=4
 * //i=2 right=4  result[1,1,8,6] right=12
 * //i=1 right=12 result[1,12,8,6] right=24
 * <p>
 * <p>
 * Output: [24,12,8,6]
 * <p>
 * Example 2:
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 */
public class LeetCode0238_ProductOfArrayExceptSelf {
    //time O(n^2)
    //space O(n)
    public static int[] productExceptSelf_BruteForce(int[] nums) {

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = 1;
            for (int j = 0; j < nums.length; j++) {

                if (i != j) {
                    result[i] = result[i] * nums[j];
                }
            }
        }

        return result;
    }

    //left to right: 1  1  2 6
    //right to left: 24 12 4 1
    //time: o(n)
    //space: o(n)
    public static int[] productExceptSelf(int[] nums) {

        int left = 1;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = left;
            left = left * nums[i];
        }

        int right=1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = result[i]*right;
            right = right * nums[i];
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1, 1, 0, -3, 3})));
    }

}
