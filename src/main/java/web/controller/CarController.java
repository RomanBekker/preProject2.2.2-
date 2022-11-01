package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.List;

import static web.service.CarService.createCars;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(defaultValue = "5", value = "count", required = false) int count) {
        List<Car> newCars = createCars();
        for (int i = createCars().size() - 1; i >= count; i--) {
            newCars.remove(i);
        }
        model.addAttribute("cars", newCars);
        return "cars";
    }
}
