package java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

enum Gender {
    MALE,
    FEMALE
}

class Address {
    String city;

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(city, address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city);
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }
}

class Employee {
    int id;
    String name;
    int age;
    Gender gender;
    List<Address> addressList;

    public Employee(int id, String name, int age, Gender gender, List<Address> addressList) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.addressList = addressList;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && age == employee.age && Objects.equals(name, employee.name) && gender == employee.gender && Objects.equals(addressList, employee.addressList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, gender, addressList);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", addressList=" + addressList +
                '}';
    }
}

public class ParallelStream {

    public static void main(String[] args) {


        getList().stream().max(Comparator.comparing(Employee::getAge)).ifPresent(e -> System.out.println(e));

        Map<Gender, Long> collect = getList().stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(collect);

        getList().stream().count();


       /* long l = System.currentTimeMillis();
        Map<Gender, List<Employee>> collect = getList().stream().collect(Collectors.groupingBy(Employee::getGender));
        System.out.println(collect);
        collect=null;
        System.out.println( System.currentTimeMillis() - l);

        long l2 = System.currentTimeMillis();
        Map<Gender, List<Employee>> collect2 = getList().parallelStream().collect(Collectors.groupingBy(Employee::getGender));
         System.out.println(collect);
        collect2=null;
        System.out.println( System.currentTimeMillis() - l2);
        System.out.println(collect.equals(collect2));*/
    }


    static List<Employee> getList() {
        return IntStream.range(0, 1000)
                .mapToObj(i -> new Employee(i, "name-" + i, i, i % 2 == 0 ? Gender.MALE : Gender.FEMALE, List.of(new Address("Address-" + i))))
                .collect(Collectors.toList());
    }
}
