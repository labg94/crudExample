package com.example.crudexample.model;

import lombok.*;


import lombok.experimental.NonFinal;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Value
@Builder
@Slf4j
public class Car {

    private String id;

    private String model;
    private int year;
    @NonFinal
    private int kilometers;

    //TODO: some cool method for DDD

    public void logDriving(int kilometersDriven) {

        kilometers += kilometersDriven;


    }

}