package java8;

import java.util.List;

public class StreamFindFirst {

    public static void main(String[] args) {

        List<String> name= List.of("Ravi");

        name.stream().map(na -> {
            if(!na.equals("Hello")) {
                throw new RuntimeException("not same");
            }
                return na;
            }

                )
                .findFirst()
                .orElseThrow(()-> new RuntimeException("eXce"));
    }
}
