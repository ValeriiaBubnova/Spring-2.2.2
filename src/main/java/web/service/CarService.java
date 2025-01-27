package web.service;


import org.springframework.stereotype.Service;
import web.model.CarModel;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private List<CarModel> cars;
    public CarService() {
        cars = new ArrayList<>();
        cars.add(new CarModel("BMW","Black",2020));
        cars.add(new CarModel("Audi","White",2019));
        cars.add(new CarModel("Honda","Red",2017));
        cars.add(new CarModel("Mercedes", "Blue",2024));
        cars.add(new CarModel("Ford","White",2008));
    }
    public List<CarModel> getCars(int count ) {
        if (count > cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }


}
