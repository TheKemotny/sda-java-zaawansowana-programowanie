package pl.thekemotny.tasknine;

import pl.thekemotny.taskeleven.IResizable;
import pl.thekemotny.taskten.IMovable;
import pl.thekemotny.taskten.MoveDirection;

import java.util.Objects;

public final class Circle implements IMovable, IResizable {
    private final Point2D center;
    private final Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    public double radius() {
        return Math.sqrt(Math.pow(point.x() - center.x(), 2) + Math.pow(point.y() - center.y(), 2));
    }

    public double area() {
        return Math.PI * Math.pow(radius(), 2);
    }

    public double perimeter() {
        return Math.PI * radius() * 2;
    }

    @Override
    public void move(final MoveDirection moveDirection) {
        point.move(moveDirection);
        center.move(moveDirection);
    }

    public Point2D center() {
        return center;
    }

    public Point2D point() {
        return point;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        var that = (Circle) obj;
        return Objects.equals(this.center, that.center) &&
                Objects.equals(this.point, that.point);
    }

    @Override
    public int hashCode() {
        return Objects.hash(center, point);
    }

    @Override
    public String toString() {
        return "Circle[" +
                "center=" + center + ", " +
                "point=" + point + ']';
    }

    @Override
    public void resize(final double resizeFactor) {

    }
}