package com.example.crudexample.controller.mapper;

import com.example.crudexample.controller.dto.request.CarRequest;
import com.example.crudexample.controller.dto.response.CarResponse;
import com.example.crudexample.model.Car;

public interface CarMapper {
    Car mapRequest(CarRequest request);

    CarResponse mapResponse(Car model);
}
