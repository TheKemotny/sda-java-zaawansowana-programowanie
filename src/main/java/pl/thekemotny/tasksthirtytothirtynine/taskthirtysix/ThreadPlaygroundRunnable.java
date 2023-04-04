package pl.thekemotny.tasksthirtytothirtynine.taskthirtysix;

public class ThreadPlaygroundRunnable implements Runnable{
    private final String message;

    public ThreadPlaygroundRunnable(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.printf("Thread: %s\tMessage: %s\tIteration: %d\n", Thread.currentThread().getName(), getMessage(), i);
        }
    }
}
