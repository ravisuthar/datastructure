package morgonstanely;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringSubstring {
    public static void main(String[] args) {


        String str ="00110";
        List<String> list =new ArrayList<>();
        for(int i=0;i<str.length();i++){

            int left=0;
            int right=1;

            while(right <str.length()){
                String subString = str.substring(left, right);
                if(subString.contains("0")
                && subString.contains("1")
                && occuranace(subString, "1")==occuranace(subString, "0"))
                {
                    System.out.println(subString);
                    list.add(subString);
                }
                right++;
            }

        }



    }

    private static int occuranace(String str, String target) {
        char[] c= str.toCharArray();
        int count=0;
        for(int i=0;i<str.length();i++){
           if(target.contains(c[i]+"")){
               count++;
           }
        }

        return count;
    }
}
