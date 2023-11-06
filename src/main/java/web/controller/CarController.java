package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.List;


@Controller
public class CarController {

    private final CarService carService;
    @Autowired
    public CarController(CarServiceImp carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getCars(Model model, @RequestParam(name = "count", defaultValue = "5") int count) {
        List<Car> cars = carService.getCarsByCount(count);
        model.addAttribute("cars", cars);
        return "car";
    }
    }

