package day1;

//https://leetcode.com/problems/two-sum/description/

import scala.Int;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        //try with two pointer
        //no, not all possible combination

        //two for loop
        //O(n2) time complexity
        //O(n)


        //O(n) time and space.
        Map<Integer, Integer> map = new HashMap<>();//key = value and value is index number
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                result= new int[]{map.get(target - nums[i]), i};
                break;
            }
            map.put(nums[i], i);
        }

        return result;
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        System.out.println(Arrays.toString(ts.twoSum(new int[]{2,7,1,2,3,6}, 9)));
        System.out.println(Arrays.toString(ts.twoSum(new int[]{3,2,4}, 6)));
    }
}
