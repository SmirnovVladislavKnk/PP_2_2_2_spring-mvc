package web;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarApp {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("TESLA", 111, "ELECTRO"));
        cars.add(new Car("BMW", 222, "BENZ"));
        cars.add(new Car("LADA", 333, "BENZ"));
        cars.add(new Car("AUDI", 444, "DIESEL"));
        cars.add(new Car("KIA", 555, "BENZ"));
    }

    public List<Car> getCars() {
        return cars;
    }
}
