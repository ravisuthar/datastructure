import java.util.HashMap;
import java.util.Map;

public class Duplicate {
    public static void main(String[] args) {

        //Given a string find out duplicate character and its count .
        //i/p- ”manojpandeyn”, o/p- a-2,n-2.

        String str = "m anojp andeyn";
        char[] chars = str.replace(" ","").toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char ch: chars){
            if(map.containsKey(Character.valueOf(ch))){
                Integer previousCount = map.get(ch);
                map.remove(ch);
                map.put(ch, ++previousCount);
            }else{
                map.put(ch, 1);
            }
        }

        map.entrySet()
                .stream()
                .filter( entry -> entry.getValue()>=2)
                .forEach( entry -> System.out.println(entry.getKey()+"-"+entry.getValue()));

    }
}
