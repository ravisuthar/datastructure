package dinesh.varyani.search;

public class BinarySearchTest {

    public static void main(String[] args) {
        //System.out.println(binarySearch(new int[]{1, 2, 3, 4, 5, 6, 6, 6, 6, 7, 8, 9, 9, 9}, 9));


        System.out.println(rotatedBinarySearch(new int[]{3,1}, 1));
        System.out.println(rotatedBinarySearch(new int[]{4,5,6,7,0,1,2}, 4));
        System.out.println(rotatedBinarySearch(new int[]{4,5,6,7,0,1,2}, 5));
        System.out.println(rotatedBinarySearch(new int[]{4,5,6,7,0,1,2}, 6));
        System.out.println(rotatedBinarySearch(new int[]{4,5,6,7,0,1,2}, 7));
        System.out.println(rotatedBinarySearch(new int[]{4,5,6,7,0,1,2}, 0));
        System.out.println(rotatedBinarySearch(new int[]{4,5,6,7,0,1,2}, 1));
        System.out.println(rotatedBinarySearch(new int[]{4,5,6,7,0,1,2}, 2));

    }

    //Input: nums = [4,5,6,7,0,1,2], target = 0
    //Output: 4
    private static int rotatedBinarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int midIndex = (left + right) / 2;
            if (arr[midIndex] == target) return midIndex;

            //left subarray
            if (arr[left] <= arr[midIndex]) {
                if (target >= arr[left] && target < arr[midIndex]) {
                    right = midIndex - 1;
                } else {
                    left = midIndex + 1;
                }
            }
            //right subarray
            else {
                if (target > arr[midIndex] && target <= arr[right]) {
                    left = midIndex + 1;
                } else {
                    right = midIndex - 1;
                }
            }
        }
        return -1;
    }

    //Input: nums = [4,5,6,7,0,1,2], target = 0
    //Output: 4
    public static int search(int[] nums, int target) {
    /**
     * If the entire left part is monotonically increasing, which means the pivot point is on the right part
     * If left <= target < mid ------> drop the right half
     * Else ------> drop the left half
     * If the entire right part is monotonically increasing, which means the pivot point is on the left part
     * If mid < target <= right ------> drop the left half
     * Else ------> drop the right half
     */

        if (nums == null || nums.length == 0) {
            return -1;
        }

        /*.*/
        int left = 0, right = nums.length - 1;
        //when we use the condition "left <= right", we do not need to determine if nums[left] == target
        //in outside of loop, because the jumping condition is left > right, we will have the determination
        //condition if(target == nums[mid]) inside of loop
        while (left <= right) {
            //left bias
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            //if left part is monotonically increasing, or the pivot point is on the right part
            if (nums[left] <= nums[mid]) {
                //must use "<=" at here since we need to make sure target is in the left part,
                //then safely drop the right part
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                }
                else {
                    //right bias
                    left = mid + 1;
                }
            }

            //if right part is monotonically increasing, or the pivot point is on the left part
            else {
                //must use "<=" at here since we need to make sure target is in the right part,
                //then safely drop the left part
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    private static int simpleBinarySearch(int[] arr, int target) {

        //1.5.10 6   5<6
        int start = 0;
        int last = arr.length - 1;
        while (start <= last) {

            int midIndex = start + (last - start) / 2;
            if (arr[midIndex] == target) {
                return midIndex;
            } else if (arr[midIndex] < target) {
                start = midIndex + 1;
            } else {
                last = midIndex - 1;
            }

        }

        return -1;
    }


    //return the first index of the number.
    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int last = arr.length - 1;
        while (start <= last) {
            //int mid = (start+last)/2;
            int mid = start + (last - start) / 2; //for overflow condition
            if (arr[mid] == target) {
                while (arr[mid] == target) {
                    mid = mid - 1;
                }
                return mid + 1;
            } else if (target < arr[mid]) {
                last = mid;
            } else {
                start = mid;
            }
        }
        return -1;
    }

}
