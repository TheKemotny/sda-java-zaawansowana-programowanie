package pl.thekemotny.taskstwentytotwentynine.tasktwenty;

public record Hexagon(double a) implements IShape{
    @Override
    public double perimeter() {
        return 3 * a * 6;
    }

    @Override
    public double area() {
        return 6 * a * a * Math.sqrt(3) / 4;
    }
}
