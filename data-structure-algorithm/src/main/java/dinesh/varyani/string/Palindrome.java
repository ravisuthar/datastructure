package dinesh.varyani.string;

public class Palindrome {

    public static void main(String[] args) {
        String a="madam";
        System.out.println(hasPalindrome(a));

    }

    //best is two pointer approach
    private static boolean hasPalindrome(String str){
        char[] charArray = str.toCharArray();
        int start=0;
        int end=charArray.length-1;
        while(start<end){
            if(charArray[start]!=charArray[end]){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    //my implementation
    private static boolean isPalindrome(String str){
        char[] charArray = str.toCharArray();
        String newString="";
        for (int i = 0; i < charArray.length; i++) {
            newString+=""+charArray[i];
        }

        return newString.equals(str);
    }
}
