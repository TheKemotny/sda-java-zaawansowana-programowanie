package pl.thekemotny.tasksthirtytothirtynine.taskthirtyeight;

public class CaffeMachine {
    private double waterLevel = 1.5d;

    public double getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(final double waterLevel) {
        this.waterLevel = waterLevel;
    }

    public synchronized void refillWater() {
        if(waterLevel > 0.33d) {
            System.out.println("REFILL WATER - WAIT" + waterLevel);
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("REFILL WATER");
            waterLevel = 1.5d;
            notifyAll();
        }
    }

    public synchronized void brew() {
        if(waterLevel > 0) {
            System.out.println("CAFFE IS MADE " + waterLevel);
            waterLevel -= 0.33d;
            notifyAll();
        } else {
            System.out.println("WAITING FOR WATER");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
