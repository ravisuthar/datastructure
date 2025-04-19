package cracking.the.coding.interview.string;

import java.util.ArrayList;
import java.util.List;

public class ExtraChar {



        public static List<Integer> findRemovableIndices(String str1, String str2) {
            if (str1.length() != str2.length() + 1) {
                return List.of(-1);
            }

            List<Integer> indices = new ArrayList<>();
            int j = 0; // Pointer for str2

            for (int i = 0; i < str1.length(); i++) {
                if (j < str2.length() && str1.charAt(i) == str2.charAt(j)) {
                    j++;
                } else {
                    indices.add(i); // Store index of extra character
                }
            }

            return indices.size() == 1 || indices.stream().allMatch(i -> str1.charAt(i) == str1.charAt(indices.get(0))) ? indices : List.of(-1);
        }



    public static void main(String[] args) {

        System.out.println(findRemovableIndices("abdgggda", "abdggda"));
        System.out.println(findRemovableIndices("mmgghh", "mfggh"));
    }

    public static List<Integer> getRemovableIndices(String str1, String str2) {
        // Write your code here
        List<Integer> result = new ArrayList<>();

        if(null == str1 || null == str2){
            result.add(-1);
            return result;
        }

        // 'A' - 'A' =0
        // 'A' - 'B' != 0
        int[] array = new int[256]; // 0,0,0,0,0
        for(int i =0; i < str1.length(); i++){
            array[str1.charAt(i)]++; // 00000 +97, 0, 0
        }

        for(int i =0; i < str2.length(); i++){
            array[str2.charAt(i)]--; // 00000 -97, 0, 0
        }

        char ch = ' ';
        for(int i =0; i < array.length; i++){
            int temp = array[i];
            if(0!= temp){
                ch = (char)i;
            }
        }

        for(int i =0; i < str1.length(); i++){
            if(str1.charAt(i) == ch){
                result.add(i);
            }
        }

        return result;
    }





}
