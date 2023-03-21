package pl.thekemotny.taskfour;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {
    private final Map<String, List<String>> map = new HashMap<>();

    public void addToStorage(String key, String value) {
        if(map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            map.put(key, new ArrayList<>(List.of(value)));
        }
    }

    public void printValues(String key) {
        System.out.println(map.get(key));
    }

    public void findKeys(String value) {
        System.out.println(map.entrySet().stream()
                .filter(entry -> entry.getValue().contains(value))
                .map(Map.Entry::getKey)
                .toList());
    }
}
