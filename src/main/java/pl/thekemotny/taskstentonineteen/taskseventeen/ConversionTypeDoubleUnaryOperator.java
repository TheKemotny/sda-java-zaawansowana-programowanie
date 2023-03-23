package pl.thekemotny.taskstentonineteen.taskseventeen;

import java.util.function.DoubleUnaryOperator;

public enum ConversionTypeDoubleUnaryOperator {
    METERS_TO_YARDS(value -> value * 1.0936133),
    YARDS_TO_METERS(value -> value / 1.0936133),
    CENTIMETERS_TO_INCHES(value -> value * 0.3937007874),
    INCHES_TO_CENTIMETERS(value -> value / 0.3937007874),
    KILOMETERS_TO_MILES(value -> value * 0.6213711922),
    MILES_TO_KILOMETERS(value -> value / 0.6213711922);
    private final DoubleUnaryOperator doubleUnaryOperator;

    ConversionTypeDoubleUnaryOperator(final DoubleUnaryOperator doubleUnaryOperator) {
        this.doubleUnaryOperator = doubleUnaryOperator;
    }

    public DoubleUnaryOperator getDoubleUnaryOperator() {
        return doubleUnaryOperator;
    }
}
