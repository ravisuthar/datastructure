package java8;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Empl {
    int id;
    String name;

    public Empl(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Empl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class JPMC {

    public static void main(String[] args) {
        List<Empl> emp = List.of(new Empl(1, "A"), new Empl(1, "A"), new Empl(2, "B"));

        Map<Integer, Map<String, List<Empl>>> collect = emp.stream()
                .collect(Collectors.groupingBy(Empl::getId, Collectors.groupingBy(Empl::getName)));
       // System.out.println(collect);


        List<Integer> integers = List.of(1, 2, 2, 1, 1, 1,1,2,1);

        Map<Integer, Long> collect1 = integers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //System.out.println(collect1);

        //Map<Integer, Integer> collect2 = integers.stream().collect(Collectors.toMap(Function.identity(), Collectors.counting(), (old, newValue) -> newValue));
        //System.out.println(collect2);

        Map<Integer, Integer> map = new HashMap<>();
        for(int i: integers){
            if(map.containsKey(i)){
                map.put(i, (map.getOrDefault(i, 0))/2);
            }else{
                map.put(i, 1);
            }
        }

        //System.out.println(map);
    }
}
