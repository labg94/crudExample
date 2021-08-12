package com.example.crudexample.repository;

import com.example.crudexample.model.Car;

import java.util.List;
import java.util.Optional;

public interface CarRepository {


     Car findById(String id);
     void deleteById(String id);
     List<Car> findAll();
     Car update(Car carUpdated);

     Car save(Car car);

}
