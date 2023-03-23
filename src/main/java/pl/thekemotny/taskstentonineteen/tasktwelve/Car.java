package pl.thekemotny.taskstentonineteen.tasktwelve;

import java.util.List;

public record Car(String name, String model, double price, int yearOfProduction, List<Manufacturer> manufacturerList, EngineType engineType) {
}
