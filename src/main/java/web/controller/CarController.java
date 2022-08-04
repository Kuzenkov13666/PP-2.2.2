package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.ServiceCar;


@Controller
public class CarController {
    @Autowired
    private ServiceCar serviceCar;

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false,
            defaultValue = "5") Integer count, Model model) {
        model.addAttribute("cars", serviceCar.getCars());
        model.addAttribute("cars", serviceCar.getCountCars(count));
        return "cars";
    }


}
