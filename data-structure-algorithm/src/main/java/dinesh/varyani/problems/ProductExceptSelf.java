package dinesh.varyani.problems;

import java.util.Arrays;

/**
 * Given an array of integers arr[],
 * return an array result[] such that result[i] is equal to the product of all the elements of arr except arr[i].
 * The product fits in 32-bit integer.
 * The algorithm should run in O(n) time and without using division operator.
 * <p>
 * input {1 2 3 4}
 * output{24, 12, 8, 6}
 * <p>
 * input -1 1 0 -3 3
 * output 0 0 9 0 0
 * <p>
 * two for loop can solve the problem in o(n^2)
 * but we need to solve in O(n) time
 */
public class ProductExceptSelf {

    //1 2 3 4
    //
    //1  1  2 6
    //24 12 4 1
    private static int[] productExceptSelf(int[] arr) {

        //first value as 1
        //second as 1
        int[] result = new int[arr.length];
        int temp = 1;
        for (int i = 0; i < arr.length; i++) {
            result[i] = temp;
            temp = temp * arr[i];
        }

        temp = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            result[i] = result[i] * temp;
            temp = temp * arr[i];
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
    }
}
