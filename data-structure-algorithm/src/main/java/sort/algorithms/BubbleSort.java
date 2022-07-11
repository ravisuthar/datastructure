package sort.algorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(new BubbleSort().bubbleSort(new int[]{5, 1, 4, 2, 8})));
    }

    int[] bubbleSort(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }
}
