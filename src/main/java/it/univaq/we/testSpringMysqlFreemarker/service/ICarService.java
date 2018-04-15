package it.univaq.we.testSpringMysqlFreemarker.service;

import it.univaq.we.testSpringMysqlFreemarker.model.Car;

import java.util.List;

public interface ICarService {

    List<Car> getCars();
}