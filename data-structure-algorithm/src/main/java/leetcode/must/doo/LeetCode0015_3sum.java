package leetcode.must.doo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/3sum
public class LeetCode0015_3sum {

    public static void main(String[] args) {
        System.out.println(new LeetCode0015_3sum().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(new LeetCode0015_3sum().threeSum_Practice(new int[]{-1, 0, 1, 2, -1, -4}));
    }


    public List<List<Integer>> threeSum_Practice(int[] nums) {
        if (nums.length < 3) throw new IllegalArgumentException("does not support less than 3 size");
        Arrays.sort(nums);

        //-4, -1, -1, 0, 2
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    List<Integer> list = List.of(nums[i], nums[j], nums[k]);
                    if (!result.contains(list)) {
                        result.add(list);
                    }
                    j++;//this is important
                    k--;//this is important
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }

        }

        return result;
    }

    //sort array
    //use three pointers
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) throw new RuntimeException("does not support");
        Arrays.sort(nums); //o(nlogn)
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    if (!result.contains(temp)) {
                        result.add(temp);
                    }
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return result;
    }
}
//https://www.youtube.com/watch?v=bZrgAfkrs9M&ab_channel=DineshVaryani
