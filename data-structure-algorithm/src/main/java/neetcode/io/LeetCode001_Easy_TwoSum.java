package neetcode.io;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode001_Easy_TwoSum {
    public static void main(String[] args) {
        LeetCode001_Easy_TwoSum test = new LeetCode001_Easy_TwoSum();
        int[] result = test.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(result));

        int[] result2 = test.twoSum(new int[]{3,2,4}, 6);
        System.out.println(Arrays.toString(result2));

        int[] result3= test.twoSum(new int[]{3,3}, 6);
        System.out.println(Arrays.toString(result3));

    }

    public int[] twoSum(int[] nums, int target) {

        int[] result  = new int[2];
        Map<Integer, Integer> map =new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int index = map.get(nums[i]);
                result[0] = index;
                result[1]= i;
                return result;
            }else{
                map.put(target-nums[i], i);
            }
        }

        return result;
    }
}
