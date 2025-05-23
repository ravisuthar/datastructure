package neetcode.io;

/**
 * 42. Trapping Rain Water
 *
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 * Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
 * Example 2:
 *
 * Input: height = [4,2,0,3,2,5]
 * Output: 9
 *
 *
 * Constraints:
 *
 * n == height.length
 * 1 <= n <= 2 * 104
 */
public class LeetCode0042_Hard_TrappingRainWater {
    public static void main(String[] args) {
        System.out.println(trap1(new int[]{4, 2, 0, 3, 2, 5}));
    }


    //important
    //hard with o(1)
    public static int trap1(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        int leftMax=arr[left];
        int rightMax=arr[right];

        int result = 0;

        while (left < right) {

            if (arr[left] < arr[right]) {
                left++;
                leftMax= Math.max(leftMax, arr[left]);
                result += leftMax - arr[left];
            } else {
                right--;
                rightMax= Math.max(rightMax, arr[right]);
                result += rightMax - arr[right];
            }
        }

        return result;
    }

    //o(n)
    public static int trap(int[] arr) {

        int[] leftMaxArray = new int[arr.length];

        int maxLeft = 0;
        for (int i = 0; i < arr.length; i++) {
            leftMaxArray[i] = maxLeft;
            maxLeft = Math.max(maxLeft, arr[i]);
        }

        int[] rightMaxArray = new int[arr.length];
        int maxRight = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            rightMaxArray[i] = maxRight;
            maxRight = Math.max(maxRight, arr[i]);
        }


        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int min = Math.min(leftMaxArray[i], rightMaxArray[i]);
            if (min - arr[i] >= 0) {
                sum = sum + (min - arr[i]);
            }
        }

        //Array ->  4, 2, 0, 3, 2, 5
        //MaxLeft-> 0  4  4  4  4  4
        //MaxRight->5  5  5  5  5  0
        //Min(l,R)->0  4  4  4  4  0
        //min-a[i]->0  2  4  1  2  0

        return sum;
    }
}
