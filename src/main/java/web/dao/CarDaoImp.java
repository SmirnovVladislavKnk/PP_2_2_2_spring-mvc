package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.CarApp;
import web.model.Car;

import java.util.List;

@Repository
public class CarDaoImp implements CarDao {
    private final CarApp carApp;

    @Autowired
    public CarDaoImp(CarApp carApp) {
        this.carApp = carApp;
    }

    @Override
    public int countCars(List<Car> cars) {
        return cars.size();
    }

    @Override
    public List<Car> getCars(int count) {
        return carApp.getCars().stream().limit(count).toList();
    }
}
