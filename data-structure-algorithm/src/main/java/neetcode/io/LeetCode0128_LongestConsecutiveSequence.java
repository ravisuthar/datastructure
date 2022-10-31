package neetcode.io;

import scala.Int;

import java.util.HashSet;
import java.util.Set;

/**
 * 128. Longest Consecutive Sequence
 * <p>
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 * You must write an algorithm that runs in O(n) time.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 * Example 2:
 *
 * <p>
 * Input: nums = [0,3,7,2,5,8,4,6,0,1]
 * Output: 9
 */
public class LeetCode0128_LongestConsecutiveSequence {


    //not working solution
    public static int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int n:nums) {
            set.add(n);
        }

        int longestSequence=1;
        for (int n:nums) {

            while(set.contains(n-1)){
                longestSequence++;
                n=n-1;
            }

        }

        return longestSequence;
    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }
}
