package com.example.crudexample.service;

import com.example.crudexample.controller.dto.request.CarRequest;
import com.example.crudexample.model.Car;


import java.util.List;


public interface CarService {


    Car findById(String id);

    void deleteById(String id);

    List<Car> getAll();

    Car update(Car car1);

    Car create(Car example);

    Integer driveCar(String id, Integer kilometers);

}
