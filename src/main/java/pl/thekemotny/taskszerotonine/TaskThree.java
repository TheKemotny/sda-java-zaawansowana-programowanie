package pl.thekemotny.taskszerotonine;

import java.util.AbstractMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TaskThree {
    public static void printMap(Map<String, Integer> map) {
        final String collect = map.entrySet().stream()
                .map(entry -> "Key: " + entry.getKey() + ", Value: " + entry.getValue())
                .collect(Collectors.joining(",\n"));
        System.out.println(collect + ".");
    }

    public static void main(String[] args) {
        Map<String,Integer> mapOfSomething = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("java", 1),
                new AbstractMap.SimpleEntry<>("python",2),
                new AbstractMap.SimpleEntry<>("php",3),
                new AbstractMap.SimpleEntry<>("javascript",4),
                new AbstractMap.SimpleEntry<>("C++",5));
        printMap(mapOfSomething);
    }
}
