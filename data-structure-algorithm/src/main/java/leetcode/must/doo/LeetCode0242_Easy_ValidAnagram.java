package leetcode.must.doo;

//https://leetcode.com/problems/valid-anagram/

/**
 * 242. Valid Anagram
 *
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 * Output: false
 */
public class LeetCode0242_Easy_ValidAnagram {
    public static void main(String[] args) {

        System.out.println(isAnagram("anagram","nagaram"));
        //null
        System.out.println(isAnagram(null, null));
        //upper case
        System.out.println(isAnagram("Anagram","nagarAm"));

        //que  - how about upper case
        //store[s.charAt(i) - 'A']++;
        //store[t.charAt(i) - 'A']--;
    }

    public static boolean isAnagram(String s, String t) {
        if(null==s || null==t) return false;
        if (s.length() != t.length()) return false;

        //65 - 90
        //97 - 122
        int[] store = new int[60];

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'A']++;
            store[t.charAt(i) - 'A']--;//what if second string is short
        }

        for (int n : store) if (n != 0) return false;


        //store[0]++;

        return true;
    }
}
