package java8;

import java.util.function.Function;
import java.util.function.Predicate;

public class DataTypes {
    public static void main(String[] args) {

        System.out.println(fun.apply("Ravi"));

    }


    static Function<String, String> fun = s -> s.toLowerCase();

    public boolean pred(String s ){
        return s.equals("Hi");
    }

    Predicate<String> pred = s -> s.equals("Hello");


    public void print() {
        System.out.println(0F/0F);
        System.out.println(0.0/0.0);
        System.out.println(100/0.0);
        System.out.println(100/-0.0);
        System.out.println(-100/0.0);
        System.out.println(0.0/100);

        System.out.println("&&"); //false
        System.out.println(false && false); //false
        System.out.println(false && true); //false
        System.out.println(true && false); //false
        System.out.println(true && true); //true

        System.out.println("||"); //false
        System.out.println(false || false); //false
        System.out.println(false || true); //true
        System.out.println(true || false); //true
        System.out.println(true || true); //true


        System.out.println("&"); //false
        System.out.println(false & false); //false
        System.out.println(false & true); //false
        System.out.println(true & false); //false
        System.out.println(true & true); //true

        System.out.println("|"); //false
        System.out.println(false | false); //false
        System.out.println(false | true); //true
        System.out.println(true | false); //true
        System.out.println(true | true); //true

    }
}
