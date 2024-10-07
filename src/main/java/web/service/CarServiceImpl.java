package web.service;


import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> carCount(int count) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Bentley", 2018, 130_500));
        list.add(new Car("RolceRoyce", 2020, 100_000));
        list.add(new Car("Ferrari", 2015, 130_400));
        list.add(new Car("BMW", 2016, 120_000));
        list.add(new Car("VW", 2022, 20_000));

        if (count > 5) {
            return list;
        } else {
            return list.stream().limit(count).collect(Collectors.toList());
        }
    }

}
