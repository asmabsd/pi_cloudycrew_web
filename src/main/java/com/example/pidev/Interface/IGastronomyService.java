package com.example.pidev.Interface;

import com.example.pidev.entity.DetailGastronomy;
import com.example.pidev.entity.Gastronomy;

import java.util.List;

public interface IGastronomyService {
    Gastronomy addGastronomy(Gastronomy gastronomy);
    Gastronomy updateGastronomy(Gastronomy gastronomy);
    void deleteGastronomy(int id);
    List<Gastronomy> retrieveAllGastronomies();
    Gastronomy retrieveGastronomy(int id);
    Gastronomy affectMenuToGastronomy(int idGastronomy, List<Integer> idMenus);

    DetailGastronomy addDetailGastronomyAndAffectGastronomy(DetailGastronomy detailGastronomy, int idGastronomy);
}
