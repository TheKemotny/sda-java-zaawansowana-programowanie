package pl.thekemotny.taskstwentytotwentynine.tasktwentnyseven;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Joiner<T> {
    private final String joiner;

    public Joiner(final String joiner) {
        this.joiner = joiner;
    }

    public String join(T... t) {
        return Arrays.stream(t)
                .map(Object::toString)
                .collect(Collectors.joining(joiner));
    }
}
