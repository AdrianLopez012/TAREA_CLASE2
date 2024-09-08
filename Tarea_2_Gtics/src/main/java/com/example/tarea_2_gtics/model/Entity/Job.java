package com.example.tarea_2_gtics.model.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="jobs")
public class Job {

    @Id
    @Column(name="job_id",nullable = false)
    private String job_id;

    @Column(name="job_title",nullable = false)
    private String job_title;

    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }
}


