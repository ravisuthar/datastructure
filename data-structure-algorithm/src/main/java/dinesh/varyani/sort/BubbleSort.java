package dinesh.varyani.sort;

import java.util.Arrays;


//Time : 	O(n^2)
// Space O(1)
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


    public void sort(int[] arr) {
        int n = arr.length;
        boolean isSwapped; //flag based

        for(int i = 0; i < n - 1; i++) {
            isSwapped = false;
            for(int j = 0; j < n - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if(isSwapped == false) { //Warning:(43, 16) 'isSwapped == false' can be simplified to '!isSwapped'
                break;
            }

        }

    }
}
