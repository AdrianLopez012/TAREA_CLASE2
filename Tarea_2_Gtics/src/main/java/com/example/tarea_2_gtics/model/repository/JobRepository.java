package com.example.tarea_2_gtics.model.repository;

import com.example.tarea_2_gtics.model.Entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
}
