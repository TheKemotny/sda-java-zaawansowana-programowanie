package pl.thekemotny.taskstwentytotwentynine.tasktwentysix;

import java.util.Collection;
import java.util.List;

/*      1. listę wszystkich Modelów,
        2. listę wszystkich aut,
        3. listę wszystkich nazw producentów,
        4. listę wszystkich lat założenia producentów,
        5. listę wszystkich nazw modeli,
        6. listę wszystkich lat startu produkcji modeli,
        7. listę wszystkich nazw aut,
        8. listę wszystkich opisów aut,
        9. tylko modele z parzystym rokiem startu produkcji,
        10. tylko auta producentów z parzystym rokiem założenia,
        11. tylko auta z parzystym rokiem startu produkcji modelu oraz nieparzystym rokiem założenia producenta,
        12. tylko auta typu CABRIO z nieparzystym rokiem startu produkcji modelu i parzystym rokiem założenia producenta,
        13. tylko auta typu SEDAN z modelu nowszego niż 2019 oraz rokiem założenia producenta mniejszym niż 1919.*/
public class TaskTwentySix {
    public static void main(String[] args) {

        final List<Manufacturer> manufacturers = List.of(new Manufacturer("Audi", 2020, List.of(
                new Model("A4", 1991, List.of(
                        new Car("WORK", "fajny", CarType.CABRIO),
                        new Car("LOVER", "niefajny", CarType.COUPE)
                )),
                new Model("Q7", 2004, List.of(
                        new Car("HOME", "qwweq", CarType.HATCHBACK),
                        new Car("PERSONAL", "0", CarType.SEDAN)
                )))
        ), new Manufacturer("BWM", 2021, List.of(
                new Model("A5", 1992, List.of(
                        new Car("WIFE", "fajny", CarType.CABRIO),
                        new Car("KID NR. 1", "niefajny", CarType.COUPE)
                )),
                new Model("Q8", 2005, List.of(
                        new Car("KID NR. 2", "qwweq", CarType.HATCHBACK),
                        new Car("KID NR. 3", "0", CarType.SEDAN)
                )))));
        //1. listę wszystkich Modelów,
        manufacturers.stream()
                .map(Manufacturer::models)
                .flatMap(Collection::stream)
                .forEach(System.out::println);
        //2. listę wszystkich aut,
        manufacturers.stream()
                .map(Manufacturer::models)
                .flatMap(Collection::stream)
                .map(Model::cars)
                .flatMap(Collection::stream)
                .forEach(System.out::println);
        //3. listę wszystkich nazw producentów,
        manufacturers.stream()
                .map(Manufacturer::name)
                .forEach(System.out::println);
        //4. listę wszystkich lat założenia producentów,
        manufacturers.stream()
                .map(Manufacturer::yearOfCreation)
                .forEach(System.out::println);
        //5. listę wszystkich nazw modeli,
        manufacturers.stream()
                .map(Manufacturer::models)
                .flatMap(Collection::stream)
                .map(Model::name)
                .forEach(System.out::println);
        //6. listę wszystkich lat startu produkcji modeli,
        manufacturers.stream()
                .map(Manufacturer::models)
                .flatMap(Collection::stream)
                .map(Model::productionStartYear)
                .forEach(System.out::println);
        //7. listę wszystkich nazw aut,
        manufacturers.stream()
                .map(Manufacturer::models)
                .flatMap(Collection::stream)
                .map(Model::cars)
                .flatMap(Collection::stream)
                .map(Car::name)
                .forEach(System.out::println);
        //8. listę wszystkich opisów aut,
        manufacturers.stream()
                .map(Manufacturer::models)
                .flatMap(Collection::stream)
                .map(Model::cars)
                .flatMap(Collection::stream)
                .map(Car::description)
                .forEach(System.out::println);
        //9. tylko modele z parzystym rokiem startu produkcji,
        manufacturers.stream()
                .map(Manufacturer::models)
                .flatMap(Collection::stream)
                .filter(model -> model.productionStartYear() % 2 == 0)
                .map(Model::name)
                .forEach(System.out::println);
        //10. tylko auta producentów z parzystym rokiem założenia,
        manufacturers.stream()
                .filter(manufacturer -> manufacturer.yearOfCreation() % 2 == 0)
                .map(Manufacturer::name)
                .forEach(System.out::println);
        //11. tylko auta z parzystym rokiem startu produkcji modelu oraz nieparzystym rokiem założenia producenta,
        manufacturers.stream()
                .filter(manufacturer -> manufacturer.yearOfCreation() % 2 == 1)
                .map(Manufacturer::models)
                .flatMap(Collection::stream)
                .filter(model -> model.productionStartYear() % 2 == 0)
                .map(Model::cars)
                .flatMap(Collection::stream)
                .map(Car::name)
                .forEach(System.out::println);
        //12. tylko auta typu CABRIO z nieparzystym rokiem startu produkcji modelu i parzystym rokiem założenia producenta,
        manufacturers.stream()
                .filter(manufacturer -> manufacturer.yearOfCreation() % 2 == 0)
                .map(Manufacturer::models)
                .flatMap(Collection::stream)
                .filter(model -> model.productionStartYear() % 2 == 1)
                .map(Model::cars)
                .flatMap(Collection::stream)
                .filter(car -> car.carType().equals(CarType.CABRIO))
                .map(Car::name)
                .forEach(System.out::println);
        //13. tylko auta typu SEDAN z modelu nowszego niż 2019 oraz rokiem założenia producenta mniejszym niż 1919.
        manufacturers.stream()
                .filter(manufacturer -> manufacturer.yearOfCreation() < 1919)
                .map(Manufacturer::models)
                .flatMap(Collection::stream)
                .filter(model -> model.productionStartYear() > 2019)
                .map(Model::cars)
                .flatMap(Collection::stream)
                .filter(car -> car.carType().equals(CarType.SEDAN))
                .map(Car::name)
                .forEach(System.out::println);
    }
}
