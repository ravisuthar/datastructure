package leetcode.must.doo;

import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/valid-parentheses/
public class LeetCode0020 {

    public static void main(String[] args) {
        System.out.println(new LeetCode0020().isValid("((())){}{}{}[][][{()}]"));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] braces = s.toCharArray();

        for(Character ch: braces){
            if(List.of('(', '{','[').contains(ch)){
                stack.push(ch);
            }else{
                Character poped = stack.pop();
                if(ch.equals(')') && List.of('{','[').contains(poped)) return false;
                if(ch.equals('}') && List.of('(','[').contains(poped)) return false;
                if(ch.equals(']') && List.of('(','{').contains(poped)) return false;
            }
        }

        return true;
    }


}
