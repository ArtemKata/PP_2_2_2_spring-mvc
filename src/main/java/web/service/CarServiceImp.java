package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("Toyota", "Camry", 2022));
        carList.add(new Car("Honda", "Civic", 2021));
        carList.add(new Car("Ford", "Focus", 2020));
        carList.add(new Car("Nissan", "Altima", 2019));
        carList.add(new Car("Chevrolet", "Malibu", 2018));
    }

    @Override
    public List<Car> getCarsByCount(int count) {
        if(count <= carList.size()) {
            return carList.subList(0, count);
        } else {
            return carList;
        }
    }
}
