package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ServiceCarImp implements ServiceCar {
    private List<Car> cars;

    @Override
    public List<Car> getCars() {
        cars = new ArrayList<>();
        cars.add(new Car("KIA", "CERATO", "M523BM"));
        cars.add(new Car("Mazda", "6", "K767XM"));
        cars.add(new Car("BMW", "X6", "E777BC"));
        cars.add(new Car("Volvo", "S60", "M543BM"));
        cars.add(new Car("Mercedes", "E 200", "E200AB"));
        return cars;
    }

    @Override
    public List<Car> getCountCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
