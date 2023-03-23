package pl.thekemotny.taskstwentytotwentynine.tasktwentyone;

public class Cone extends IShape3D {
    private final double r;
    private final double h;

    public Cone(final double r, final double h) {
        this.r = r;
        this.h = h;
    }

    public double getR() {
        return r;
    }

    public double getH() {
        return h;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public double area() {
        double l = Math.sqrt(r * r + h * h);
        return Math.PI * r * r + Math.PI * r * l;
    }

    @Override
    public double volume() {
        return Math.PI * r * r * h / 3;
    }
}
