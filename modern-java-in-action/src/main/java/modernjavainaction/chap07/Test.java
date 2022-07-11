package modernjavainaction.chap07;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<Integer> list = List.of(1, 2, 3, 4, 5);

        System.out.println(LocalDateTime.now());
        System.out.println(list.stream().parallel().map(item -> CompletableFuture.supplyAsync(() -> {
                    return getDouble(item);
                }))
                .map(CompletableFuture::join)
                .collect(Collectors.toList()));
        System.out.println(LocalDateTime.now());
    }

    private static int getDouble(int n) {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {

        }
        return n * 2;
    }
}
