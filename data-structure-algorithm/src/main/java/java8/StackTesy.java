package java8;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StackTesy {
    public static void main(String[] args) {

        List<StackWalker.StackFrame> stack = StackWalker.getInstance().walk(s ->
                s.limit(10).collect(Collectors.toList()));
        System.out.println(stack);
    }
}
