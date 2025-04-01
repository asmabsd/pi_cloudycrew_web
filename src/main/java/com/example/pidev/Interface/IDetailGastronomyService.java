package com.example.pidev.Interface;

import com.example.pidev.entity.DetailGastronomy;

import java.util.List;

public interface IDetailGastronomyService {
    DetailGastronomy addDetailGastronomy(DetailGastronomy detailGastronomy);
    DetailGastronomy updateDetailGastronomy(DetailGastronomy detailGastronomy);
    void deleteDetailGastronomy(int id);
    List<DetailGastronomy> retrieveAllDetailGastronomies();
    DetailGastronomy retrieveDetailGastronomy(int id);
}
