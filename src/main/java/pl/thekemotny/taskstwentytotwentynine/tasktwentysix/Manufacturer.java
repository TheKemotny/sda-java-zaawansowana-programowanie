package pl.thekemotny.taskstwentytotwentynine.tasktwentysix;

import java.util.List;

public record Manufacturer(String name, int yearOfCreation, List<Model> models) {
}
