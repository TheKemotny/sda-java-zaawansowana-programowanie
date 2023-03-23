package pl.thekemotny.taskstwentytotwentynine.tasktwenty;

public record Rectangle(double a, double b) implements IShape{

    @Override
    public double perimeter() {
        return a * 2 + b * 2;
    }

    @Override
    public double area() {
        return a * b;
    }
}
