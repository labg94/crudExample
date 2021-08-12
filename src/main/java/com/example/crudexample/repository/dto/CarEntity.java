package com.example.crudexample.repository.dto;

import lombok.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;


@Value
@Document
public final class CarEntity {
    //TODO: This is the data model please add the rest of the fields
    @Id
    private final String id;

    private final String model;
    private final Integer year;
    private final Integer kilometers;

    private final LocalDateTime creationDate;

    CarEntity(String id, String model, Integer year, Integer kilometers, LocalDateTime creationDate) {
        this.id = id;
        this.model = model;
        this.year = year;
        this.kilometers = kilometers;
        this.creationDate = creationDate;
    }

    public static CarEntityBuilder builder() {
        return new CarEntityBuilder();
    }


    public static class CarEntityBuilder {
        private String id;
        private String model;
        private Integer year;
        private Integer kilometers;
        private LocalDateTime creationDate;

        CarEntityBuilder() {
            this.creationDate = LocalDateTime.now();
        }

        public CarEntityBuilder id(String id) {
            this.id = id;
            return this;
        }

        public CarEntityBuilder model(String model) {
            this.model = model;
            return this;
        }

        public CarEntityBuilder year(Integer year) {
            this.year = year;
            return this;
        }

        public CarEntityBuilder kilometers(Integer kilometers) {
            this.kilometers = kilometers;
            return this;
        }

        public CarEntity build() {
            return new CarEntity(id, model, year, kilometers, creationDate);
        }

        public String toString() {
            return "CarEntity.CarEntityBuilder(id=" + this.id + ", model=" + this.model + ", year=" + this.year + ", kilometers=" + this.kilometers + ", creationDate=" + this.creationDate + ")";
        }
    }
}