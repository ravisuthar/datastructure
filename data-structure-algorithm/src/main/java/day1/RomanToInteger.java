package day1;

//https://leetcode.com/problems/roman-to-integer/description/
public class RomanToInteger {
    public static void main(String[] args) {


       /* I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000*/

        //IV
        String value = "XC";
        int ans = 0;
        int num = 0;
        for (int i = value.length() - 1; i >= 0; i--) {
            switch (value.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }

        /** Why Multiply by 4?
         The multiplication by 4 ensures that when a smaller numeral is placed before a larger one, we can detect when to subtract. Here's why:

         When num is small (like I = 1), and it's placed before a large numeral (like V = 5), 4 * num = 4. This is still smaller than ans = 5 (from V), so subtraction should occur.
         For larger numerals, such as X = 10 before L = 50, we again use the rule that 4 * num = 40 is smaller than ans = 50, signaling that we should subtract.
         In all valid cases for subtraction, multiplying num by 4 ensures that num is still smaller than ans (the larger numeral). This heuristic works because Roman numerals follow strict patterns where smaller values (1, 10, 100) are always placed before values at least 5 times larger (5, 50, 500) for subtraction.

         Example Breakdown:
         IV (4):

         I = 1 and V = 5.
         4 * 1 = 4, which is less than 5, so we subtract 1 from 5.
         XC (90):

         X = 10 and C = 100.
         4 * 10 = 40, which is less than 100, so we subtract 10 from 100.
         By multiplying by 4, the code can efficiently detect whether the current numeral should be subtracted from the running total (instead of added). It works because Roman numerals only use specific patterns for subtraction, and those patterns always involve the smaller numeral being at least 5 times smaller than the larger one.
         */
            if (4 * num < ans) {
                ans = ans - num;
            } else {
                ans = ans + num;
            }
        }
        System.out.println(ans);

    }
}
