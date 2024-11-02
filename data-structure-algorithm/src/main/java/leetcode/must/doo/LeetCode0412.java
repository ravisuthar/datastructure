package leetcode.must.doo;

//https://leetcode.com/problems/fizz-buzz/description/

/*
Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.

*/

public class LeetCode0412 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            boolean divisibleByThree = i % 3 == 0;
            boolean divisibleByFive = i % 5 == 0;

            if(divisibleByThree  && divisibleByFive){
                System.out.println("FizzBuzz");
            }else if (divisibleByThree){
                System.out.println("Fizz");
            }else if (divisibleByThree){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }

        }

    }
}
