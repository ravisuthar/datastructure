package leetcode.must.doo;

import java.util.Arrays;

//https://www.youtube.com/watch?v=w-qeVOijccg&list=PL6Zs6LgrJj3u7lgjGEWzqnk4ZKKRfXE99&index=3&ab_channel=DineshVaryani
public class ProductArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ProductArray().product(new int[]{1,2,3,4})));
    }

    int[] product(int[] arr){

        int[] result = new int[arr.length];
        int temp=1;
        for (int i = 0; i < arr.length; i++) {
            result[i]= temp;
            temp = temp * arr[i];
        }
        temp=1;
        for (int i = arr.length; i >=0 ; i--) {
            result[i]= temp;
            temp = temp * arr[i];
        }

        return result;
    }
}
