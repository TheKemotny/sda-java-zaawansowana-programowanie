package pl.thekemotny.tasksthirtytothirtynine.taskthirtyeight;

public class TaskThirtyEight {
    public static void main(String[] args) {
        CaffeMachine machine = new CaffeMachine();
        Thread brewThread = new Thread(() -> {
            while(true){
                machine.brew();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread secondBrewThread = new Thread(() -> {
            while(true){
                machine.brew();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread refillThread = new Thread(() -> {
            while (true) {
                machine.refillWater();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        brewThread.start();
        secondBrewThread.start();
        refillThread.start();
    }
}
