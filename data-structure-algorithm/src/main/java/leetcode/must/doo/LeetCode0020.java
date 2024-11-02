package leetcode.must.doo;

import java.util.List;
import java.util.Stack;

/**
 * 20. Valid Parentheses
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 *
 * Example 1:
 *
 * Input: s = "()"
 * Output: true
 * Example 2:
 *
 * Input: s = "()[]{}"
 * Output: true
 *
 */
//https://leetcode.com/problems/valid-parentheses/
public class LeetCode0020 {

    public static void main(String[] args) {
        System.out.println(new LeetCode0020().isValid("]})"));
        System.out.println(new LeetCode0020().isValid("((())){}{}{}[][][{()}]"));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] braces = s.toCharArray();

        for(Character ch: braces){
            if(List.of('(', '{','[').contains(ch)){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                Character poped = stack.pop();//java.util.EmptyStackException on empty stack operation
                if(ch.equals(')') && List.of('{','[').contains(poped)) return false;
                if(ch.equals('}') && List.of('(','[').contains(poped)) return false;
                if(ch.equals(']') && List.of('(','{').contains(poped)) return false;
            }
        }

        return true;
    }


}
