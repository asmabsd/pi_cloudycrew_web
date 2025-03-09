package com.example.pidev.service;

import com.example.pidev.entity.ReservationChambre;

import java.util.List;

public interface IReservationChambreService {
    ReservationChambre addReservationChambre(ReservationChambre reservationchambre);
    List<ReservationChambre> getReservationChambres();
    ReservationChambre updateReservationChambre(ReservationChambre reservationchambre);
    void deleteReservationChambre(Long reservationchambre_id);
    ReservationChambre getReservationChambre(Long id);
}
