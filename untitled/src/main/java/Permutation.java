import java.util.HashSet;
import java.util.Set;

public class Permutation {
    public static void main(String[] args) {

        String str = "123";
        //123 132  231 213 321 312
        char[] array = str.toCharArray();
        Set<String> combinations = new HashSet<>();
        Set<Character> chars = new HashSet<>();

        for(char ch: array){
            chars.add(ch);
        }

        for(char ch : array){

            String temp = ""+ch;
            chars.remove(ch);
        }
    }
}
