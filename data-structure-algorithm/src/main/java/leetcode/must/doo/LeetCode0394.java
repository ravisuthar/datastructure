package leetcode.must.doo;

import dinesh.varyani.stack.StackGenerics;

//https://leetcode.com/problems/decode-string/
public class LeetCode0394 {
    public static void main(String[] args) {
        System.out.println(new LeetCode0394().decodeString("3[a]2[bc]"));
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
