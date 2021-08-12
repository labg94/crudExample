package com.example.crudexample.repository.mapper;

import com.example.crudexample.model.Car;
import com.example.crudexample.repository.dto.CarEntity;

public interface EntityMapper {


    Car toModel(CarEntity entity);

    CarEntity toEntity(Car model);

}
