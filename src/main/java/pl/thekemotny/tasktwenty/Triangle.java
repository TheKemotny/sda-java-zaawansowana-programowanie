package pl.thekemotny.tasktwenty;

public record Triangle(double a) implements IShape{
    @Override
    public double perimeter() {
        return 3 * a;
    }

    @Override
    public double area() {
        return a * a * Math.sqrt(3) / 4;
    }
}
