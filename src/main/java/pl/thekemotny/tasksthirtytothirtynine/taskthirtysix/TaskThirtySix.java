package pl.thekemotny.tasksthirtytothirtynine.taskthirtysix;

public class TaskThirtySix {
    private static Thread thread1;
    private static Thread thread2;

    public static void main(String[] args) {
        thread1 = new Thread(new ThreadPlaygroundRunnable("ALA"));
        thread2 = new Thread(new ThreadPlaygroundRunnable("MA"));
        thread1.start();
        thread2.start();
    }
}
