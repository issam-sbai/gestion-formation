package com.codingtech.gestionformation.service;

import com.codingtech.gestionformation.entity.Prospect;

import java.util.List;

public interface ProspectService {
    List<Prospect> getAllFormations();

    Prospect getFormationById(int id);

    Prospect saveFormation(Prospect formation);

    void deleteFormation(int id);
}
