package it.univaq.we.testSpringMysqlFreemarker.service;

import it.univaq.we.testSpringMysqlFreemarker.model.Car;
import it.univaq.we.testSpringMysqlFreemarker.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CarService implements ICarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public List<Car> getCars() {
        return carRepository.findAll();
    }
}
