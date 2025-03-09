package com.example.pidev.repository;

import com.example.pidev.entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Integer> {
    List<Activity> findByIdPartner(Integer idPartner);
    List<Activity> findByCategory(String category);
    List<Activity> findByLocation(String location);
}
