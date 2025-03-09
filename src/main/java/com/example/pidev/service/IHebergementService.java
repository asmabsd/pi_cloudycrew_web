package com.example.pidev.service;

import com.example.pidev.entity.Hebergement;

import java.util.List;

public interface IHebergementService {
    Hebergement addHebergement(Hebergement hebergement);
    List<Hebergement> getHebergements();
    Hebergement updateHebergement(Hebergement hebergement);
    void deleteHebergement(Long hebergement_id);
    Hebergement getHebergement(Long id);
}
