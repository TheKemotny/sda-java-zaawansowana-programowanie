package pl.thekemotny.taskszerotonine.twentynine;

import java.util.Arrays;
import java.util.function.Predicate;

public class TwentyNine {
    @SafeVarargs
    public static <T> double partOf(Predicate<T> predicate, T... ts) {
        final long count = Arrays.stream(ts)
                .filter(predicate)
                .count();
        return 1.0 * count / ts.length;
    }
}