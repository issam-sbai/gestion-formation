package com.codingtech.gestionformation.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Formation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;
    private double prix;
    private Date date_dube;
    private Date date_fin;

    @ManyToMany
    @JoinTable(
            name = "formation_participant",
            joinColumns = @JoinColumn(name = "formation_id"),
            inverseJoinColumns = @JoinColumn(name = "participant_id")
    )
    private List<Participant> participants;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "formateur_id")
    @JsonBackReference
    private Formateur formateur;

    @OneToMany(mappedBy = "formation")
    private Set<Course> courses = new HashSet<>();
}
