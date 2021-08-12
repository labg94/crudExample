package com.example.crudexample.service;

import com.example.crudexample.model.Car;
import com.example.crudexample.repository.CarRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;


import java.util.List;


@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;


    @Override
    public Car findById(String id) {
        return carRepository.findById(id);
    }

    @Override
    public void deleteById(String id) {
        findById(id);
        carRepository.deleteById(id);
    }


    @Override
    public List<Car> getAll() {
        return carRepository.findAll();
    }

    @Override
    public Car update(Car car) {
        findById(car.getId());
        return create(car);
    }

    @Override
    public Car create(Car example) {
        return carRepository.save(example);
    }

    @Override
    public Integer driveCar(String id, Integer kilometers) {

        Car byId = findById(id);

        byId.logDriving(kilometers);

        return update(byId).getKilometers();

    }
}