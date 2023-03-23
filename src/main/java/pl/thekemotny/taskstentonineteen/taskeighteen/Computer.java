package pl.thekemotny.taskstentonineteen.taskeighteen;

import java.util.Objects;

public class Computer {
    private String CPU;
    private int memory;
    private String GPU;
    private String manufacturer;
    private String model;

    public Computer(final String CPU, final int memory, final String GPU, final String manufacturer, final String model) {
        this.CPU = CPU;
        this.memory = memory;
        this.GPU = GPU;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(final String CPU) {
        this.CPU = CPU;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(final int memory) {
        this.memory = memory;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(final String GPU) {
        this.GPU = GPU;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(final String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(final String model) {
        this.model = model;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Computer computer)) {
            return false;
        }
        return getMemory() == computer.getMemory()
                && Objects.equals(getCPU(), computer.getCPU())
                && Objects.equals(getGPU(), computer.getGPU())
                && Objects.equals(getManufacturer(), computer.getManufacturer())
                && Objects.equals(getModel(), computer.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCPU(), getMemory(), getGPU(), getManufacturer(), getModel());
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", memory=" + memory +
                ", GPU='" + GPU + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
