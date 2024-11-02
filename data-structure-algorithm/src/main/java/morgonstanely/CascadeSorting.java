package morgonstanely;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class Emp{
    String firstName;
    String lastName;

    public Emp(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return Objects.equals(firstName, emp.firstName) && Objects.equals(lastName, emp.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Emp{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
public class CascadeSorting {
    public static void main(String[] args) {

        List<Emp> list = List.of(new Emp("Ravi", "Suthar"), new Emp("Narendra", "Modi"), new Emp("James", "Gosling"));
        System.out.println(list);

        List<Emp> sortedByFirstName = list.stream()
                .sorted((a,b) -> a.getFirstName().compareTo(b.getFirstName()))
                .collect(Collectors.toList());
        System.out.println(sortedByFirstName);

        List<Emp> sortedByFirstNameAndLastName = list.stream()
                .sorted(Comparator.comparing(Emp::getFirstName).thenComparing(Emp::getLastName))
                .collect(Collectors.toList());
        System.out.println(sortedByFirstNameAndLastName);
    }
}
