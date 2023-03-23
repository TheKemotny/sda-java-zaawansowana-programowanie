package pl.thekemotny.taskszerotonine.tasknine;

import pl.thekemotny.taskstentonineteen.taskten.IMovable;
import pl.thekemotny.taskstentonineteen.taskten.MoveDirection;

import java.util.Objects;

public final class Point2D implements IMovable {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(final MoveDirection moveDirection) {
        x = x + moveDirection.x();
        y = y + moveDirection.y();
    }

    public double x() {
        return x;
    }

    public double y() {
        return y;
    }

    public void setX(final double x) {
        this.x = x;
    }

    public void setY(final double y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        var that = (Point2D) obj;
        return Double.doubleToLongBits(this.x) == Double.doubleToLongBits(that.x) &&
                Double.doubleToLongBits(this.y) == Double.doubleToLongBits(that.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point2D[" +
                "x=" + x + ", " +
                "y=" + y + ']';
    }
}
