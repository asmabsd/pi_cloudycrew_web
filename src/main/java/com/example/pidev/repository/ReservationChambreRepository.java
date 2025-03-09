package com.example.pidev.repository;

import com.example.pidev.entity.Hebergement;
import com.example.pidev.entity.ReservationChambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationChambreRepository extends JpaRepository<ReservationChambre,Long> {
}
