package dinesh.varyani.problems;

//123 -> 321
public class ReverseNumber {


    //does not support large number? - use long for large number.
    private static long reverse(int num) {

        boolean isNegative = false;
        if (num < 0) {
            isNegative = true;
            num = Math.abs(num);
        }

        long reverseNumber = 0;
        while (num > 0) {
            int reminder = num % 10;
            reverseNumber = reverseNumber * 10 + reminder;
            num = num / 10;
        }

        return isNegative ? -1 *reverseNumber : reverseNumber;
    }

    //negative number?
    //large number?
    public static void main(String[] args) {
        System.out.println(-123 + " ->" + reverse(-123));
        System.out.println(Integer.MAX_VALUE + " ->" + reverse(Integer.MAX_VALUE));
    }
}
