package pl.thekemotny.taskstentonineteen.taskthirteen;

//            zwracanie listy aut wyprodukowanych przez producenta z rokiem założenia <,>,<=,>=,=,!= od podanego.

import pl.thekemotny.taskstentonineteen.tasktwelve.Car;
import pl.thekemotny.taskstentonineteen.tasktwelve.EngineType;
import pl.thekemotny.taskstentonineteen.tasktwelve.Manufacturer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class CarService {
    private final List<Car> listOfCars = new ArrayList<>();

    public void add(Car car) {
        listOfCars.add(car);
    }

    public List<Car> getListOfCars() {
        return new ArrayList<>(listOfCars);
    }

    public List<Car> getListOfCarsWithEngineType(EngineType engineType) {
        return listOfCars.stream()
                .filter(car -> car.engineType().equals(engineType))
                .toList();
    }

    public List<Car> getListOfCarsBeforeYear(int yearOfProduction) {
        return listOfCars.stream()
                .filter(car -> car.yearOfProduction() < yearOfProduction)
                .toList();
    }

    public Optional<Car> getMostExpensiveCar() {
        return listOfCars.stream()
                .max(Comparator.comparingDouble(Car::price));
    }

    public Optional<Car> getCheapestCar() {
        return listOfCars.stream()
                .min(Comparator.comparingDouble(Car::price));
    }

    public List<Car> getCarsWithCertainNumberOfManufactures(int numberOfManufactures) {
        return listOfCars.stream()
                .filter(car -> car.manufacturerList().size() >= numberOfManufactures)
                .toList();
    }

    public List<Car> getSortedList(Comparator<Car> carComparator) {
        return listOfCars.stream()
                .sorted(carComparator)
                .toList();
    }

    public boolean isCarPresent(Car car) {
        return listOfCars.contains(car);
    }

    public List<Car> getListOfCarsFromCertainManufacturer(Manufacturer manufacturer) {
        return listOfCars.stream()
                .filter(car -> car.manufacturerList().contains(manufacturer))
                .toList();
    }

    public List<Car> getListOfCarsByManufacturerYearOfFunding(Predicate<Integer> predicate) {
        return listOfCars.stream()
                .filter(car -> car.manufacturerList().stream()
                        .anyMatch(manufacturer -> predicate.test(manufacturer.yearOfFunding())))
                .toList();
    }
}
