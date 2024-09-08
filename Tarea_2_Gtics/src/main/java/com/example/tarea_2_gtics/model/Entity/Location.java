package com.example.tarea_2_gtics.model.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="locations")
public class Location {

    @Id
    @Column(name="location_id",nullable = false)
    private Integer location_id;

    @Column(name="city",nullable = false)
    private String city;

    public Integer getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Integer location_id) {
        this.location_id = location_id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

