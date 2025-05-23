package leetcode.must.doo;

//https://leetcode.com/explore/featured/card/the-leetcode-beginners-guide/692/challenge-problems/4427/
//https://leetcode.com/problems/ransom-note/

/**
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 *
 * Each letter in magazine can only be used once in ransomNote.
 *
 *
 *
 * Example 1:
 *
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 * Example 2:
 *
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 * Example 3:
 *
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 */
public class LeetCode0383 {

    public boolean canConstruct(String ransomNote, String magazine) {
        return magazine.contains(ransomNote);
    }

    public static void main(String[] args) {

    }
}

