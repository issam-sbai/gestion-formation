package com.codingtech.gestionformation.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String courseName;

    @ManyToOne
    @JoinColumn(name = "formation_id")
    private Formation formation;


    @ManyToOne
    @JoinColumn(name = "formateur_id")
    private Formateur formateur;





}