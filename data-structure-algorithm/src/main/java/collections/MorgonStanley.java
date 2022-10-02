package collections;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MorgonStanley {

    public static void main(String[] args) {

        List<String> list = List.of("Pune", "Mumbai", "Vadodara", "Banglore");

        List<WordCounter> output= list.stream()
                .filter(MyFilter.startsWithFilter("V"))
                .map(MyMapper.counterMapper())
                .collect(Collectors.toList());

        System.out.println(output);

    }
}

class MyFilter{
    public static Predicate<String> startsWithFilter(String input){
        return str -> str.startsWith(input);
    }
}

class MyMapper{
    public static Function<String, WordCounter> counterMapper(){
        return str -> {
            Set<Character> set = new HashSet<>();

            int count=0;
            for (char c : str.toCharArray()){
                if(set.add(c)){
                    count++;
                }
            }
            return new WordCounter(str, count);
        };
    }
}

class WordCounter{

   public String word;
    public int count;

    public WordCounter(String str, int count) {
        this.word=str;
        this.count=count;
    }

    @Override
    public String toString() {
        return "WordCounter{" +
                "word='" + word + '\'' +
                ", count=" + count +
                '}';
    }
}
