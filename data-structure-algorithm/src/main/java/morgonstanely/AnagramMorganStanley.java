package morgonstanely;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramMorganStanley {

    public static List<String> funWithAnagram(List<String> list) {

        Map<String, String> map = new HashMap<>();

        for(String word: list){

            char[] ch=word.toCharArray();
            Arrays.sort(ch);
            String sortedString = String.valueOf(ch);//code  cdeo

            if(!map.containsKey(sortedString)){
                map.put(sortedString, word);
            }
        }

        return map.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
    }

    public static List<String> funWithAnagramWithoutSort(List<String> list) {

        Map<String, String> map = new HashMap<>();

        for(String word: list){

           /* char[] ch=word.toCharArray();
            Arrays.sort(ch);
            String sortedString = String.valueOf(ch);*///code  cdeo

            char[] ch= new char[26];
            for(char c: word.toCharArray()){
                ch[c-'a']++;
            }
            String sortedString = String.valueOf(ch);

            if(!map.containsKey(sortedString)){
                map.put(sortedString, word);
            }
        }

        return map.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println(funWithAnagramWithoutSort(List.of("code", "aaagmnrs", "anagrams", "deco")));
    }
}
