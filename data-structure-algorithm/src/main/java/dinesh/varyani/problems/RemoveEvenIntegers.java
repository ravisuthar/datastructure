package dinesh.varyani.problems;

import java.util.Arrays;

/**
 * Given an array of integers, return an array with even integers removed.
 * Example –
 * Input: arr = {3, 2, 4, 7, 10, 6, 5}
 * Output: arr = {3, 7, 5}
 */
public class RemoveEvenIntegers {

    private static int[] removeIntegers(int[] arr) {

        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) size++;
        }

        int[] result = new int[size];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[count++] = arr[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeIntegers(new int[]{3, 2, 4, 7, 10, 6, 5})));
    }
}
