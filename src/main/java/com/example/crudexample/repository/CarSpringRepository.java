package com.example.crudexample.repository;

import com.example.crudexample.model.Car;
import com.example.crudexample.repository.dto.CarEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarSpringRepository extends MongoRepository<CarEntity, String> {
}