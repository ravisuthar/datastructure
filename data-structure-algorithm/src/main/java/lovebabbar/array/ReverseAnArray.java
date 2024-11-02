package lovebabbar.array;

import java.util.Arrays;

//https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
//Write a program to reverse an array or string
public class ReverseAnArray {

    private static int[] reverse(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return arr;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(ReverseAnArray.reverse(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(ReverseAnArray.reverse(new int[]{4, 5, 1, 2})));
    }

}
