package neetcode.io;

import java.util.Arrays;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
/**
 * 167. Two Sum II - Input Array Is Sorted
 * <p>
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 * <p>
 * Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
 * <p>
 * The tests are generated such that there is exactly one solution. You may not use the same element twice.
 * <p>
 * Your solution must use only constant extra space.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
 * <p>
 * <p>
 * <p>
 * Example 2:
 * Input: numbers = [2,3,4], target = 6
 * Output: [1,3]
 * Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
 * <p>
 * <p>
 * <p>
 * Example 3:
 * Input: numbers = [-1,0], target = -1
 * Output: [1,2]
 * Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 2 <= numbers.length <= 3 * 104
 * -1000 <= numbers[i] <= 1000
 * numbers is sorted in non-decreasing order.
 * -1000 <= target <= 1000
 * The tests are generated such that there is exactly one solution.
 */
public class LeetCode0167_Medium_TwoSumII_InputArrayIsSorted {
    // see image : resources/images/LeetCode0167_TwoSumII_InputArrayIsSorted.jpeg
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{2,3,4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{-1,0}, 1)));
    }

    /**
     * The approach to this question differs to that of the classic Two Sum problem in that we have some direction with how we want to search for our target.
     * <p>
     * Since the array is sorted, we can make some general observations:
     * <p>
     * Smaller sums would come from the left half of the array
     * Larger sums would come from the right half of the array
     * Therefore, using two pointers starting at the end points of the array, we can choose to increase or decrease our current sum however we like. Pay attention to the example below:
     * <p>
     * The basic idea is that:
     * <p>
     * If our current sum is too small, move closer to the right.
     * If our current sum is too large, move closer to the left.
     * <p>
     * That's really all there is to it! Since the array is sorted and we're guarranteed that there exists an answer, we have everything we need to start coding :)
     * <p>
     * <p>
     * <p>
     * How would I come up with this during an interview?
     * In an interview, whenever you're given a question where the input array is sorted, here are some super useful things to consider:
     * <p>
     * Binary Search
     * Two (or three) pointers
     * A sliding window
     * Traversing from the right
     * Make sure to write down a couple examples and try experimenting with these approaches.
     * Even understanding that these approaches may aid in finding an answer with a sorted array,
     * you're showing your interviewer that you have a good understanding of the array datastructure.
     * Be mindful of negative values and duplicates as you're experimenting!
     */

    //0 1 2 3 4 5 6 9 target=7
    //^             ^
    public static int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;
        int[] result = new int[2];
        while (left < right) {

            if (numbers[left] + numbers[right] == target) {
                result[0] = left;
                result[1] = right;
                return result; //missed return will be having infinite loop
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                left++;
            }
        }

        return result;
    }

}
