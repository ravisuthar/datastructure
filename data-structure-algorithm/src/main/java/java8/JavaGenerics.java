package java8;

import java.util.ArrayList;
import java.util.List;

public class JavaGenerics {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        List<Object> nList = (List<Object>) ((List<?>) list);
        nList.add("Three");

        System.out.println(nList);
    }

}
