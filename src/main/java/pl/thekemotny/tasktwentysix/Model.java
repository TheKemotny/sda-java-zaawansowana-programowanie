package pl.thekemotny.tasktwentysix;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public record Model(String name, int productionStartYear, List<Car> cars) {

}
