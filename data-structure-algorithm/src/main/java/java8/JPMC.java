package java8;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Empl {
    int id;
    String name;
    String dept;

    public Empl(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept=dept;
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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}

public class JPMC {

    public static void main(String[] args) {
        List<Empl> emp = List.of(new Empl(1, "A", "HR"), new Empl(1, "B", "HR"), new Empl(3, "B", "IT"));

        /*Map<Integer, Map<String, List<Empl>>> collect = emp.stream()
                .collect(Collectors.groupingBy(Empl::getId, Collectors.groupingBy(Empl::getName)));*/
        //System.out.println(collect);
        //Map<String, Empl> collect = emp.stream().collect(Collectors.toMap(Empl::getDept, Function.identity())); fail at run time,
        Map<String, List<Empl>> collect2 = emp.stream().collect(Collectors.groupingBy(Empl::getDept));

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
