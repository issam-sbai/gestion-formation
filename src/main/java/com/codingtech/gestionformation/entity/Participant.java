package com.codingtech.gestionformation.entity;

import com.codingtech.gestionformation.security.entity.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Participant extends User {

    @ManyToMany(mappedBy = "participants")
    @JsonIgnore
    private List<Formation> formations;


}
