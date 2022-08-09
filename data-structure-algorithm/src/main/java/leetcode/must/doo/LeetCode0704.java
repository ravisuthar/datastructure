package leetcode.must.doo;

//https://leetcode.com/problems/binary-search/
public class LeetCode0704 {


    public static void main(String[] args) {
        System.out.println(new LeetCode0704().search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        System.out.println(new LeetCode0704().search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }

    public int search(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int low = i;
            int high = nums.length - 1;
            int pivot = -1;

            while (low <= high) { //equal to check imp
                pivot = (low + high) / 2;
                if (target == nums[pivot]) return pivot;
                else if (target > nums[pivot]) low = pivot + 1;//one more
                else high = pivot - 1;//one less
            }
        }
        return -1;
    }
}
