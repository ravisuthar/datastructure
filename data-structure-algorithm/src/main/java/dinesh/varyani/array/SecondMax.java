package dinesh.varyani.array;

//check with duplicates max numbers
//must do it
public class SecondMax {
    public static void main(String[] args) {

        int[] arr = {1, 4,7, 7, 2, 9,9, 3, 5, 7};
        int max = 0;
        int secondMax = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] < max) {//arr[i] != max
                secondMax = arr[i];
            }

        }

        System.out.println(max);
        System.out.println(secondMax);
    }
}
