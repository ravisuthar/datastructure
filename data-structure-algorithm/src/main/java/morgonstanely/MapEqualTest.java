package morgonstanely;

import java.util.HashMap;
import java.util.Map;

class Student{
    String name;

    public Student(String name) {
        this.name = name;
    }
}
public class MapEqualTest {

    public static void main(String[] args) {
        Map<Student, String> map =new HashMap<>();
        map.put(new Student("Ravi"), "Ravi");
        map.put(new Student("Aarohi"), "Aarohi");
        map.put(new Student("Ritu"), "Ritu");

        System.out.println(map.get(new Student("Ravi")));
        System.out.println(map.get(new Student("Aarohi")));
        System.out.println(map.get(new Student("Ritu")));

    }
}
