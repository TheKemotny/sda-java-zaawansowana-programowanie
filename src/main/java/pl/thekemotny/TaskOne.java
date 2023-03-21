package pl.thekemotny;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TaskOne {
    public static List<String> sort(List<String> list) {
        return list.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
    }

    public static List<String> sort(String... args) {
        return Arrays.stream(args)
                .sorted(Comparator.reverseOrder())
                .toList();
    }
}