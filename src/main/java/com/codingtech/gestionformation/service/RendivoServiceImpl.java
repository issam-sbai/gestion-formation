package com.codingtech.gestionformation.service;

import com.codingtech.gestionformation.entity.Rdv;
import com.codingtech.gestionformation.repo.RdvRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RendivoServiceImpl implements RendivoService {

    private final RdvRepo rendivoRepository;

    @Autowired
    public RendivoServiceImpl(RdvRepo rendivoRepository) {
        this.rendivoRepository = rendivoRepository;
    }

    @Override
    public List<Rdv> getAllRendivos() {
        return rendivoRepository.findAll();
    }

    @Override
    public Rdv getRendivoById(int id) {
        return rendivoRepository.findById(id).orElse(null);
    }

    @Override
    public Rdv saveRendivo(Rdv rendivo) {
        return rendivoRepository.save(rendivo);
    }

    @Override
    public void deleteRendivo(int id) {
        rendivoRepository.deleteById(id);
    }

    // Define additional methods as needed
}
