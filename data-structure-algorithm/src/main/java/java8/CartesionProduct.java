package java8;

import java.util.Arrays;
import java.util.List;

public class CartesionProduct {
    public static void main(String[] args) {
        List<Integer> a = List.of(1,2,3);
        List<Integer> b = List.of(4,5);

        a.forEach(aa -> b.stream().forEach(bb -> System.out.println(aa+", "+bb)));

        a.stream().flatMap(aa -> b.stream().map(bb -> new Integer[]{aa,bb})).forEach(cc -> System.out.println(Arrays.toString(cc)));
    }
}


