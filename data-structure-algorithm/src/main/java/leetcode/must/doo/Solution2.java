package leetcode.must.doo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class Solution2 {

    public static void main(String[] args) {
        System.out.println(new Solution2().lengthOfLongestSubstring("abcabca"));
    }

    //abcabcaa
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int start= 0;
        int end=0;
        Map<Integer, String> map = new HashMap<>();
        for(int i=0;i<chars.length;i++){
            while(chars[start]==chars[end++]){
                String str = s.substring(start, end-1);
                map.put(str.length(), str);
                start=i+1;
            }
        }

        return map.keySet().stream().max(Comparator.comparing(Integer::intValue)).orElse(0);
    }
}
