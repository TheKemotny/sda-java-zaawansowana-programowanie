package pl.thekemotny.taskszerotonine;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TaskTwo {
    public static List<String> sort(List<String> list) {
        return list.stream()
                .sorted(Comparator.comparing(s -> s, String.CASE_INSENSITIVE_ORDER.reversed()))
                .toList();
    }

    public static List<String> sort(String... args) {
        return Arrays.stream(args)
                .sorted(Comparator.comparing(s -> s, String.CASE_INSENSITIVE_ORDER.reversed()))
                .toList();
    }

    public static void main(String[] args) {
        System.out.println(TaskTwo.sort(List.of("A", "a", "z")));
    }
}
