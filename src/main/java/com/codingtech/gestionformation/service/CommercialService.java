package com.codingtech.gestionformation.service;

import com.codingtech.gestionformation.entity.Commercial;

import java.util.List;
import java.util.Optional;

public interface CommercialService {
    List<Commercial> getAllCommercials();

    Optional<Commercial> getCommercialById(int id);

    Commercial saveCommercial(Commercial commercial);

    void deleteCommercial(int id);
}
