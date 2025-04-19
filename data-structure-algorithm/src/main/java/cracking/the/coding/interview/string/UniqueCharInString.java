package cracking.the.coding.interview.string;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 */
public class UniqueCharInString {

    //two pointer technique
    //o n^2
    //space = o(1)
    private static boolean isUniqueTwoPointer(String s) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int j = i + 1;

            while (j < chars.length) {
                if (chars[i] == chars[j]) {
                    return false;
                }
                j++;
            }
        }

        return true;
    }

    //using ascii code
    //a-z 97-122
    //A-Z = 65-90
    //all ascii char size in 256
    //alpha numeric
    //NUMBERS 48-57
    private static boolean hasUnique(String str) {

        int[] result = new int[256]; //SPACE complexity is 0(constant) not o(n)
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result[ch - '0']++;
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] > 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

       // bitwiseOperator();
        System.out.println(isUniqueChars2("abc"));
    }

    public static void bitwiseOperator(){
        System.out.println("1&1: "+ (1&1));
        System.out.println("1&2: "+ (1&2));
        System.out.println("1&0: "+ (1&0));
        System.out.println("0&1: "+ (0&1));
        System.out.println("0&0: "+ (0&0));

        System.out.println("1|1: "+ (1|1));
        System.out.println("1|0: "+ (1|0));
        System.out.println("0|1: "+ (0|1));
        System.out.println("0|0: "+ (0|0));

    }

    //book solution
    public static boolean isUniqueChars(String str) {
        if (str.length() > 128) {
            return false;
        }
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            System.out.println("checker:"+ checker+" val:"+val+" (1 << val):"+(1 << val)+" (checker & (1 << val)):"+(checker & (1 << val)));

            if ((checker & (1 << val)) > 0) return false;
            checker |= (1 << val); //is same as checker +=(1 << val);
        }
        return true;
    }

    //book solution
    public static boolean isUniqueChars2(String str) {
        if (str.length() > 128) {
            return false;
        }
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) return false;
            char_set[val] = true;
        }
        return true;
    }

}
