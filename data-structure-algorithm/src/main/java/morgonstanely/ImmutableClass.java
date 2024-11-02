package morgonstanely;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

final class Employee{
    private final int id;
    private final String name;
    private final Date dob;
    private final List<String> address;

    public Employee(int id, String name, Date dob, List<String> address) {
        this.id = id;
        this.name = name;
        this.dob = new Date(dob.getTime()); //create copy
        this.address = Collections.unmodifiableList(address);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        //return new Date(this.dob.getTime());
        return (Date)this.dob.clone(); //clone method
    }

    public List<String> getAddress() {
        return Collections.unmodifiableList(this.address);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", address=" + address +
                '}';
    }
}



public class ImmutableClass {
    public static void main(String[] args) {

        Date dob = new Date(System.currentTimeMillis());
        List<String> address = List.of("Mumbai", "Pune");
        Employee e = new Employee(1,"Ravi", dob, address);
        System.out.println(e);

        address = List.of("Vadodara", "Delhi", "Nasik");
        dob = new Date(System.currentTimeMillis());

        System.out.println(e);

    }
}
