package cracking.the.coding.interview.string;

import java.util.Arrays;

public class StringPermutation {


    private static boolean permutation(String a, String b){
        if(a.length()!=b.length()) return false;
        return sort(a).equals(sort(b));
    }

    //sort String
    private static String sort(String s){
        char[] ch= s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }

    //abc cba
    //cba abc
    private static boolean twoPointer(String a, String b){
        if(a.length() != b.length()) return false;
        int j=b.length()-1;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != b.charAt(j--))return false;
        }

        return true;
    }

    private static boolean identicalCharacters(String a, String b){
        if(a.length() != b.length()) return false;

        int[] result = new int[256];
        for (int i = 0; i < a.length(); i++) {
            result[a.charAt(i)-'a']++;
            result[b.charAt(i)-'a']--;
        }

        for (int i = 0; i < result.length; i++) {
            if(result[i]!=0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(identicalCharacters("abcd","hcba"));
        System.out.println(identicalCharacters("hcba","dabc"));

        System.out.println(identicalCharacters("abc","cba"));
        System.out.println(identicalCharacters("cba","abc"));
    }
}
