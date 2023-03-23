package pl.thekemotny.tasksthirtytothirtynine.taskthirty;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.List;

public class TaskThirty {
    public static void readAndReverseWriteAFile(String fileName) throws IOException {
        File file = new File("./src/main/java/pl/thekemotny/files/" + fileName + ".txt");
        final List<String> strings = Files.readAllLines(file.toPath());
        String  joinStrings = String.join("\n", strings);
        StringBuilder stringBuilder = new StringBuilder(joinStrings);
        String reversedString = stringBuilder.reverse().toString();

        String newFileName = new StringBuilder(fileName).reverse().toString();
        try(PrintWriter printWriter = new PrintWriter("./src/main/java/pl/thekemotny/files/" + newFileName + ".txt")) {
            printWriter.write(reversedString);
        }
    }

    public static void main(String[] args) throws IOException {
        readAndReverseWriteAFile("30");
    }
}
