package com.example.pidev.service;


import com.example.pidev.entity.Hebergement;
import com.example.pidev.repository.HebergementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HebergementService implements IHebergementService {

    @Autowired // pour injecter des dépendances de repository ou bien (@AllArgsConstructor)
    HebergementRepository hebergementRepository;

    @Override
    public Hebergement addHebergement(Hebergement hebergement) {
        return hebergementRepository.save(hebergement);
    }

    @Override
    public List<Hebergement> getHebergements() {
        return hebergementRepository.findAll();
    }

    @Override
    public Hebergement updateHebergement(Hebergement hebergement) {
        return hebergementRepository.save(hebergement);
    }

    @Override
    public void deleteHebergement(Long hebergement_id) {
        hebergementRepository.deleteById(hebergement_id);
    }

    @Override
    public Hebergement getHebergement(Long id) {
        return hebergementRepository.findById(id).get();
    }
}
