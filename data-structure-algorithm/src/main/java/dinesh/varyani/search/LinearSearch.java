package dinesh.varyani.search;

public class LinearSearch {


    private static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) { //for each loop can be used
            if (arr[i] == key) {
                return arr[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 2, 10, 15, 20};
        System.out.println(search(arr, 9));
    }
}
