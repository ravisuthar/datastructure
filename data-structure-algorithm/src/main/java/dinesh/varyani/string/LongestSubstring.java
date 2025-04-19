package dinesh.varyani.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public static void main(String[] args) {
        System.out.println(new LongestSubstring().lengthOfLongestSubstring("pwwkew"));
    }

    public int lengthOfLongestSubstring(String s) {

        int maxLength =0;
        Set<Character> lastSeen  = new HashSet<>();
        String uniqueString="";
        int startChar =0;

        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);

            if(!lastSeen.contains(ch))    {
                uniqueString = uniqueString + ch; //a
                maxLength = uniqueString.length(); //1
                lastSeen.add(ch); //a
            }else{
                uniqueString = uniqueString + ch;
                // uniqueString = uniqueString.replace(String.valueOf(ch), ""); //need to replace at char index 1
                uniqueString = new StringBuilder(uniqueString).deleteCharAt(startChar).toString();
            }

        }

        return maxLength;
    }
}
