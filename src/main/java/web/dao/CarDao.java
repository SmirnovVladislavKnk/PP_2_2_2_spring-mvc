package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    int countCars(List<Car> cars);
    List<Car> getCars(int count);

}
