package java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSum {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

        List<Person> list = List.of(new Person(1,"Ravi", 32), new Person(2, "Ritu",30));

        System.out.println(list.stream().mapToInt(Person::getAge).sum());
        System.out.println(list.stream().collect(Collectors.groupingBy(Person::getName, Collectors.summingInt(Person::getAge))));

    }
}

class Person{
    int id;
    String name;
    int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    int getAge(){
        return this.age;
    }
    String getName(){
        return this.name;
    }
}