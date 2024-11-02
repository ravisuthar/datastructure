package lovebabbar.array;

import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s/0
public class SortAnArrayOf0s1sAnd2s {
    public static void main(String[] args) {
        System.out.println("hello");
        int[] a = {2, 0, 2, 0, 0, 1, 2, 2, 2, 1, 1, 0, 1, 1, 1, 2, 0, 1, 2, 1, 0, 1, 2, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 2, 1, 1, 1, 2, 1, 2, 1, 2, 2, 1, 1, 2, 0, 2, 0, 0, 1, 2, 1, 2, 1, 1, 2, 1, 2, 0, 0, 1, 0, 2, 1, 1, 2, 0, 2, 0, 1, 2, 2, 2, 2, 1, 0, 1, 2, 2, 0, 1, 1, 1, 0, 1, 2, 0, 0, 2, 1, 0, 0, 2, 2, 1, 0};
        sort012(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort012(int a[]) {
        // code here
        if (a.length < 3) throw new RuntimeException("less than 3 numbers");

        int i = 0; // i and j starts from 0
        int j = 0;
        int k = a.length - 1;

        while (j <= k) {// this is important else j and kth value will be swapped. so both counter should not crossed each other.

            if(a[j]==0){ // whenever j encounter 0 it will throw to i and swap
                int temp = a[j];
                a[j]=a[i];
                a[i]=temp;
                i++;
                j++;
            }else if (a[j]==1){ //for j==1 it will be incremented
                j++;
            }else if(a[j]==2){ //for j==2 it will throw to k and swap
                int temp = a[k];
                a[k]=a[j];
                a[j]=temp;
                k--;
            }

        }


    }
}
