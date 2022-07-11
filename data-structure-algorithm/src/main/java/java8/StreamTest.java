package java8;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {

        /*System.out.println(Stream.iterate(0, i -> i+1)
                        .parallel()
                .limit(100_000_00)
                .reduce(0, Integer::sum));*/

        Stream.iterate(0, i-> i <20, i-> i+1)
                .peek(System.out::println);


    }
}
