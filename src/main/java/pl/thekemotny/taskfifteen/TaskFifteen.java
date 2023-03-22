package pl.thekemotny.taskfifteen;

public class TaskFifteen {
    public static void main(String[] args) {
        Car car = Car.BMW;
        Car car1 = Car.FIAT;
        System.out.println(car.isFasterThan(car1));
    }
}
