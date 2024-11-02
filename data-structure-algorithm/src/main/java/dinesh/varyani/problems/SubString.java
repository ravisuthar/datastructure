package dinesh.varyani.problems;

/**
 * A subsequence of a string is a new string formed from the
 * original string by deleting one or no character without
 * changing the order of remaining characters
 *
 * ace is subsequence of abcde
 * aec is not subsequence of abcde
 */
public class SubString {

    public static boolean subSequence(String subString, String string){
        int pointer1=0;
        int count=0;
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i)==subString.charAt(pointer1)){
                pointer1++;
                count++;
            }
        }
        return count==subString.length();
    }

    public static void main(String[] args) {
        System.out.println(subSequence("aec", "abcde"));
    }
}
