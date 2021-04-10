package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCars(Integer count) {
        List<Car> cars = new Car().get5Cars();
        if (count == null) {
            return cars;
        }

        return cars.stream().limit(count).collect(Collectors.toList());
    }
}