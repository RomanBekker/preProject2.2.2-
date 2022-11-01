package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    public static List<Car> createCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi", "blue", 120));
        cars.add(new Car("Bentley", "red", 140));
        cars.add(new Car("BMW", "yellow", 150));
        cars.add(new Car("SKODA", "white", 170));
        cars.add(new Car("LADA", "black", 200));
        return cars;
    }
}
