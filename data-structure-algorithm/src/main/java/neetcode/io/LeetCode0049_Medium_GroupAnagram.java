package neetcode.io;

import java.util.*;
import java.util.stream.Collectors;

//https://leetcode.com/problems/group-anagrams/
/**
 * 49. Group Anagrams
 * <p>
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * <p>
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * Example 2:
 * <p>
 * Input: strs = [""]
 * Output: [[""]]
 * Example 3:
 * <p>
 * Input: strs = ["a"]
 * Output: [["a"]]
 */
public class LeetCode0049_Medium_GroupAnagram {

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();
        for (String ch : strs) {
            char[] chars = ch.toCharArray();
            Arrays.sort(chars);//nlogn
            String sortedString = String.valueOf(chars);

            if (map.containsKey(sortedString)) {
                List<String> list = map.get(sortedString);
                list.add(ch);
            } else {
                List<String> list = new ArrayList<>();
                list.add(ch);
                map.put(sortedString, list);
            }
        }

        List<List<String>> collect = map.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
        //return new ArrayList<>(map.values());
        return collect;
    }

    public static List<List<String>> groupAnagramsWithoutSort(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();
        for (String ch : strs) {
            char[] chars = ch.toCharArray();
            //Arrays.sort(chars);//nlogn
            //String sortedString = String.valueOf(chars);
            char[] charArray = new char[26];
            for(char c: chars){
                charArray[c-'a']++;
            }
            String sortedString = String.valueOf(charArray);

            if (map.containsKey(sortedString)) {
                List<String> list = map.get(sortedString);
                list.add(ch);
            } else {
                List<String> list = new ArrayList<>();
                list.add(ch);
                map.put(sortedString, list);
            }
        }

        List<List<String>> collect = map.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
        //return new ArrayList<>(map.values());
        return collect;
    }

    public static void main(String[] args) {

        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }

}
