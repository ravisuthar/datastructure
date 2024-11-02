package lovebabbar.array;

//https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
//Maximum and minimum of an array using minimum number of comparisons
public class MaxAndMin {


    private static void maxAndMin(int[] arr) {

        int max = arr[0];
        int min = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println(max);
        System.out.println(min);
    }

    public static void main(String[] args) {
        maxAndMin(new int[]{3, 5, 4, 1, 9});
        maxAndMin(new int[]{22, 14, 8, 17, 35, 3});
    }
}
