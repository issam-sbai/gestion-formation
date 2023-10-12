package com.codingtech.gestionformation.entity;

import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.List;

import com.codingtech.gestionformation.security.entity.User;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Formateur extends User {

    @JsonManagedReference
    @OneToMany(mappedBy = "formateur")
    private List<Formation> formations;

    @OneToMany(mappedBy = "formateur")
    private Set<Course> courses = new HashSet<>();
}

