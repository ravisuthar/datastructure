package neetcode.io;

public class LeetCode0125 {

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll(" ", "")
                .replaceAll("[^a-zA-Z0-9]", "");
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
    }
}
