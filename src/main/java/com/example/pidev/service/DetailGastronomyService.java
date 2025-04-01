package com.example.pidev.service;

import com.example.pidev.Interface.IDetailGastronomyService;
import com.example.pidev.entity.DetailGastronomy;
import com.example.pidev.repository.DetailGastronomyRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DetailGastronomyService implements IDetailGastronomyService {
    @Autowired
    DetailGastronomyRepository detailGastronomyRepository;

    @Override
    public DetailGastronomy addDetailGastronomy(DetailGastronomy detailGastronomy) {
        return detailGastronomyRepository.save(detailGastronomy);
    }

    @Override
    public DetailGastronomy updateDetailGastronomy(DetailGastronomy detailGastronomy) {
        return detailGastronomyRepository.save(detailGastronomy);
    }

    @Override
    public void deleteDetailGastronomy(int id) {
        detailGastronomyRepository.deleteById(id);
    }

    @Override
    public List<DetailGastronomy> retrieveAllDetailGastronomies() {
        return detailGastronomyRepository.findAll();
    }

    @Override
    public DetailGastronomy retrieveDetailGastronomy(int id) {
        return detailGastronomyRepository.findById(id).orElse(null);
    }
}
