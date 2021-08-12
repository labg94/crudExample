package com.example.crudexample.controller;

import com.example.crudexample.controller.dto.request.CarRequest;
import com.example.crudexample.controller.dto.response.CarResponse;
import com.example.crudexample.controller.mapper.CarMapper;
import com.example.crudexample.controller.mapper.CarMapperImpl;
import com.example.crudexample.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;




@RestController
@RequestMapping("car")
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;
    private final CarMapper mapper;


    @GetMapping("{id}")
    public CarResponse getById(@PathVariable String id) {
        return mapper.mapResponse(carService.findById(id));
    }

    @GetMapping("{id}/drive/{kilometers}")
    public Integer driveACar(@PathVariable String id, @PathVariable Integer kilometers) {
        return carService.driveCar(id,kilometers);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable String id) {
        carService.deleteById(id);
    }


    @GetMapping
    public List<CarResponse> getAll() {
        return carService.getAll().stream().map(mapper::mapResponse).collect(Collectors.toList());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CarResponse create(@RequestBody CarRequest request) {
        return mapper.mapResponse(carService.create(mapper.mapRequest(request)));
    }

    @PutMapping
    public CarResponse update(@RequestBody CarRequest request) {
        return mapper.mapResponse(carService.update(mapper.mapRequest(request)));
    }

}