package com.codingtech.gestionformation.service;

import com.codingtech.gestionformation.entity.Appel;

import java.util.List;

public interface AppelService {
    List<Appel> getAllAppels();

    Appel getAppelById(int id);

    Appel saveAppel(Appel appel);

    void deleteAppel(int id);
}
