package com.example.crudexample.controller.mapper;


import com.example.crudexample.controller.dto.request.CarRequest;
import com.example.crudexample.controller.dto.response.CarResponse;
import com.example.crudexample.model.Car;
import org.springframework.stereotype.Component;


/**
 * You can add your custom mappers here, or you can delete this class adding a mapper library like https://mapstruct.org/ or http://modelmapper.org/
 */
@Component
public class CarMapperImpl implements CarMapper {


    @Override
    public  Car mapRequest(CarRequest request) {
        return Car.builder()
                  // TODO: add all the properties to map using builder
                  .id(request.getId())
                  .year(request.getYear())
                  .model(request.getModel())
                  .build();
    }

    @Override
    public  CarResponse mapResponse(Car model) {

        return CarResponse.builder()
                          // TODO: add all the properties to map using builder
                          .id(model.getId())
                          .year(model.getYear())
                          .model(model.getModel())
                          .build();
    }

}
