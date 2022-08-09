package leetcode.must.doo;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/contains-duplicate/
public class LeetCode0217 {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> unique = new HashSet<>();
        for(int i=0; i<nums.length; i++){

            if(unique.contains(nums[i])){
                return true;
            }
            unique.add(nums[i]);
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
