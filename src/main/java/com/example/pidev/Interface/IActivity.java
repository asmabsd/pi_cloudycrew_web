package com.example.pidev.Interface;

import com.example.pidev.entity.Activity;
import com.example.pidev.entity.Partner;
import com.example.pidev.entity.Reservation;
import com.example.pidev.entity.Reviews;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface IActivity {
    ///////////Reservation
    List<Reservation> getAllReservations();
    Reservation getReservationById(Integer id);
    Reservation createReservation(Reservation reservation);
    Reservation updateReservation(Integer id, Reservation reservation);
    void deleteReservation(Integer id);
    List<Reservation> getReservationsByUserId(Integer userId);
    List<Reservation> getReservationsByActivityId(Integer activityId);
    List<Reservation> getReservationsByPartnerId(Integer partnerId);
    List<Reservation> getReservationsByStatus(String status);
    List<Reservation> getReservationsByDateRange(LocalDateTime start, LocalDateTime end);
    Reservation changeReservationStatus(Integer id, String status);
    ///////Reviews
    List<Reviews> getAllReviews();
    Reviews getReviewById(Integer id);
    Reviews createReview(Reviews review);
    Reviews updateReview(Integer id, Reviews reviewDetails);
    void deleteReview(Integer id);
    List<Reviews> getReviewsByUserId(Integer userId);
    List<Reviews> getReviewsByPartnerId(Integer partnerId);
    List<Reviews> getReviewsByRating(Integer rating);
    List<Reviews> getVerifiedReviews(Boolean verified);
    Double calculateAverageRatingForPartner(Integer partnerId);
    //////// Partner
    Partner saveOrUpdatePartner(Partner partner);  // Create or Update

    List<Partner> getAllPartners();  // Retrieve all partners

    Optional<Partner> getPartnerById(Integer id);  // Retrieve by ID
    Partner updatePartner(Integer id, Partner partnerDetails);  // New Update Method

    void deletePartner(Integer id);  // Delete a partner
    ////activity
    // Add these new methods for Activity CRUD
    List<Activity> getAllActivities();
    Activity getActivityById(Integer id);
    Activity createActivity(Activity activity);
    Activity updateActivity(Integer id, Activity activityDetails);
    void deleteActivity(Integer id);
    List<Activity> getActivitiesByPartnerId(Integer partnerId);
    List<Activity> getActivitiesByCategory(String category);
    List<Activity> getActivitiesByLocation(String location);
    ////
}
