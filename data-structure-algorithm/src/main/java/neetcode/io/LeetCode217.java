package neetcode.io;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/contains-duplicate/
public class LeetCode217 {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        LeetCode217 test = new LeetCode217();
        var result = test.containsDuplicate(new int[]{1,2,2,1});
        System.out.println(result);
    }

    public boolean containsDuplicateJava8(int[] nums) {

        Set<Integer> set = new HashSet<>();
        return Arrays.stream(nums).anyMatch(i -> !set.add(i));
    }

    public boolean containsDuplicateJavaUnique(int[] nums) {
        return nums.length != Arrays.stream(nums).distinct().count();
    }
}
