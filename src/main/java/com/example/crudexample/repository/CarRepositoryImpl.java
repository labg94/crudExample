package com.example.crudexample.repository;

import com.example.crudexample.model.Car;
import com.example.crudexample.repository.mapper.EntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class CarRepositoryImpl implements CarRepository {

    private final CarSpringRepository carSpringRepository;
    private final EntityMapper mapper;

    @Override
    public Car findById(String id) {
        return carSpringRepository.findById(id).map(mapper::toModel).orElseThrow(
                () -> new NoSuchElementException("Car with id " + id + " not found"));
    }

    @Override
    public void deleteById(String id) {
        carSpringRepository.deleteById(id);
    }

    @Override
    public List<Car> findAll() {
        return carSpringRepository.findAll().stream().map(mapper::toModel).collect(Collectors.toList());
    }

    @Override
    public Car update(Car carUpdated) {
        return mapper.toModel(carSpringRepository.save(mapper.toEntity(carUpdated)));
    }

    @Override
    public Car save(Car car) {
        return mapper.toModel(carSpringRepository.save(mapper.toEntity(car)));
    }
}
