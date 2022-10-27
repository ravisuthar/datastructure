package dinesh.varyani.sort;

import java.util.Arrays;

//time : o(n)
//space : o(n)
public class SquareAndSort {

    //-4 -1 0 3 10
    //0 1 9 16 100
    private static int[] squareAndSort(int[] arr) {

        int left = 0;
        int right = arr.length - 1;
        int[] result = new int[arr.length]; //new array is required to store result

        for (int pivot = arr.length - 1; pivot >= 0; pivot--) {

            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                result[pivot] = arr[left] * arr[left];
                left++;
            } else {
                result[pivot] = arr[right] * arr[right];
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(squareAndSort(new int[]{-4, -1, 0, 3, 10})));
    }

}
