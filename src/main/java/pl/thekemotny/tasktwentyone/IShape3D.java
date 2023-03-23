package pl.thekemotny.tasktwentyone;

import pl.thekemotny.tasktwenty.IShape;
import pl.thekemotny.tasktwentytwo.IFillable;

public abstract class   IShape3D implements IShape, IFillable {
    double volume() {
        return 0;
    }

    public void fill(final double amount) {
        final double volume = volume();
        if(amount < volume) {
            System.out.println("TOO LITTLE WATER");
        } else if (amount == volume) {
            System.out.println("JUST PERFECT AMOUNT OF WATER");
        } else {
            System.out.println("TOO MANY WATER");
        }
    }
}
