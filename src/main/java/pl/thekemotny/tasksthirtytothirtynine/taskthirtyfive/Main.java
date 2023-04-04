package pl.thekemotny.tasksthirtytothirtynine.taskthirtyfive;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
