package morgonstanely;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Employees{

    private int empId;
    private String name;

    public Employees(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        Employees employee = (Employees) o;
        return empId == employee.empId;
    }

    @Override
    public int hashCode() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                '}';
    }
}
public class AmolKatakkar {
    public static void main(String[] args) {

        Map<Employees, Integer> map = new HashMap<>();
        Employees e= new Employees(1, "Ravi");
        map.put(e, 1);
        e.setEmpId(2);

        System.out.println(map.get(e));


    }

}
