package pl.thekemotny.tasksixteen;

public enum Runner {
    BEGINNER(5),
    INTERMEDIATE(3),
    ADVANCED(1);
    private final double maximumMinutes;

    Runner(final double maximumMinutes) {
        this.maximumMinutes = maximumMinutes;
    }

    public double getMaximumMinutes() {
        return maximumMinutes;
    }

    public static Runner getFitnessLevel(final double time) {
        if (time > BEGINNER.maximumMinutes) {
            return BEGINNER;
        }
        if (time > INTERMEDIATE.maximumMinutes) {
            return INTERMEDIATE;
        }
        return ADVANCED;
    }
}
