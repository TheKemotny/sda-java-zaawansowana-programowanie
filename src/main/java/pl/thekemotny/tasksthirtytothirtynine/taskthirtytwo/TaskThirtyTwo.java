package pl.thekemotny.tasksthirtytothirtynine.taskthirtytwo;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TaskThirtyTwo {

    public static List<Car> readFromFile() throws FileNotFoundException {
        File file = new File("./src/main/java/pl/thekemotny/files/car.json");
        JSONTokener jsonTokener = new JSONTokener(new FileInputStream(file));
        JSONArray jsonArray = new JSONArray(jsonTokener);
        List<Car> cars = new ArrayList<>();
        for(int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            final String brand = jsonObject.getString("brand");
            final String model = jsonObject.getString("model");
            final int yearOfProduction = jsonObject.getInt("yearOfProduction");
            Car car = new Car(brand, model, yearOfProduction);
            cars.add(car);
        }
        return cars;
    }

    public static void saveCar(Car... cars) throws FileNotFoundException {
        JSONArray jsonArray = new JSONArray();
        for(Car car: cars) {
            JSONObject jsonObject = new JSONObject()
                    .put("brand", car.brand())
                    .put("model", car.model())
                    .put("yearOfProduction", car.yearOfProduction());
            jsonArray.put(jsonObject);
        }
        PrintWriter printWriter = new PrintWriter("./src/main/java/pl/thekemotny/files/car.json");
        printWriter.println(jsonArray.toString(2));
        printWriter.close();
    }

    public static void saveCar(List<Car> cars) throws FileNotFoundException {
        saveCar(cars.toArray(new Car[0]));
    }

    public static void main(String[] args) throws FileNotFoundException {
        List<Car> cars = List.of(new Car("OPEL", "ZAFIRA", 2003),
                new Car("FORD", "MUSTANG", 1971));
        saveCar(cars);
        System.out.println(readFromFile());
    }
}
