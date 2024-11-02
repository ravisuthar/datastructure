package lovebabbar.array;

import java.util.Arrays;

//https://www.cdn.geeksforgeeks.org/kth-smallestlargest-element-unsorted-array/
public class KthSmallestElement {

    //Time Complexity: O(N log N)
    //Auxiliary Space: O(1)
    public static int kthSmallest(int[] arr, int k) {
        Arrays.sort(arr);//12 3 5 7 19 -> 3 5 7 12 19 -> k-1 is the third one
        return arr[k - 1];
        /*for (int num : arr) {

            if (k-- <= 1) {
                return num;
            }
        }

        return -1;*/
    }

    //second approach
    //use TreeSet, add elements to set
    // iterate till k-- ==3


    //third use heap
    //store all elemetns
   // Time Complexity:  O(N*log N)
   // Auxiliary Space: O(N)
    //K’th smallest element in an unsorted array using Min-Heap
   // Min-Heap can be used to find the kth smallest element, by inserting all the elements into Min-Heap and then and call extractMin() function K times.
   // Follow the given steps to solve the problem:
  //  Insert all the array elements into the Min-Heap
  //  Call extractMin() function K times
  //  Return the value obtained at the last call of extractMin() function





    //using treemap
    //Time Complexity: O(N log N)
    //Auxiliary Space: O(N)

    //using priority queue
    //Time complexity: O(K log K +  (N – K) log K)
    //Auxiliary Space: O(K)

    public static void main(String[] args) {
        System.out.println(kthSmallest(new int[] { 12, 3, 5, 7, 19 }, 3));
    }
}
