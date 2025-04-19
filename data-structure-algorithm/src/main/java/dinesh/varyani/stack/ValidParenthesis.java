package dinesh.varyani.stack;


//parenthesis
public class ValidParenthesis {

    private boolean isValid(String str) {
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char ch : chars) {
            if (ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
            } else {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.peep();
                if ((ch == ')' && top == '(')
                        || (ch == '}' && top == '{')
                        || (ch == ']' && top == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }


        }

        return stack.isEmpty();
    }



    //(){
    private boolean hasValidParenthesis(String str) {
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char ch : chars) {
            if (ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
            } else if (stack.isEmpty()) {
                return false;
            } else if (ch == ']') {
                char fromStack = stack.pop();
                if (fromStack != '[') {
                    return false;
                }
            } else if (ch == '}') {
                char fromStack = stack.pop();
                if (fromStack != '{') {
                    return false;
                }
            } else if (ch == ')') {
                char fromStack = stack.pop();
                if (fromStack != '(') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println(new ValidParenthesis().hasValidParenthesis("(){"));
        System.out.println(new ValidParenthesis().isValid("(){"));


       // System.out.println(new ValidParenthesis().hasValidParenthesis("(){}{}[]"));
      //  System.out.println(new ValidParenthesis().isValid("(){}{}[]"));


    }
}
