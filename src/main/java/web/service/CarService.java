package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class CarService {

    Car car1 = new Car("Audi", "blue", 120);
    Car car2 = new Car("Bentley", "red", 140);
    Car car3 = new Car("BMW", "yellow", 150);
    Car car4 = new Car("SKODA", "white", 170);
    Car car5 = new Car("LADA", "black", 200);

    List<Car> cars = Stream.of(car1, car2, car3, car4, car5).collect(Collectors.toCollection(ArrayList::new));

    public List<Car> createCars(int count) {
        return count <= 5 ? cars.subList(0, count) : cars;
    }
}
