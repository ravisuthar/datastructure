package dinesh.varyani.sort;

import java.util.Arrays;

//Sort an array of 0’s, 1’s, and 2’s (Dutch National Flag Problem)
//https://www.youtube.com/watch?v=19p9d9PCDkA&list=PL6Zs6LgrJj3tDXv8a_elC6eT_4R5gfX4d&index=150&ab_channel=DineshVaryani
public class SortDutchNationalFlagProblem {

    private static int[] sort(int[] arr) {

        int i = 0;
        int j = 0;
        int k = arr.length - 1;

        while (i <= k) {

            if (arr[i] == 0) {
                swap(arr, i, j);
                j++;
                i++;
            } else if (arr[i] == 2) {
                swap(arr, i, k);
                k--;
            } else if (arr[i] == 1) {
                i++;
            }
        }

        return arr;

    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[b];
        arr[b] =arr[a];
        arr[a]=temp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(SortDutchNationalFlagProblem.sort(new int[]{2,1,0,2,2,1,0,0,2,1,1,0,2,1,0,2,1,0,2,1,0,2})));

    }
}