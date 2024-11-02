package neetcode.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_EncodeAndDecodeString {




    public static void main(String[] args) {

        String[] arr = new String[]{"RaviPrasadS#harm#a", "Suth#ar"};
        System.out.println(encode(arr));
        System.out.println(Arrays.toString(decode(encode(arr))));
    }

    private static String[] decode(String string) {
        List<String> list = new ArrayList<>();

        int i=0;//0
        while(i< string.length()){
            int j=i; //0
            while(string.charAt(j)!='#') j++;//1
            int length = Integer.valueOf(string.substring(i, j));
            i=j+1+length;
            String subString = string.substring(j+1, i);
            list.add(subString);
        }

        return list.stream().toArray(s -> new String[s]);
    }

    private static String encode(String[] strings) {
        StringBuilder sb = new StringBuilder();
        for (String s: strings) {
            sb.append(s.length()).append("#").append(s);
        }

        return sb.toString();
    }
}
