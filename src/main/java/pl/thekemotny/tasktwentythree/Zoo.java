package pl.thekemotny.tasktwentythree;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class Zoo {
    private final Map<String, Integer> animals = new HashMap<>();

    public int getNumberOfAllAnimals() {
        return animals.values().stream()
                .mapToInt(value -> value)
                .sum();
    }

    public Map<String, Integer> getAnimalsCount() {
        return new HashMap<>(animals);
    }

    public Map<String, Integer> getAnimalsCountSorted() {
        return animals.entrySet().stream()
                .sorted((o1, o2) -> Integer.compare(o2.getValue(), o1.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public void addAnimals(String species, int amountOfAnimals) {
        if(animals.containsKey(species)) {
            animals.put(species, animals.get(species) + amountOfAnimals);
        } else {
            animals.put(species, amountOfAnimals);
        }
    }
}
