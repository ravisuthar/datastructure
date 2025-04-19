package dinesh.varyani.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find the first non-repeating character in it and return its index.
 * If it does not exist, return -1.
 * <p>
 * str = codeforcode
 * output=4
 * the first non repeating char is found at 4th index which is f
 * <p>
 * str aabb
 * output=-1
 */
public class FirstNonRepeatingCharacter {

    private static int nonRepeatingChar(String s) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i; //returning index of first non repeating character.
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        System.out.println(nonRepeatingChar("codeforcode"));
        System.out.println(nonRepeatingChar("aabb"));
    }
}
