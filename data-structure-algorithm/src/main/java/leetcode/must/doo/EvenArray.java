package leetcode.must.doo;

import java.util.Arrays;

//https://www.youtube.com/watch?v=5rWEio2KoZM&list=PL6Zs6LgrJj3u7lgjGEWzqnk4ZKKRfXE99&index=2&ab_channel=DineshVaryani
public class EvenArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new EvenArray().even2(new int[]{3, 2, 4, 7, 10, 6, 5})));
    }

    int[] even2(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) count++;
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[index++] = arr[i];
            }
        }

        return result;
    }


    int[] even(int[] arr) {
        int[] result = new int[-1];//size we don't know
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

            }
        }
        return result;
    }
}
