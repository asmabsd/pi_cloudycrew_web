package com.example.pidev.service;

import com.example.pidev.entity.ReservationChambre;
import com.example.pidev.repository.ReservationChambreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ReservationChambreService implements IReservationChambreService{
    @Autowired // pour injecter des dépendances de repository ou bien (@AllArgsConstructor)
    ReservationChambreRepository reservationchambreRepository;

    @Override
    public ReservationChambre addReservationChambre(ReservationChambre reservationchambre) {
        return reservationchambreRepository.save(reservationchambre);
    }

    @Override
    public List<ReservationChambre> getReservationChambres() {
        return reservationchambreRepository.findAll();
    }

    @Override
    public ReservationChambre updateReservationChambre(ReservationChambre reservationchambre) {
        return reservationchambreRepository.save(reservationchambre);
    }

    @Override
    public void deleteReservationChambre(Long reservationchambre_id) {
        reservationchambreRepository.deleteById(reservationchambre_id);
    }

    @Override
    public ReservationChambre getReservationChambre(Long id) {
        return reservationchambreRepository.findById(id).get();
    }
}
