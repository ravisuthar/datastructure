package leetcode.must.doo;

//https://leetcode.com/problems/valid-anagram/
public class LeetCode0242 {
    public static void main(String[] args) {

        System.out.println(isAnagram("anagram","nagaram"));

        //que  - how about upper case
        //store[s.charAt(i) - 'A']++;
        //store[t.charAt(i) - 'A']--;
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        //65 - 90
        //97 - 122
        int[] store = new int[60];

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'A']++;
            store[t.charAt(i) - 'A']--;
        }

        for (int n : store) if (n != 0) return false;


        store[0]++;

        return true;
    }
}
