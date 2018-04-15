package it.univaq.we.testSpringMysqlFreemarker.controller;

import it.univaq.we.testSpringMysqlFreemarker.model.Car;
import it.univaq.we.testSpringMysqlFreemarker.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CarController {

    @Autowired
    private ICarService carService;

    @RequestMapping("/cars")
    public ModelAndView cars(Model model) {

        List<Car> cars = carService.getCars();

        Map<String, Object> params = new HashMap<>();
        params.put("cars", cars);

        return new ModelAndView("carslist", params);
    }
}


