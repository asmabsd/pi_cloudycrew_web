package com.example.pidev.repository;

import com.example.pidev.entity.DetailGastronomy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailGastronomyRepository extends JpaRepository<DetailGastronomy, Integer> {}
