package dinesh.varyani.stack;

public class ReverseString {

    public static void main(String[] args) {

        String string="Ravi Suthar";
        char[] charArray=string.toCharArray();
        Stack<Character> stack= new Stack<>();

        for(Character ch: charArray){
            stack.push(ch);
        }

        String newString="";
        while(!stack.isEmpty()){
            Character ch =stack.pop();
            newString+=""+ch;
        }

        System.out.println(newString);
    }
}
