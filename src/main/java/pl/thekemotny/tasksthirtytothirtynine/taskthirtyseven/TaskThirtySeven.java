package pl.thekemotny.tasksthirtytothirtynine.taskthirtyseven;

import pl.thekemotny.tasksthirtytothirtynine.taskthirtysix.ThreadPlaygroundRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskThirtySeven {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(10)) {
                for (int i = 0; i < 10; i++) {
                    service.submit(new ThreadPlaygroundRunnable("AOASF" + i));
                }
        }
    }
}
