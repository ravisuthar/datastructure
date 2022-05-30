package leetcode.must.doo;

import java.util.*;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class Solution2 {

    public static void main(String[] args) {
        System.out.println(new Solution2().dineshVaryani("pwwkew"));
    }

    //https://www.youtube.com/watch?v=zKrEIlwbF5A&t=16s&ab_channel=DineshVaryani
    public int dineshVaryani(String s) {

        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        int maxLength = 0;
        for (int end = 0; end < s.length(); end++) {
            Character right= s.charAt(end);
            if(map.containsKey(right)){
                start = Math.max(start, map.get(right)+1);//for PWWKEW
            }
            map.put(right, end);
            maxLength = Math.max(maxLength, end-start+1);
        }

        return maxLength;
    }


    public int leetCode(String s) {
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        for (int i = 0, j = 0; i < s.length(); ++i) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }

    //https://www.youtube.com/watch?v=3IETreEybaA&ab_channel=NickWhite
    //a b c d e f
    //not working for pwwkew
    public int nickWhiteSolutionNotWorking(String s) {
        int a_pointer = 0;
        int b_pointer = 0;
        int maxValue = 0;
        Set<Character> set = new HashSet<>();
        while (b_pointer < s.length()) {
            if (!set.contains(s.charAt(b_pointer))) {
                set.add(s.charAt(b_pointer));
                maxValue = Math.max(set.size(), maxValue);
                b_pointer++;
            } else {
                set.remove(s.charAt(b_pointer));
                a_pointer++;
            }
        }

        return maxValue;
    }


    //not working solution
    public int lengthOfLongestSubstring2(String s) {

        if (null == s) return 0;

        int pointer1 = 0;
        int pointer2 = 1;
        int maxResult = 0;
        Set<Character> set = new HashSet<>();
        while (pointer1 < pointer2) {

            if (set.contains(s.charAt(pointer2))) {
                set.remove(s.charAt(pointer2));
                pointer1 = pointer2;
            } else {
                int temp = s.substring(pointer1, pointer2).length();
                if (temp > maxResult) {
                    maxResult = temp;
                }

                pointer2++;
            }
        }
        return maxResult;
    }

    //abcabcaa
    //not working solution
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = 0;
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            while (chars[start] == chars[end++]) {
                String str = s.substring(start, end - 1);
                map.put(str.length(), str);
                start = i + 1;
            }
        }

        return map.keySet().stream().max(Comparator.comparing(Integer::intValue)).orElse(0);
    }
}
