package dinesh.varyani.sort;

//https://www.youtube.com/watch?v=O1VG37bKmFs&list=PL6Zs6LgrJj3tDXv8a_elC6eT_4R5gfX4d&index=152&ab_channel=DineshVaryani
//Time: O(n log(n))
// Space: O(n)

/**
 * Quick Sort is a divide and conquer algorithm. It involves 3 steps -
 * 1. Pivot Selection - We pick an element and mark it as pivot. The pivot element can be first element, last element or any random element.
 * 2. Partitioning - We reorder the array such that all elements greater than pivot comes after the pivot and all elements smaller than pivot comes before the pivot. The elements equal to pivot can go either side of the pivot. After this partitioning the pivot is at its correct sorted position.
 * 3. Recursion - Recursively apply the above steps on the subarray formed to the left side of pivot and on the subarray formed on the right side of the pivot.
 */
public class QuickSort {

    // A utility function to swap two elements
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /* This function takes last element as pivot, places
       the pivot element at its correct position in sorted
       array, and places all smaller (smaller than pivot)
       to left of pivot and all greater elements to right
       of pivot */
    static int partition(int[] arr, int low, int high) {

        // pivot
        int pivot = arr[high];

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot) {

                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    /* The main function that implements QuickSort
              arr[] --> Array to be sorted,
              low --> Starting index,
              high --> Ending index
     */
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Function to print an array
    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver Code
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}
