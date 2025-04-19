package day1;

//https://leetcode.com/problems/majority-element/description/
public class Majority_element {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        Majority_element s = new Majority_element();
        System.out.println(s.majorityElement(new int[]{1,2,2,2,2,1}));
    }
}
