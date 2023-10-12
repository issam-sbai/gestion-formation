package com.codingtech.gestionformation.service;

import com.codingtech.gestionformation.entity.Course;

import java.util.List;

public interface CourselService {
    List<Course> getAllAppels();

    Course getAppelById(int id);

    Course saveAppel(Course appel);

    void deleteAppel(int id);
}
