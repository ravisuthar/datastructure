package dinesh.varyani.problems;


//https://leetcode.com/problems/remove-element/description/

/**
 * Example 1:
 *
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 2.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * Example 2:
 *
 * Input: nums = [0,1,2,2,3,0,4,2], val = 2
 * Output: 5, nums = [0,1,4,0,3,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
 * Note that the five elements can be returned in any order.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 *
 */


//negative case
public class RemoveElements {

    public static int removeElement(int[] arr, int value){
        int index=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != value){
                arr[index] = arr[i];
                index++;
            }
        }
        
        return index;
    }
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,2,2,3}, 2));
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }
}
