package com.example.pidev.repository;

import com.example.pidev.entity.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewsRepository extends JpaRepository<Reviews, Integer> {
    List<Reviews> findByUserId(Integer userId);
    List<Reviews> findByPartnerIdPart(Integer partnerId);
    List<Reviews> findByRating(Integer rating);
    List<Reviews> findByVerified(Boolean verified);
}
