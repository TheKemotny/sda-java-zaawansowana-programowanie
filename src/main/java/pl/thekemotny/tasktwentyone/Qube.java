package pl.thekemotny.tasktwentyone;

public class Qube extends IShape3D{
    private final double a;

    public Qube(final double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    public double perimeter() {
        return a*12;
    }

    @Override
    public double area() {
        return 6*a*a;
    }

    @Override
    public double volume() {
        return a*a*a;
    }
}
