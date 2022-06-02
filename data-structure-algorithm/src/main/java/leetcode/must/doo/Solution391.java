package leetcode.must.doo;

//https://leetcode.com/problems/max-consecutive-ones/
public class Solution391 {
    public static void main(String[] args) {
        System.out.println(new Solution391().findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
        System.out.println(new Solution391().findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));
    }

    public int findMaxConsecutiveOnes(int[] nums) {

        int count=0;
        int tempCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                tempCount++;
            }else{
                tempCount=0;
            }
            if(tempCount>count){
                count=tempCount;
            }
        }
        return count;
    }
}
