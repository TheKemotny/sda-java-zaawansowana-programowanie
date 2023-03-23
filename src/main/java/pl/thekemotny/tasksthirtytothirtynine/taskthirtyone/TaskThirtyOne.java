package pl.thekemotny.tasksthirtytothirtynine.taskthirtyone;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TaskThirtyOne {
    public static void countWords(String fileName) throws IOException {
        File file = new File("./src/main/java/pl/thekemotny/files/" + fileName + ".txt");
        final List<String> strings = Files.readAllLines(file.toPath());
        String  joinStrings = String.join("\n", strings);

        String[] splitString = joinStrings.split("\\W+");
        final String collect = Arrays.stream(splitString)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .map(stringLongEntry -> "K: " + stringLongEntry.getKey() + ", V: " + stringLongEntry.getValue())
                .collect(Collectors.joining("\n"));
        try(PrintWriter printWriter = new PrintWriter("./src/main/java/pl/thekemotny/files/result.txt")) {
            printWriter.write(collect);
        }
    }

    public static void main(String[] args) throws IOException {
        countWords("31");
    }
}
