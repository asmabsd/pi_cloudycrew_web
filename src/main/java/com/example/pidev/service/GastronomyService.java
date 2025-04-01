package com.example.pidev.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.pidev.Interface.IGastronomyService;
import com.example.pidev.entity.DetailGastronomy;
import com.example.pidev.entity.Gastronomy;
import com.example.pidev.entity.Menu;
import com.example.pidev.repository.DetailGastronomyRepository;
import com.example.pidev.repository.GastronomyRepository;
import com.example.pidev.repository.MenuRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GastronomyService implements IGastronomyService {
    private static final Logger log = LoggerFactory.getLogger(GastronomyService.class);

    @Autowired
    GastronomyRepository gastronomyRepository;
    @Autowired
    private DetailGastronomyRepository detailGastronomyRepository;

    @Autowired
    private MenuRepository menuRepository;

    @Override
    public Gastronomy addGastronomy(Gastronomy gastronomy) {
        return gastronomyRepository.save(gastronomy);
    }

    @Override
    public Gastronomy updateGastronomy(Gastronomy gastronomy) {
        return gastronomyRepository.save(gastronomy);
    }

    @Override
    public void deleteGastronomy(int id) {
        gastronomyRepository.deleteById(id);
    }

    @Override
    public List<Gastronomy> retrieveAllGastronomies() {
        return gastronomyRepository.findAll();
    }

    @Override
    public Gastronomy retrieveGastronomy(int id) {
        return gastronomyRepository.findById(id).orElse(null);
    }



    @Override
    public Gastronomy affectMenuToGastronomy(int idGastronomy, List<Integer> idMenus) {
        log.info("ID Gastronomy: {}", idGastronomy);
        log.info("ID Menus: {}", idMenus);

        Gastronomy gastronomy = gastronomyRepository.findById(idGastronomy).orElse(null);
        List<Menu> menus = menuRepository.findAllById(idMenus);

        if (gastronomy != null && !menus.isEmpty()) { // Vérifier que la liste n'est pas vide
            for (Menu menu : menus) {
                menu.setGastronomy(gastronomy);
            }
            menuRepository.saveAll(menus);
            return gastronomy;
        }
        return null;
    }


    @Override
    public DetailGastronomy addDetailGastronomyAndAffectGastronomy(DetailGastronomy detailGastronomy, int idGastronomy) {
        Gastronomy gastronomy = gastronomyRepository.findById(idGastronomy).orElse(null);
        if (gastronomy != null) {
            detailGastronomy.setGastronomy(gastronomy);
            return detailGastronomyRepository.save(detailGastronomy);
        }
        return null;
    }
}


