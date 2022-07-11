package leetcode.must.doo;

import collections.StackGenerics;

//https://leetcode.com/problems/decode-string/
public class Solution63 {
    public static void main(String[] args) {
        System.out.println(new Solution63().decodeString("3[a]2[bc]"));
    }

    public String decodeString(String s) {

        char[] ch = s.toCharArray();
        String result = "";
        StackGenerics<Character> stack = new StackGenerics<>(s.length());
        int index = 0;
        while (index < s.length()) {
            Character some = ch[index++];
            if (Character.isDigit(some)) {

            }
        }


        return result;
    }
}
