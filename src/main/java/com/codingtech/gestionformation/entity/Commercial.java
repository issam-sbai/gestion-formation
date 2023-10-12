package com.codingtech.gestionformation.entity;

import com.codingtech.gestionformation.security.entity.User;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Commercial extends User {

    @OneToMany(mappedBy = "commercial")
    private List<Appel> appels;

    @OneToMany(mappedBy = "commercial")
    private List<Rdv> rdvs;


}

