package pl.thekemotny;

import pl.thekemotny.taskthirteen.CarService;
import pl.thekemotny.tasktwelve.Car;
import pl.thekemotny.tasktwelve.EngineType;
import pl.thekemotny.tasktwelve.Manufacturer;
import pl.thekemotny.tasktwentythree.Zoo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Manufacturer manufacturer = new Manufacturer("", 2020, "PL");
        Manufacturer manufacturer1 = new Manufacturer("1", 2021, "DE");
        Manufacturer manufacturer2 = new Manufacturer("2", 2023, "GE");
        List<Manufacturer> list = List.of(manufacturer, manufacturer1);
        List<Manufacturer> list1 = List.of(manufacturer, manufacturer1, manufacturer2);
        Car car = new Car("", "", 10, 1998, list, EngineType.V8);
        Car car1 = new Car("A", "a", 11, 2000, list1, EngineType.S3);
        CarService carService = new CarService();
        carService.add(car);
        carService.add(car1);
        System.out.println(carService.getListOfCars());
        System.out.println(carService.getListOfCarsWithEngineType(EngineType.S3));
        System.out.println(carService.getListOfCarsBeforeYear(1999));
        System.out.println(carService.getMostExpensiveCar());
        System.out.println(carService.getCheapestCar());
        System.out.println(carService.getCarsWithCertainNumberOfManufactures(3));
        System.out.println(carService.getSortedList(new Comparator<Car>() {
            @Override
            public int compare(final Car o1, final Car o2) {
                return Integer.compare(o1.yearOfProduction(), o2.yearOfProduction());
            }
        }));
        System.out.println(carService.isCarPresent(car));
        System.out.println(carService.getListOfCarsFromCertainManufacturer(manufacturer2));
        Zoo zoo = new Zoo();
        zoo.addAnimals("DOG", 100);
        zoo.addAnimals("CAT", 50);
        zoo.addAnimals("RABBIT", 123153);
        System.out.println(zoo.getAnimalsCountSorted());
    }
}