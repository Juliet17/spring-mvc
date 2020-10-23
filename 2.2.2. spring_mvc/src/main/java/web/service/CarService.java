package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

    List<Car> allCarsList();
    List<Car> carCount (List<Car> allCarsList, int count);
}
