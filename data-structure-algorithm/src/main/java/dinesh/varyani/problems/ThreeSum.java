package dinesh.varyani.problems;

import java.util.Arrays;

/**
 * Given an array of distinct integers, print all such triple
 * such that they add up to a specific target.
 * the triple should be ordered in ascending order.
 * <p>
 * {2 4 3 7 1 8 9 0} target=6
 * {0,1,2,3,4,7,8,9}
 * solution 0 2 4  and 1 2 3 result should be in ascending order.
 */
public class ThreeSum {


    //sort array first
    //use three sum
    private static void threeSum(int[] arr, int target) {
        if (arr.length < 3) throw new IllegalArgumentException("less arg");
        Arrays.sort(arr);// sort the array is important.


        //i to iterate till arr.length - 2
        for (int i = 0; i < arr.length - 2; i++) {
            int j = i + 1;
            int k = arr.length - 1;

            //j to iterate till arr.length-1 and k should not be less than jth value
            while (j < arr.length-1 && k >= j+1) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == target) {
                    System.out.println("{" + arr[i] + "," + arr[j] + "," + arr[k] + "}");
                    j++;
                    k--;
                } else if (sum > target) {
                    k--;
                } else {
                    j++;
                }
            }

        }
    }

    public static void main(String[] args) {
        threeSum(new int[]{2, 4, 3, 7, 1, 0}, 6);
    }
}
