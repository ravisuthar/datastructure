package java8;

import java.util.ArrayList;
import java.util.List;

class E {
    int id;
    String name;
    Long salary;

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

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public E(int id, String name, Long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "E{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class SortByNameThanSalary {
    public static void main(String[] args) {

        List<E> list = new ArrayList<>();
        list.add(new E(1, "ABC", 1000L));
        list.add(new E(3, "FGH", 990L));
        list.add(new E(2, "DEF", 990L));
        list.add(new E(4, "JHK", 800L));
        list.add(new E(5, "BNM", 700L));

       /* list.stream().sorted((a,b) -> {
            if(a.salary==b.salary){
                return a.name.compareTo(b.name);
            }else{
                return a.salary.compareTo(b.salary);
            }
        }).limit(3).forEach(System.out::println);*/

      /*  list.stream().sorted(Comparator.comparing(E::getSalary).reversed())
                .limit(3).forEach(System.out::println);*/

        list.stream().sorted((a, b) -> {
                    if (a.getSalary().equals(b.getSalary())) {
                        return a.getName().compareTo(b.getName());
                    } else {
                        return a.getSalary().compareTo(b.getSalary());
                    }
                })
                .limit(3).forEach(System.out::println);
    }
}
