package pl.thekemotny;

import java.util.AbstractMap;
import java.util.Map;
import java.util.TreeMap;

public class TaskSix {
    public static void firstAndLast(Map<?, ?> map) {
        firstAndLast(new TreeMap<>(map));
    }

    private static void firstAndLast(TreeMap<?, ?> map) {
        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());
    }

    public static void main(String[] args) {
        Map<String,Integer> mapOfSomething = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("java", 1),
                new AbstractMap.SimpleEntry<>("python",2),
                new AbstractMap.SimpleEntry<>("php",3),
                new AbstractMap.SimpleEntry<>("javascript",4),
                new AbstractMap.SimpleEntry<>("C++",5));
        firstAndLast(mapOfSomething);
    }
}
