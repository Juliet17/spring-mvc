package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private final List<Car> allCarsList;

    {
        allCarsList = new ArrayList<>();

        Car bmw = new Car("BMW", "Blue", 5);
        Car audi = new Car("Audi", "White", 4);
        Car mercedes = new Car("Mercedes", "Blue", 1);
        Car opel = new Car("Opel", "Black", 3);
        Car ferrari = new Car("Ferrari", "Red", 7);

        //List<Car> allCarsList = carService.allCarsList();

        allCarsList.add(bmw);
        allCarsList.add(audi);
        allCarsList.add(mercedes);
        allCarsList.add(opel);
        allCarsList.add(ferrari);

    }

//    List<Car> carsQty = carService.carCount(allCarsList, 3);
//        for (Car car : carsQty) {
//            System.out.println(car.getCarModel());
//            System.out.println(car.getCarColor());
//            System.out.println(car.getCarSeries());
//        }

    @Override
    public List<Car> allCarsList() {
        return allCarsList;
    }

    @Override
    public List<Car> carCount(List<Car> allCarsList, int count) {
        return new ArrayList<>(allCarsList.subList(0, count));
    }


}

