package pl.thekemotny.taskstentonineteen.tasknineteen;

import pl.thekemotny.taskstentonineteen.taskeighteen.Computer;

import java.util.Objects;

public class Laptop extends Computer {
    private int batter;

    public Laptop(final String CPU, final int memory, final String GPU, final String manufacturer, final String model, final int batter) {
        super(CPU, memory, GPU, manufacturer, model);
        this.batter = batter;
    }

    public int getBatter() {
        return batter;
    }

    public void setBatter(final int batter) {
        this.batter = batter;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Laptop laptop)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        return getBatter() == laptop.getBatter();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getBatter());
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batter=" + batter +
                "} " + super.toString();
    }
}
