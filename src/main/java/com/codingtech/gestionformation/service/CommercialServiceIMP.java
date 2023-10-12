package com.codingtech.gestionformation.service;

import com.codingtech.gestionformation.entity.Commercial;
import com.codingtech.gestionformation.repo.CommercialRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CommercialServiceIMP  implements  CommercialService {

    private final CommercialRepo commercialRepository;
    @Override
    public List<Commercial> getAllCommercials() {
        return commercialRepository.findAll();
    }

    @Override
    public Optional<Commercial> getCommercialById(int id) {
        return commercialRepository.findById(id);
    }

    @Override
    public Commercial saveCommercial(Commercial commercial) {
        return commercialRepository.save(commercial);
    }

    @Override
    public void deleteCommercial(int id) {
        commercialRepository.deleteById(id);
    }
}
