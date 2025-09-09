package dinesh.varyani.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChar {


    //incorrect solution.
    public int lengthOfLongestSubstring2(String s) {

        int maxLength = 0;
        Set<Character> lastSeen = new HashSet<>();
        String uniqueString = "";
        int startChar = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!lastSeen.contains(ch)) {
                uniqueString = uniqueString + ch; //a
                maxLength = uniqueString.length(); //1
                lastSeen.add(ch); //a
            } else {
                uniqueString = uniqueString + ch;
                // uniqueString = uniqueString.replace(String.valueOf(ch), ""); //need to replace at char index 1
                uniqueString = new StringBuilder(uniqueString).deleteCharAt(startChar).toString();
            }

        }

        return maxLength;
    }

    public int lengthOfLongestSubstring(String s) {
        
        int max=0;
        Map<Character, Integer> map = new HashMap<>();
        for (int right = 0, left =0; right <  s.length(); right++) {

            char current = s.charAt(right);
            if(map.containsKey(current) && map.get(current) >= left){
                left = map.get(current) + 1;
            }

            max= Math.max(max, right-left+1);
            map.put(current, right);
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(new LongestSubstringWithoutRepeatingChar().lengthOfLongestSubstring("abcabcbb"));
        System.out.println(new LongestSubstringWithoutRepeatingChar().lengthOfLongestSubstring("bbbbb"));
        System.out.println(new LongestSubstringWithoutRepeatingChar().lengthOfLongestSubstring("pwwkew"));
    }

}
