package dinesh.varyani.search;

public class SearchInsertPosition {
    private static int binarySearch(int[] arr, int key) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) { //equal to is importatnt
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return arr[mid];
            } else if (arr[mid] < key) {
                left = mid + 1; //+1 important
            } else {
                right = mid - 1; //-1 important
            }
        }

        return left;
    }


    public static void main(String[] args) {
        int[] arr = {1, 10, 20, 47, 59, 65, 75, 88, 99};
        for (int i = 0; i < 100; i++) {
            System.out.println(i+" = "+binarySearch(arr, i));
        }
    }

}
