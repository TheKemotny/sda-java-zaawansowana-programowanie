package pl.thekemotny;

import java.util.Map;

public class TaskThree {
    public static void printMap(Map<String, Integer> map) {
        map.forEach((key, value) -> System.out.printf("Klucz: %s, Wartość: %d,\n", key, value));
    }
}
