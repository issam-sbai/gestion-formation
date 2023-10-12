package com.codingtech.gestionformation.service;

import com.codingtech.gestionformation.entity.Formateur;

import java.util.List;

public interface FormateurService {
    List<Formateur> getAllFormateurs();

    Formateur getFormateurById(int id);

    Formateur saveFormateur(Formateur formateur);

    void deleteFormateur(int id);
}
