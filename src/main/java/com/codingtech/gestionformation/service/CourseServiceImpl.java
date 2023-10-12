package com.codingtech.gestionformation.service;

import com.codingtech.gestionformation.entity.Course;
import com.codingtech.gestionformation.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CourseServiceImpl implements CourselService {

    private final CourseRepo appelRepository;

    @Autowired
    public CourseServiceImpl(CourseRepo appelRepository) {
        this.appelRepository = appelRepository;
    }

    @Override
    public List<Course> getAllAppels() {
        return appelRepository.findAll();
    }

    @Override
    public Course getAppelById(int id) {
        return appelRepository.findById(id).orElse(null);
    }

    @Override
    public Course saveAppel(Course appel) {
        return appelRepository.save(appel);
    }

    @Override
    public void deleteAppel(int id) {
        appelRepository.deleteById(id);
    }

    // Define additional methods as needed
}
