package com.example.tarea_2_gtics.model.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="departments")
public class Department {

    @Id
    @Column(name="department_id",nullable = false)
    private Integer department_id;

    @Column(name="department_name",nullable = false,length = 30)
    private String department_name;



    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    public Integer getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}