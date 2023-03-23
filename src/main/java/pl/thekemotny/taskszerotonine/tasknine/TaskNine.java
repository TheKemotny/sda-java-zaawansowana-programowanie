package pl.thekemotny.taskszerotonine.tasknine;

import pl.thekemotny.taskstentonineteen.taskten.MoveDirection;

public class TaskNine {
    public static void main(String[] args) {
        Point2D center = new Point2D(0,0);
        Point2D point = new Point2D(3,4);
        Circle circle = new Circle(center, point);
        System.out.println(circle);
        circle.move(new MoveDirection(1,1));
        System.out.println(circle);
        circle.resize(0.5);
        System.out.println(circle.radius());
        System.out.println(circle.area());
        System.out.println(circle.perimeter());
    }
}