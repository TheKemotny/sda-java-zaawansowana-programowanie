package pl.thekemotny.taskstentonineteen.taskfifteen;

public enum Car {
    FERRARI ("Ferrari", 1, 1),
    PORSCHE ("Porsche", 2, 2),
    MERCEDES ("Mercedes", 3, 3),
    BMW ("BMW", 4, 4),
    OPEL ("Opel", 5, 5),
    FIAT ("Fiat", 6, 6),
    TOYOTA ("Toyota", 7, 7);

    private final String name;
    private final int price;
    private final int horsePower;

    Car(final String name, final int price, final int horsePower) {
        this.name = name;
        this.price = price;
        this.horsePower = horsePower;
    }

    public boolean isPremium() {
        return switch (this) {
            case BMW, FERRARI, MERCEDES, PORSCHE -> true;
            default -> false;
        };
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public boolean isRegular() {
        return !isPremium();
    }

    public boolean isFasterThan(final Car car) {
        return car.horsePower < this.horsePower;
    }
}
