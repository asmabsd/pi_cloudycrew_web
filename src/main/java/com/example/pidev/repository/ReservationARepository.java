package com.example.pidev.repository;

import com.example.pidev.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface ReservationARepository extends JpaRepository<Reservation, Integer> {
    List<Reservation> findByUserId(Integer userId);
    List<Reservation> findByActivityIdAct(Integer activityId);
    List<Reservation> findByActivityPartnerIdPart(Integer partnerId);
    List<Reservation> findByStatus(String status);
    List<Reservation> findByStartDateBetween(LocalDateTime start, LocalDateTime end);
}
