package it.univaq.we.testSpringMysqlFreemarker.repository;

import it.univaq.we.testSpringMysqlFreemarker.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {

    public List<Car> findAll();
}
