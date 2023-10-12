package com.codingtech.gestionformation.entity;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prospect extends Personne {


    @OneToMany(mappedBy = "prospect")
    private List<Rdv> rdvs;

    @OneToMany(mappedBy = "prospect")
    private List<Appel> appels;


}