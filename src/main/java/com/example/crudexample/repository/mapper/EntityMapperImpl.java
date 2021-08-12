package com.example.crudexample.repository.mapper;

import com.example.crudexample.model.Car;
import com.example.crudexample.repository.dto.CarEntity;
import org.springframework.stereotype.Component;

@Component
public class EntityMapperImpl implements EntityMapper {
    @Override
    public Car toModel(CarEntity entity) {
        return Car.builder()
                  .id(entity.getId())
                  .year(entity.getYear())
                  .model(entity.getModel())
                  .kilometers(entity.getKilometers())
                  .build();
    }

    @Override
    public CarEntity toEntity(Car model) {
        return CarEntity.builder().id(model.getId())
                        .year(model.getYear())
                        .model(model.getModel())
                        .kilometers(model.getKilometers())
                        .build();
    }
}
