package pl.thekemotny.tasksthirtytothirtynine.taskthirtyfive;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
