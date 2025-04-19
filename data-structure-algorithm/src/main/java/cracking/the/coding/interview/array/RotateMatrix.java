package cracking.the.coding.interview.array;

import java.util.Arrays;

public class RotateMatrix {

    private static int[][] rotate(int[][] arr) {

        System.out.println(Arrays.deepToString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println("after transpose");
        //System.out.println(Arrays.deepToString(arr));
        print(arr);

        //swap
        for (int i = 0; i < arr.length; i++) {
            int leftIndex = 0;
            int rightIndex = arr.length - 1;

            while (leftIndex < rightIndex) {
                int temp = arr[i][leftIndex];
                arr[i][leftIndex] = arr[i][rightIndex];
                arr[i][rightIndex] = temp;

                leftIndex++;
                rightIndex--;
            }
        }
        System.out.println("after swap");
        //System.out.println(Arrays.deepToString(arr));
        print(arr);

        return arr;
    }


    private static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println("\n");
        }
    }


    public static void main(String[] args) {

        int[][] arr = new int[][]{{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        print(arr);

        myTranspose(arr);
    }


    private static  void myTranspose(int[][] arr ){

        System.out.println(arr.length);
        System.out.println(arr[0].length);

        //swap i -> j and j -> i
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        print(arr);

        //swap n with n-1 for each row
        for (int i = 0; i < arr.length; i++) {

            int first = 0;
            int last = arr.length -1;
            while(first < last){
                int temp = arr[i][first];
                arr[i][first] = arr[i][last];
                arr[i][last] = temp;
                first++;
                last--;
            }

        }

        print(arr);

    }
}
