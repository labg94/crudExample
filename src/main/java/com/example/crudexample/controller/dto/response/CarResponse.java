package com.example.crudexample.controller.dto.response;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarResponse {
    //TODO: add all the field you need to response
    private String id;

    private String model;
    private Integer year;

}