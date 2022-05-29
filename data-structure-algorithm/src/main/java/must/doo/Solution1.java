package must.doo;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution1 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution1().twoSum_solution_2(new int[]{3, 2, 4}, 6)));
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