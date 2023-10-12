package com.codingtech.gestionformation.service;

import com.codingtech.gestionformation.entity.Rdv;

import java.util.List;

public interface RendivoService {
    List<Rdv> getAllRendivos();

    Rdv getRendivoById(int id);

    Rdv saveRendivo(Rdv rendivo);

    void deleteRendivo(int id);
}
