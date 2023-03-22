package pl.thekemotny.taskFourteen;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//            Zaimplementuj metodę, która deduplikuje elementy w liście. W przypadku znalezienia duplikatu,
//            zastępuje go nową losową wcześniej nie występującą wartością.
//            Sprawdź czy metoda zadziałała poprawnie wywołując metodę numer 2.

public class TaskFourteen {
    private static final Random RANDOM = new Random();
    private final int size;
    private final int bound;
    private List<Integer> listOfNumbers = new ArrayList<>();

    public TaskFourteen() {
        this.size = 100_000;
        this.bound = 50_000;
    }

    public TaskFourteen(final int size, final int bound) {
        this.size = size;
        this.bound = bound;
    }

    public int getSize() {
        return size;
    }

    public int getBound() {
        return bound;
    }

    public void generateNewRandomNumbers() {
        listOfNumbers = Stream.generate(() -> RANDOM.nextInt(getBound()))
                .limit(size).toList();
    }

    public List<Integer> getDistinctNumbers() {
        return listOfNumbers.stream()
                .distinct()
                .toList();
    }

    private Map<Integer, Long> getRepeatsOfNumbers() {
        return listOfNumbers.stream()
                .collect(Collectors.groupingBy(integer -> integer, Collectors.counting()));
    }
    public List<Integer> getNumbersThatRepeatMoreThan(int numberOfRepeats) {
        final Map<Integer, Long> repeatOfNumbers = getRepeatsOfNumbers();
        return repeatOfNumbers.entrySet().stream()
                .filter(integerLongEntry -> integerLongEntry.getValue() > numberOfRepeats)
                .map(Map.Entry::getKey)
                .toList();
    }

    public List<Integer> getTwentyFiveNumbersThatRepeatThemselfTheMost() {
        final Map<Integer, Long> repeatOfNumbers = getRepeatsOfNumbers();
        return repeatOfNumbers.entrySet().stream()
                .sorted((o1, o2) -> Long.compare(o2.getValue(), o1.getValue()))
                .map(Map.Entry::getKey)
                .toList();
    }

    public List<Integer> deduplicate() {
        Set<Integer> set = new HashSet<>(listOfNumbers);
        while (set.size() < getSize()) {
            set.add(RANDOM.nextInt(getBound()));
        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        TaskFourteen task = new TaskFourteen();
        task.generateNewRandomNumbers();
        System.out.println(task.deduplicate().size());
    }
}
