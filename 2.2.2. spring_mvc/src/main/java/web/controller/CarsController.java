package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;


@Controller
@RequestMapping(value = "/cars")
public class CarsController {

    @Autowired
    private CarServiceImpl carService;

    public CarsController(CarServiceImpl carService) {
        this.carService = carService;
    }


    @GetMapping
    public String carsPage (@RequestParam(value = "count", required = false) Integer count, ModelMap model) {

        if (count != null && count <= 5) {
            model.addAttribute("allCars", carService.carCount(carService.allCarsList(), count));
        } else {
            model.addAttribute("allCars", carService.allCarsList());
        }

        return "cars";
    }
}
