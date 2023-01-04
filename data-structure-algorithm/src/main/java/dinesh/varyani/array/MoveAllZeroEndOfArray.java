package dinesh.varyani.array;

import java.util.Arrays;

//good logic
//two pointer logic
//increase left pointer only non zero value
//double for loop didn't worked for me.
public class MoveAllZeroEndOfArray {
    public static void main(String[] args) {
        //int[] arr={0,1,0,2,4,12}; //output=1 2 4 12 0 0

        int[] arr={8,1,0,1,2,1,0,3};// to : [8, 1, 1, 2, 1, 3, 0, 0]
        int left=0;
        int right=1;

        while(right<arr.length){

            if(arr[left]==0 && arr[right]!=0){
                int temp =arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }

            if(arr[left]!=0){
                left++;
            }
            right++;
        }


        //double for loop does not work
        System.out.println(Arrays.toString(arr));
    }
}
