package com.codingtech.gestionformation.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Rdv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date date;
    @ManyToOne
    @JoinColumn(name = "commercial_id")
    private Commercial commercial;

    @ManyToOne
    @JoinColumn(name = "prspect_id")
    private Prospect prospect;

}
