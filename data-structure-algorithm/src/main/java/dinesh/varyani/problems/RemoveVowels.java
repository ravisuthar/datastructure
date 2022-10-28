package dinesh.varyani.problems;

import java.util.Set;

//Given a string, remove the vowels from the string and return the string without vowels.
public class RemoveVowels {

    public static String remove(String s) {
        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u');
        StringBuilder sb = new StringBuilder();

        for (Character ch : s.toCharArray()) {
            if (!set.contains(ch))
                sb.append(ch);
        }

        return sb.toString();
    }

    public static String removeVowels(String str) {

        //char[] result = new char[str.length()];
        String result = "";
        for (int i = 0, j = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                result += ch;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(removeVowels("what is your name"));
        System.out.println(remove("what is your name"));
    }
}
