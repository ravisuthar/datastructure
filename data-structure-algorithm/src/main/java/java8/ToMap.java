package java8;

import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


class Cust{
    int id;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cust cust = (Cust) o;
        return id == cust.id && Objects.equals(name, cust.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + Objects.hashCode(name);
        return result;
    }
}

public class ToMap {
    public static void main(String[] args) {

        //var collect = IntStream.range(0, 10).collect(Collectors.toMap(i -> i, v));


    }
}
