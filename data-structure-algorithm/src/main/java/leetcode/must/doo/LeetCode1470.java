package leetcode.must.doo;

import java.util.Arrays;

//https://leetcode.com/problems/shuffle-the-array/
public class LeetCode1470 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new LeetCode1470().shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)));
        System.out.println(Arrays.toString(new LeetCode1470().shuffle(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4)));
        System.out.println(Arrays.toString(new LeetCode1470().shuffle(new int[]{1, 1, 2, 2}, 2)));
    }

    public int[] shuffle(int[] nums, int n) {

        int[] result = new int[nums.length];
        for (int i = 0, j = n, k = 0; i < nums.length / 2 && j < nums.length; i++, j++) {
            result[k++] = nums[i];
            result[k++] = nums[j];
        }
        return result;
    }
}
