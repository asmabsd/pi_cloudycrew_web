package com.example.pidev.service;

import com.example.pidev.entity.Activity;
import com.example.pidev.entity.CategoryA;

import java.util.List;
import java.util.Optional;

public interface IActivity {
    List<Activity> getAllActivities();
    Optional<Activity> getActivityById(Integer id);
    Activity saveActivity(Activity activity);
    Activity updateActivity(Activity activity);
    void deleteActivity(Integer id);
    List<Activity> getActivitiesByPartnerId(Integer partnerId);
    List<Activity> getActivitiesByCategory(CategoryA categoryA);
    List<Activity> getAvailableActivities(Boolean disponibility);
    List<Activity> getActivitiesByMaxPrice(Integer maxPrice);
}
