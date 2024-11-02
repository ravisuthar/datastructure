package java8;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {

        /*System.out.println(Stream.iterate(0, i -> i+1)
                        .parallel()
                .limit(100_000_00)
                .reduce(0, Integer::sum));*/

      /*  Stream.iterate(0, i-> i <20, i-> i+1)
                .peek(System.out::println);*/

        String input = "apple:4;orange:6;mango:5;";

        Map<String, Serializable> collect = Arrays.stream(input.split("\\;"))
                .map(s -> s.split(":"))
                .peek(s -> System.out.println(Arrays.toString(s)))
                .collect(Collectors.toMap(key -> {
                            if (String.valueOf(key).matches("\\d+")) {
                                return String.valueOf(key);
                            }
                            return "";
                        },
                        value -> {
                            if (String.valueOf(value).matches(("-?\\d+"))) {
                                return value;
                            }
                            return 0;
                        }));

        System.out.println(collect);

    }
}
