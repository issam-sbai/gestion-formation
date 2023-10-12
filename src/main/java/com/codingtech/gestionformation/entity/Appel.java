package com.codingtech.gestionformation.entity;

import java.util.Date;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String commenter ;
    private Date date;


    @ManyToOne
    @JoinColumn(name = "commercial_id")
    private Commercial commercial;

    @ManyToOne
    @JoinColumn(name = "prospect_id")
    private Prospect prospect;

    @ManyToOne
    @JoinColumn(name = "rdv_id")
    private Rdv rdv;




}

