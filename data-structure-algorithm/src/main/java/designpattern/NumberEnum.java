package designpattern;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum NumberEnum {

    ONE {
        public String getString(int i) {
            return "one";
        }
    },
    TWO {
        public String getString(int i) {
            return "two";
        }
    },
    THREE {
        public String getString(int i) {
            return "three";
        }
    };

    public abstract String getString(int i);
}

class TestNumberEnum {
    public static void main(String[] args) {
        System.out.println(Stream.of(NumberEnum.values())
                .map(v -> v.getString(0))
                .collect(Collectors.toList()));
    }
}
