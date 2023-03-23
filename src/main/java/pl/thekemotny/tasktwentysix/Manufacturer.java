package pl.thekemotny.tasktwentysix;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public record Manufacturer(String name, int yearOfCreation, List<Model> models) {
}
